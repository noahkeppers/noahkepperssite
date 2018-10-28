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
    },
    {
      path: '/capstone-site',
      beforeEnter () { location.href = 'http://www.capstone.cse.msu.edu/2018-08/projects/ford/' }
    },
    {
      path: '/capstone-github',
      beforeEnter () { location.href = 'https://github.com/morga206/CapstoneTeamFord' }
    },
    {
      path: '/dc-paper',
      beforeEnter () { location.href = 'https://www.emeraldinsight.com/doi/full/10.1108/IJPCC-02-2017-0012' }
    },
    {
      path: '/dc-poster',
      beforeEnter () { location.href = '/static/dc-poster.pdf' }
    }
  ]
})
