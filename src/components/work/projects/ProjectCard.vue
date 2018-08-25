<template>
  <router-link :to="`/work/${project.id}`">
    <b-card
      :img-src="require(`../../../assets/${project.id}/splash.jpeg`)"
      :img-alt="project.imgAlt"
      text-variant="white"
      class="border-0 h-100 mb-2"
      no-body>
      <b-card-body
        overlay
        class="d-flex flex-column rounded">
        <p class="card-text h1">{{ project.title }}</p>
        <ArrowIcon class="mt-auto align-self-end h-lg-50" />
      </b-card-body>
    </b-card>

  </router-link>
</template>

<script>
import ArrowIcon from '../../../icons/arrow-right.svg'

export default {
  name: 'ProjectCard',
  components: {
    ArrowIcon
  },
  props: {
    project: {
      type: Object,
      default: function () {
        return {}
      }
    }
  }
}
</script>

<style lang="scss" scoped>
@import "../../../scss/card-responsive-text.scss";

.card {
  flex-grow: 1;
  background-color: black;

  img {
    transition: filter 0.25s ease;
  }

  .card-body {
    visibility: hidden;
    opacity: 0;
    transition: opacity 0.25s ease;
  }
}

.card:hover {
  .card-body {
    visibility: visible;
    opacity: 1;
  }

  img {
    opacity: 0.8;
  }
}

img {
  background:
      linear-gradient(
      rgba(0, 0, 0, 0.5),
      rgba(0, 0, 0, 0.5)
    );
}
</style>
