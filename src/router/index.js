import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/home/Home'
import Work from '@/components/work/Work'
import Projects from '@/components/work/projects/Projects'
import ProjectPage from '@/components/work/projects/ProjectPage'
import About from '@/components/about/About'
import NotFound from '@/components/not-found/NotFound'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/',
      component: Home
    },
    {
      path: '/work',
      component: Work,
      children: [
        {
          path: '',
          component: Projects
        },
        {
          path: ':id',
          component: ProjectPage
        }
      ]
    },
    {
      path: '/about',
      component: About
    },
    {
      path: '*',
      component: NotFound
    }
  ]
})
