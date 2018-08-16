<template>
  <div class="projects">
      <h1>Projects</h1>
      <div class="projects-grid">
        <div class="project"></div>
        <div class="project"></div>
        <div class="project"></div>
        <div class="project"></div>
        <div class="project"></div>
        <div class="project"></div>
      </div>
  </div>
</template>

<script>
import Nav from '../common/Nav'

export default {
  name: 'Projects',
  components: {
    Nav
  }
}
</script>

<style scoped>
.projects-grid {
  display: flex;
  flex-flow: row wrap;
  justify-content: center;

  margin-bottom: 1em;
}

.project {
  width: 150px;
  height: 150px;
  outline: 1px grey solid;
  margin: 1em;
}
</style>
