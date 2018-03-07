import axios from 'axios'
/* eslint-disable */
export const AXIOS = axios.create({
  baseURL: 'http://localhost:8080',
  headers: {
    'Access-Control-Allow-Origin': 'http://localhost:8081'
  }
})
