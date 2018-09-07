import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/home/Home'
import ProjectsMain from '@/components/projects/ProjectsMain'
import ProjectsList from '@/components/projects/ProjectsList'
import ProjectPage from '@/components/projects/ProjectPage'
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
      path: '/projects',
      component: ProjectsMain,
      children: [
        {
          path: '',
          component: ProjectsList
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
