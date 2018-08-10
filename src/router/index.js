import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/home/Home'
import Projects from '@/components/projects/Projects'
import About from '@/components/about/About'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      component: Home
    },
    {
      path: '/projects',
      component: Projects
    },
    {
      path: '/about',
      component: About
    }
  ]
})
