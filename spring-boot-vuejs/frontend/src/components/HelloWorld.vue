
<template>
  <div class="bootstrap">

    <h1>{{ msg }}</h1>
    <h5>REST service call are easy to do with Vue.js, if you know how to do it.</h5>
    <p></p>
    <h6><b-badge variant="primary"> Let´s go!</b-badge> Call a Spring Boot REST backend service, by clicking a button:</h6>
    <p></p>
    <b-btn variant="success" @click="callRestService(); showResponse=true" id="btnCallHello">/hello (GET)</b-btn>
    <p></p>
    <h4>Backend response: <b-alert :show="showResponse" dismissible @dismissed="showResponse=false">{{ response }}</b-alert></h4>

 </div>
</template>

<script>
import {AXIOS} from './http-common'

/* eslint-disable */
export default {
  name: 'HelloWorld',
  data () {
    return {
      msg: 'HowTo call REST-Services:',
      response: '',
      showResponse: false,
      errors: []
    }
  },

    created () {
      this.callRestService()
    },
    watch: {
      '$route': 'callRestService'
    },

  methods: {
    // Fetches posts when the component is created.
    callRestService () {
      AXIOS.get('api/hello')
        .then(response => {
          // JSON responses are automatically parsed.
            this.response = response.data
           console.log(response.data)
        })
        .catch(e => {
          this.errors.push(e)
        })
    }
}
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
