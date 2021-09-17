import request from '../../utils/request'
// pages/bless/index.js
const app = getApp();
Page({
    /**
     * 页面的初始数据
     */
    data: {
      zanNum: 0,
      zanLog: [],
      isBless: false,
      limit: 9,
      skip: 0,
      count: 0,
      loading: false
    },
    bindgetuserinfo (e) {
      var that = this;
      this.loading = true
      wx.login({
        success (res) {
          if (res.code) {
            //发起网络请求
            request("/wx/api/wechat/openId",{"jsCode":res.code})
            .then(res=>{
          
              const obj = {
                'nickName': e.detail.userInfo.nickName,
                'avatarUrl': e.detail.userInfo.avatarUrl,
                'openId': res.openId
              }
              // 查询数据库
              // const status = await app.globalData.db.collection('bless').where({ openId: res.//result.openid }).get()
              request('/bless/get/openid',{"openId": res.openId})
              .then(res=>{
                  if(res==null){
                    // 没有祝福过
                    request("/bless/add",obj,'post')
                    .then(async res => {
                      wx.showToast({
                        title: '谢谢你的祝福',
                        icon: 'none',
                        duration: 2000
                      })
                      that.getBless()
                      that.loading = false
                    })
                    .catch(err => {
                      console.log(err);
                      that.loading = false    
                    })
                  }else {
                    console.log("已经祝福过")
                    that.setData({
                      isBless: true
                    })
                    wx.showToast({
                      title: '您已经祝福过了',
                      icon: 'none',
                      duration: 2000
                    })
                    that.loading = false          
                  }
              }).catch(err => {
                console.log(err);
                this.loading = false
              })
        
            }).catch(err => {
              console.log(err);
              this.loading = false
            })
          } else {
            console.log('登录失败！' + res.errMsg)
          }
        }
      })

    },
    async getBless () {
      var that = this;
      // const mainInfo = await app.globalData.db.collection('bless')
      //   .limit(this.data.limit)
      //   .skip(this.data.skip)
      //   .get()
      const mainInfo = await request("/bless/get");
     
      if (!mainInfo.length) {
        wx.showToast({
          title: '已经到底了',
          icon: 'none',
          duration: 2000
        })
      } else {
        let zanNum = mainInfo.length
        let zanLog = mainInfo
        
        that.setData({
          zanNum: zanNum,
          zanLog: zanLog
        })
        const skip = mainInfo.length + that.data.skip
        if (that.data.limit === 9) {
          that.setData({
            limit: 10,
            count: mainInfo.length,
            skip: skip
          })
        } else {
          that.setData({
            limit: 9,
            count: mainInfo.length,
            skip: skip
          })
        }
      }
    },
    /**
     * 生命周期函数--监听页面加载
     */
    onLoad: async function (options) {
      await this.getBless()
    },

    /**
     * 生命周期函数--监听页面初次渲染完成
     */
    onReady: function() {

    },

    /**
     * 生命周期函数--监听页面显示
     */
    onShow: function() {
      
    },

    /**
     * 生命周期函数--监听页面隐藏
     */
    onHide: function() {

    },

    /**
     * 生命周期函数--监听页面卸载
     */
    onUnload: function() {

    },

    /**
     * 页面相关事件处理函数--监听用户下拉动作
     */
    onPullDownRefresh: function() {},
    /**
     * 页面上拉触底事件的处理函数
     */
    onReachBottom: function() {

    },

    /**
     * 用户点击右上角分享
     */
    onShareAppMessage: function() {
      app.shareHandle();
    }
})