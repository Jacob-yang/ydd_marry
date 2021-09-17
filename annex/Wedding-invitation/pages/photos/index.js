import request from '../../utils/request'
//index.js
//获取应用实例
const app = getApp()

Page({
  data: {
    slideList: [],
  },  
  onLoad: function () {
    // app.globalData.db.collection('photos').limit(20).get()
    request("/photo/get")
      .then(res => {
        console.log(res)
        this.setData({
          slideList: res
        })
      })
      .catch(err => {
        console.log(err)
      })
  },
  onReady: function () {
    // 页面渲染完成
  },
  onShow: function () {
    // 页面显示
  },
  onHide: function () {
    // 页面隐藏
  },
  onUnload: function () {
    // 页面关闭
  },
  onShareAppMessage: function (res) {
    app.shareHandle();
  }
})
