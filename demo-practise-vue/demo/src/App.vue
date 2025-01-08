<template>
  <div>
    <!-- <button @click="fetchData">Fetch Data</button> -->
    <input v-model="loginForm.username" placeholder="账号" />
    <p>输入的内容是: {{ loginForm.username }}</p>

    <input v-model="loginForm.password" placeholder="密码" />
    <p>输入的内容是: {{ loginForm.password }}</p>
    <button @click="handleLogin">登录</button>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: 'MyComponent',
  data() {
    return {
      loginForm: {
        username: "admin",
        password: "admin123",
        rememberMe: false,
        code: "",
        uuid: ""
      },
    }
  },
  methods: {
    // fetchData() {
    //   axios.get('/api/data')
    //     .then(response => {
    //       console.log(response.data);
    //     })
    //     .catch(error => {
    //       console.error(error);
    //     });
    // }
    handleLogin() {
      axios.get('/api/login', {
        params: {
          name: this.loginForm.username,
          password: this.loginForm.password
        }
      })
        .then(response => {
          console.log(response.data);
        })
        .catch(error => {
          console.error(error);
        });
    }
  }
};
</script>
