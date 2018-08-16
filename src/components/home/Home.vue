<template>
  <div class="home">
    <b-jumbotron>
      <div class="row">
        <div class="col-auto">
          <img class="rounded" src="../../assets/me.jpeg">
        </div>
        <div class="col align-self-center">
          <h1>Noah Keppers</h1>
          <h2>Developer. Creative technologist. <a href="https://www.ted.com/talks/brene_brown_on_vulnerability">Hacker-storyteller.</a> </h2>
        </div>
      </div>
    </b-jumbotron>
  </div>
</template>

<script>
import Nav from '../common/Nav.vue'

export default {
  name: 'Home',
  components: {
    Nav
  }
}
</script>

<style scoped>
h2 {
  font-size: 1.5em;
}

.jumbotron {
  background-color: transparent !important;
}
</style>
