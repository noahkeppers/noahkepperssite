<template>
    <router-link :to="`/work/${project.id}`">
        <b-card
            overlay
            :img-src="require(`../../../assets/${project.imgSrc}`)"
            :img-alt="project.imgAlt"
            text-variant="white"
            :title="project.title"
            class="mb-sm-4 mb-md-0">
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
  flex-grow: 1;
}
</style>
