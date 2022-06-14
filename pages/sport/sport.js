// pages/sport/sport.js
Page({

 
  /**
   * 页面的初始数据
   */
  data: {
    imgUrls: ['https://tse1-mm.cn.bing.net/th/id/R-C.7c7b7597246301383f595807a9ba756c?rik=8LgNQrmmq7zoMQ&riu=http%3a%2f%2fimage.qianye88.com%2fpic%2fd54f9b67f50eb32170ffd45851525efe&ehk=PbClyiO9vgANseiSoYBQfLj5WMWXXeKY%2fcySoKhNkaA%3d&risl=&pid=ImgRaw&r=0',
    'https://tse1-mm.cn.bing.net/th/id/R-C.4a9ec4b26da40a17835135346b801dc3?rik=FJXuCMPZonef6g&riu=http%3a%2f%2fimage.qianye88.com%2fpic%2f8a909d14b44307999015a2056ec06adb&ehk=5QR3Qtl1LYlt%2b5J68YhHUrTsBUSNEfNygDO3jD9eJDU%3d&risl=&pid=ImgRaw&r=0',
    'https://desk-fd.zol-img.com.cn/t_s960x600c5/g5/M00/0C/06/ChMkJlcMnFmIR_neAAW2HWCqjjkAAPwSgKb9TsABbY1074.jpg'
      ],
      indicatorDots: false,
      autoplay: true,
      interval: 5000,
      duration: 1000
  },

  changeIndicatorDots: function (e) {
    this.setData({
     indicatorDots: !this.data.indicatorDots
    })
   },
   changeAutoplay: function (e) {
    this.setData({
     autoplay: !this.data.autoplay
    })
   },
   intervalChange: function (e) {
    this.setData({
     interval: e.detail.value
    })
   },
   durationChange: function (e) {
    this.setData({
     duration: e.detail.value
    })
   },
  
  

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad(options) {

  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady() {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow() {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide() {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload() {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh() {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom() {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage() {

  }
})