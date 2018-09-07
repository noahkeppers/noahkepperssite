<template>
  <div class="projects-list">
    <h1 class="display-2">Projects</h1>
    <router-link
      v-for="project in projects"
      :key="project.id"
      :to="`/projects/${project.id}`" 
      :aria-labelledby="`project-title-${project.id}`">
      <div class="row border-bottom pt-4">
        <div class="col-lg-3">
          <div class="backdrop rounded mb-4">
            <img
              :src="require(`../../assets/${project.id}/splash.jpeg`)"
              :alt="project.imgAlt"
              class="img-fluid rounded">
          </div>
        </div>
        <div class="col-lg-6 ml-lg-4">
          <h2
            :id="`project-title-${project.id}`"
            class="h1 m-0">{{ project.title }}</h2>
          <p class="h2 subtitle">{{ project.subtitle }}</p>
          <p>{{ project.desc }}</p>
        </div>
        <div class="col-lg mb-4 text-right align-self-center">
          <ArrowIcon />
        </div>
      </div>
    </router-link>
  </div>
</template>

<script>
import ArrowIcon from '../../icons/arrow-right.svg'
import ProjectCards from './projects.json'

export default {
  name: 'ProjectsList',
  components: {
    ArrowIcon
  },
  data: function () {
    return { projects: ProjectCards }
  }
}
</script>

<style lang="scss" scoped>
@import "../../scss/constants.scss";

.backdrop {
  background-color: black;
}

.subtitle {
  color: $primary;
}

img {
  width: 100%;
  height: auto;
  transition: opacity 0.5s ease;
}
.row {
  color: black;

  svg {
    width: 75px;
    height: auto;
  }
}

.row:hover, a:focus .row {
  background-color: #EEE;
  color: $secondary;
  transition: background-color 0.5s ease;

  img {
    opacity: 0.8;
  }
}
</style>
