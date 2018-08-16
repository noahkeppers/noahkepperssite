import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/home/Home'
import Work from '@/components/work/Work'
import About from '@/components/about/About'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      component: Home
    },
    {
      path: '/work',
      component: Work
    },
    {
      path: '/about',
      component: About
    }
  ]
})
