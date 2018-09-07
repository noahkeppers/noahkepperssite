<template>
  <div
    class="home d-flex flex-column justify-content-center"
    role="main">
    <h1 class="sr-only">Home</h1>
    <div class="row align-items-center my-2 pb-4">
      <div class="col">
        <div class="display-4 mb-2">
          Technologist. Developer. <a href="https://youtu.be/iCvmsMzlF7o?t=1m10s">Hacker-storyteller.</a>
        </div>
        <div class="h2">
          I'm passionate about using tech to inspire human connection.
        </div>
      </div>
    </div>
    <b-card-group
      deck
      class="flex-nowrap">
      <div
        v-for="project in projects.slice(0, 2)"
        :key="project.id">
        <ProjectCard :project="project" />
      </div>
      <router-link to="/projects">
        <b-card
          bg-variant="primary"
          text-variant="white"
          class="border-0 h-100"
          role="button"
          no-body>
          <b-card-body
            id="more-projects"
            class="d-flex flex-column rounded">
            <p class="card-text h1">More projects</p>
            <ArrowIcon class="mt-auto align-self-end h-lg-50" />
          </b-card-body>
        </b-card>
      </router-link>
    </b-card-group>
  </div>
</template>

<script>
import ArrowIcon from '../../icons/arrow-right.svg'
import ProjectCard from '../projects/ProjectCard'
import ProjectCards from '../projects/projects.json'

export default {
  name: 'Home',
  components: {
    ArrowIcon,
    ProjectCard
  },
  data: function () {
    return { projects: ProjectCards }
  }
}
</script>

<style lang="scss" scoped>
@import "../../scss/card-responsive-text.scss";

.home {
  min-height: 90vh;
}

a:hover {
  text-decoration: none;
}

.h2 {
  font-weight: 300;
}

#more-projects {
  transition: background-color 0.5s ease;
}

#more-projects:hover, a:focus #more-projects {
  background-color: $link-hover-color;
}

@include media-breakpoint-down(sm) {
  .card-deck {
    flex-direction: column;
  }
}
</style>
