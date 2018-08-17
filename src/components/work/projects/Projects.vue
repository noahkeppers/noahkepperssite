<template>
  <div class="projects">
    <div class="d-flex flex-wrap" v-for="project in projects" :key="project.id">
        <ProjectCard :project="project" />
    </div>
  </div>
</template>

<script>
import ProjectCard from './ProjectCard'
import ProjectCards from './project-cards.json'

export default {
  name: 'Projects',
  components: {
    ProjectCard
  },
  data: function () {
    return { projects: ProjectCards }
  }
}
</script>

<style lang="scss" scoped>
.card {
  margin: 8px;
  flex-grow: 1;
}
</style>
