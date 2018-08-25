<template>
  <div class="project">
    <div class="row mb-2 d-flex flex-row align-items-baseline">
      <router-link
        v-if="prev !== ''"
        :to="`/work/${prev}`">
        <ArrowLeftIcon />
      </router-link>
      <router-link
        to="/work"
        class="mx-auto">
        <ListIcon />
      </router-link>
      <router-link
        v-if="next !== ''"
        :to="`/work/${next}`">
        <ArrowRightIcon />
      </router-link>
    </div>
    <h1 class="display-3">{{ project.title }}</h1>
    <img
      :alt="project.imgAlt"
      src="https://via.placeholder.com/1000x300"
      class="img-fluid rounded mb-3 w-100">
    <h2 class="font-weight-normal subtitle mb-2">{{ project.subtitle }}</h2>
    <p class="h4 mb-4">{{ project.desc }}</p>
    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer nec odio. Praesent libero. Sed cursus ante dapibus diam. Sed nisi. Nulla quis sem at nibh elementum imperdiet. Duis sagittis ipsum. Praesent mauris. Fusce nec tellus sed augue semper porta. Mauris massa. Vestibulum lacinia arcu eget nulla. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Curabitur sodales ligula in libero.</p>
    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer nec odio. Praesent libero. Sed cursus ante dapibus diam. Sed nisi. Nulla quis sem at nibh elementum imperdiet. Duis sagittis ipsum. Praesent mauris. Fusce nec tellus sed augue semper porta. Mauris massa. Vestibulum lacinia arcu eget nulla. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Curabitur sodales ligula in libero.</p>

  </div>
</template>

<script>
import ArrowLeftIcon from '../../../icons/arrow-left.svg'
import ArrowRightIcon from '../../../icons/arrow-right.svg'
import ListIcon from '../../../icons/list.svg'
import ProjectPages from './projects.json'

export default {
  name: 'ProjectPage',
  components: {
    ArrowLeftIcon,
    ArrowRightIcon,
    ListIcon
  },
  data: function () {
    const index = ProjectPages.findIndex((element) => {
      return element.id === this.$route.params.id
    })

    return {
      next: (index + 1) >= ProjectPages.length ? '' : ProjectPages[index + 1].id,
      prev: (index - 1) < 0 ? '' : ProjectPages[index - 1].id,
      project: ProjectPages[index]
    }
  }
}
</script>

<style lang="scss" scoped>
@import "../../../scss/constants.scss";

.subtitle {
  color: $primary;
}

svg {
  color: black;
  height: 40px;
  width: auto;
}

svg:hover {
  color: $secondary;
}
</style>
