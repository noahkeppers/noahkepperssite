<template>
  <div class="project container">
    <nav class="row mb-2 d-flex flex-row align-items-baseline">
      <router-link
        v-if="prev !== ''"
        :to="`/projects/${prev}`"
        aria-label="Previous Project">
        <ArrowLeftIcon />
      </router-link>
      <router-link
        to="/projects"
        class="mx-auto"
        aria-label="Projects List">
        <ListIcon />
      </router-link>
      <router-link
        v-if="next !== ''"
        :to="`/projects/${next}`"
        aria-label="Next Project">
        <ArrowRightIcon />
      </router-link>
    </nav>
    <h1
      ref="srFocus"
      class="display-3">{{ project.title }}</h1>
    <img
      :src="require(`../../assets/${project.id}/splash.jpeg`)"
      :alt="project.imgAlt"
      class="img-fluid rounded mb-3 w-100">
    <p class="font-weight-normal subtitle mb-0 h2">{{ project.subtitle }}</p>
    <p class="h3">{{ project.desc }}</p>
    <b-btn
      variant="primary"
      size="lg">Project Home</b-btn>
    <b-btn
      variant="primary"
      size="lg">Paper</b-btn>
    <hr class="mb-4">
    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer nec odio. Praesent libero. Sed cursus ante dapibus diam. Sed nisi. Nulla quis sem at nibh elementum imperdiet. Duis sagittis ipsum. Praesent mauris. Fusce nec tellus sed augue semper porta. Mauris massa. Vestibulum lacinia arcu eget nulla. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Curabitur sodales ligula in libero.</p>
    <div class="row">
      <div class="col-md">
        <figure class="figure">
          <img
            :src="require(`../../assets/${project.id}/splash.jpeg`)"
            :alt="project.imgAlt"
            class="img-fluid rounded mb-3 w-100 figure-img">
          <figcaption class="figure-caption">Something's going on here idk</figcaption>
        </figure>
      </div>
      <div class="col-md">
        <figure class="figure">
          <img
            :src="require(`../../assets/${project.id}/splash.jpeg`)"
            :alt="project.imgAlt"
            class="img-fluid rounded mb-3 w-100 figure-img">
          <figcaption class="figure-caption">Something's going on here idk</figcaption>
        </figure>
      </div>
    </div>
  </div>
</template>

<script>
import ArrowLeftIcon from '../../icons/arrow-left.svg'
import ArrowRightIcon from '../../icons/arrow-right.svg'
import ListIcon from '../../icons/list.svg'
import ProjectPages from './projects.json'
import focusMixin from '../../mixins/focus'

export default {
  name: 'ProjectPage',
  components: {
    ArrowLeftIcon,
    ArrowRightIcon,
    ListIcon
  },
  mixins: [focusMixin],
  data: function () {
    const index = ProjectPages.findIndex((element) => {
      return element.id === this.$route.params.id
    })

    return {
      next: (index + 1) >= ProjectPages.length ? '' : ProjectPages[index + 1].id,
      prev: (index - 1) < 0 ? '' : ProjectPages[index - 1].id,
      project: ProjectPages[index]
    }
  },
  mounted () {
    window.addEventListener('keyup', this.goNextOrPrev)
  },
  destroyed () {
    window.removeEventListener('keyup', this.goNextOrPrev)
  },
  methods: {
    goNextOrPrev (e) {
      if (e.keyCode === 39 && this.next !== '') {
        this.$router.push(`/projects/${this.next}`)
      } else if (e.keyCode === 37 && this.prev !== '') {
        this.$router.push(`/projects/${this.prev}`)
      }
    }
  }
}
</script>

<style lang="scss" scoped>
@import "../../scss/constants.scss";
@import "../../../node_modules/bootstrap/scss/bootstrap.scss";

@include media-breakpoint-up(lg) {
  .project {
    width: 80%;
  }
}

.subtitle {
  color: $primary;
}

svg {
  color: black;
  height: 40px;
  width: auto;
}

svg:hover, a:focus svg {
  color: $secondary;
}
</style>
