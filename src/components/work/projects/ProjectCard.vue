<template>
    <router-link :to="`/work/${project.id}`">
        <b-card overlay
            :img-src="require(`../../../assets/${project.imgSrc}`)"
            :img-alt="project.imgAlt"
            text-variant="black"
            :title="project.title">
          <p class="card-text">
              {{ project.desc }}
          </p>
        </b-card>
    </router-link>
</template>

<script>
export default {
  name: 'ProjectCard',
  props: ['project']
}
</script>

<style lang="scss" scoped>
.card {
  margin: 8px;
  flex-grow: 1;
}
</style>
