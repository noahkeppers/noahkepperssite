<template>
  <div
    class="about"
    role="main">
    <h1 class="display-2 mb-3">About</h1>
    <div class="row">
      <div class="col-lg mb-4">
        <img
          class="rounded"
          src="../../assets/me.jpeg"
          alt="Headshot of Noah Keppers">
      </div>
      <div
        id="bio"
        class="col-lg">
        <div>
          <p>Hi, I’m Noah Keppers! I’m a creative technologist and developer interested in the intersection between storytelling, technology, and art.</p>

          <p>I’m currently pursuing a Bachelors of Science in Computer Science at <a href="https://msu.edu">Michigan State University</a> with a planned graduation date of December 2018.</p>

          <p>While in school, I’ve worked with the <a href="https://msu.edu/~dobbinsa/">Theatre Engine</a> and <a href="https://www.cse.msu.edu/dance/index.html">Dancing Computer</a> teams on interdisciplinary research combining Computer Science and Theatre.
          I’ve also worked as an intern at <a href="https://www.google.com/">Google</a> and <a href="https://www.twobulls.com/">Two Bulls</a> and participated in the <a href="http://hackny.org/fellows/">hackNY Fellows Program.</a></p>
        </div>
        <hr>
        <Social />
      </div>
    </div>
  </div>
</template>

<script>
import Nav from '../common/Nav'
import Social from '../common/Social'

export default {
  name: 'About',
  components: {
    Nav,
    Social
  }
}
</script>

<style lang="scss" scoped>
</style>
