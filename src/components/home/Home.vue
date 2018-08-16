<template>
  <div class="home d-flex flex-column justify-content-center" role="main">
    <h1 class="sr-only">Home</h1>
    <div class="row align-items-center my-2 pb-4">
      <div class="col">
        <div class="display-4">
          <p>Technologist. Developer. <a href="https://www.ted.com/talks/brene_brown_on_vulnerability">Hacker-storyteller.</a></p>
        </div>
        <div class="h2">
          I'm passionate about pushing the boundaries of tech to create connections and embrace our shared humanity.
        </div>
      </div>
    </div>
    <b-card-group deck>
      <b-card overlay
          bg-variant="primary-bg-gradient"
          img-src="https://picsum.photos/388/198/?image=36"
          img-alt="Card Image"
          text-variant="white"
          title="Image Overlay"
          sub-title="Subtitle">
        <p class="card-text">
            Some quick example text to build on the card and make
            up the bulk of the card's content.
        </p>
      </b-card>
      <router-link to="/work">
        <b-card bg-variant="primary"
                text-variant="white"
                class="border-0"
                role="button"
                no-body>
          <b-card-body class="d-flex flex-column rounded" id="more-projects">
            <p class="card-text h1">More projects</p>
            <ArrowIcon class="icon mt-auto align-self-end" />
          </b-card-body>
        </b-card>
      </router-link>
    </b-card-group>
  </div>
</template>

<script>
import Nav from '../common/Nav.vue'
import ArrowIcon from '../../icons/arrow-right.svg'

export default {
  name: 'Home',
  components: {
    Nav,
    ArrowIcon
  }
}
</script>

<style lang="scss" scoped>
@import "../../scss/constants.scss";

.home {
  min-height: 90vh;
}

.icon {
  width: 100px;
  height: auto;
}

.h2 {
  font-weight: 300;
}

.card {
  height: 300px;
}

#more-projects {
  transition: background-color 0.5s ease;
}

#more-projects:hover {
  background-color: $link-hover-color;
}
</style>
