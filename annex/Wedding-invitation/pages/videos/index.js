import request from '../../utils/request'
var doommList=[];
var i=0;
// 弹幕参数
class Barrage {
  constructor(text, top, time) {  //内容，顶部距离，运行时间，颜色（参数可自定义增加）
    this.text = text;
    this.top = top;
    this.time = time;
    this.color = getRandomColor();
    this.display = true;
    this.id = i++;
  }
}

// 弹幕字体颜色
function getRandomColor() {
  const rgb = []
  for (let i = 0; i < 3; ++i) {
    let color = Math.floor(Math.random() * 256).toString(16)
    color = color.length === 1 ? '0' + color : color
    rgb.push(color)
  }
  return '#' + rgb.join('')
}

Page({
  onLoad: function () {
    request('/comments/get').then(res=>{
      for (var index in res) {
        doommList.push(new Barrage( res[index].words,Math.ceil(Math.random()*100),Math.ceil(Math.random()*10)));
       }
       console.log(doommList)
      this.setData({
        danmuList: doommList
      })
    })
    

    request("/photo/get",{video:"1"})
      .then(res => {
        this.setData({
          slideList: res,
          videoUrl: res.image,
          flag: res.flag
        })
      })
      .catch(err => {
        console.log(err)
      })
     
  },
  
  onShareAppMessage() {
    return {
      title: 'video',
      path: 'page/component/pages/video/video'
    }
  },

  onReady() {
    this.videoContext = wx.createVideoContext('myVideo')
  },

  onHide() {

  },

  inputValue: '',
  data: {
    src: '',
    danmuList: [],
    batchIds: '',
    text:'',
    color:'',
    flag: false
  },

  bindInputBlur(e) {
    this.inputValue = e.detail.value
  },

  bindButtonTap() {
    const that = this
    wx.chooseVideo({
      sourceType: ['album', 'camera'],
      maxDuration: 60,
      camera: ['front', 'back'],
      success(res) {
        that.setData({
          src: res.tempFilePath
        })
      }
    })
  },

  bindVideoEnterPictureInPicture() {
    console.log('进入小窗模式')
  },

  bindVideoLeavePictureInPicture() {
    console.log('退出小窗模式')
  },

  bindPlayVideo() {
    console.log('1')
    this.videoContext.play()
  },
   // 发送弹幕
  bindSendDanmu() {
    this.videoContext.sendDanmu({
      text: " "+this.data.batchIds,
      color: getRandomColor()
    })
    console.log(this.data.batchIds)
    var s='';
    for (var index in this.data.batchIds) {
      s+=","+this.data.batchIds[index]
    }
    s = s.substring(1);
    console.log(s)
    request("/comments/add",{'words':s},'post').then(res=>{
      console.log(res);
    })
    
  },

  videoErrorCallback(e) {
    console.log('错误信息:')
    console.log(e.detail.errMsg)
  },
  checkboxChange: function (e) {
    console.log(e.detail.value)
    this.setData({
      batchIds: e.detail.value  //单个选中的值
    })
  },
 
  

})