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
      name: 'Home',
      path: '/',
      component: Home
    },
    {
      path: '/projects',
      component: ProjectsMain,
      children: [
        {
          name: 'Projects List',
          path: '',
          component: ProjectsList
        },
        {
          name: 'Project Page',
          path: ':id',
          component: ProjectPage
        }
      ]
    },
    {
      name: 'About',
      path: '/about',
      component: About
    },
    {
      name: 'Not Found',
      path: '*',
      component: NotFound
    }
  ]
})
