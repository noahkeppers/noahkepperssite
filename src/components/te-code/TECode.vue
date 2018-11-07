<template>
  <div
    class="te-code"
    role="main">
    <h1 class="display-2 mb-3">Theatre Engine: Puzzle</h1>
    <h2>System Architecture</h2>
    <figure class="figure w-75">
      <a :href="require(`../../assets/te/diagram.pdf`)">
        <img
          :src="require(`../../assets/te/diagram.png`)"
          alt="Theatre Engine: Puzzle UML Diagram (click for PDF)"
          class="img-fluid mb-3 figure-img">
      </a>
      <figcaption class="figure-caption">Theatre Engine: Puzzle UML Diagram (click for PDF)</figcaption>
    </figure>
    <h2
      ref="srFocus"
      class="mb-3">PuzzleScene.java</h2>
    <VuePrism language="java">{{ code }}</VuePrism>
  </div>
</template>

<script>
import '../../../node_modules/prismjs/prism'
import '../../../node_modules/prismjs/components/prism-java'
import '../../../node_modules/prismjs/themes/prism.css'

import Nav from '../common/Nav'
import VuePrism from 'vue-prism-component'
import puzzle from '../../assets/te/PuzzleScene.java'

export default {
  name: 'TECode',
  components: {
    Nav,
    VuePrism
  },
  data: function () {
    return { code: puzzle }
  }
}
</script>

<style lang="scss" scoped>
</style>
