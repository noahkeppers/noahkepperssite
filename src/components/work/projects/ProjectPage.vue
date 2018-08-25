<template>
  <div class="project">
    <p>This page will eventually talk about {{ project.title }} with ID: {{ project.id }}.</p>
  </div>
</template>

<script>
import ProjectPages from './projects.json'

export default {
  name: 'ProjectPage',
  data: function () {
    return { project: ProjectPages.find((element) => {
      return element.id === this.$route.params.id
    }) }
  }
}
</script>

<style lang="scss" scoped>
</style>
