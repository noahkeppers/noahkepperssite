<template>
  <div class="home">
    <img src="../../assets/me.jpeg">
    <h1>Noah Keppers</h1>
    <Social />
    <p>Computer Science student, technologist, and <a href="https://www.ted.com/talks/brene_brown_on_vulnerability">hacker-storyteller.</a></p>
    <Nav />
  </div>
</template>

<script>
import Social from './Social.vue'
import Nav from '../common/Nav.vue'

export default {
  name: 'Home',
  components: {
    Social,
    Nav
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.home {
  text-align: center;
}
</style>
