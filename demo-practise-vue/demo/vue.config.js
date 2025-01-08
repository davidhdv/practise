const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  devServer: {
    open: true,
    https: false,
    proxy:{
      '/api': {
      target: 'http://127.0.0.1:8080',
      ws: true,
      changOrigin: true,  //允许跨域
      secure: true,
      pathRewrite: {
        '^/api': ''  //路径
      }
}

    }
  }
})
