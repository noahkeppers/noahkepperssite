<template>
  <div class="projects">
    <div class="row">
      <div class="col-md-6" v-for="(col, index) in cols" :key="`${index}`">
        <ProjectCard v-for="project in col" :key="project.id" :project="project" />
      </div>
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
    let cols = []
    const numPerCol = Math.ceil((ProjectCards.length / 2))

    let start = 0
    while (start < ProjectCards.length) {
      cols.push(ProjectCards.slice(start, start + numPerCol))
      start = start + numPerCol
    }
    return { cols: cols }
  }
}
</script>

<style lang="scss" scoped>
</style>
