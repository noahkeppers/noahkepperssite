<template>
  <div
    class="te-code"
    role="main">
    <h1
      ref="srFocus"
      class="display-2 mb-3">PuzzleScene.java</h1>
    <VuePrism language="java">{{ code }}</VuePrism>
  </div>
</template>

<script>
import '../../../node_modules/prismjs/prism'
import '../../../node_modules/prismjs/components/prism-java'
import '../../../node_modules/prismjs/themes/prism.css'

import Nav from '../common/Nav'
import VuePrism from 'vue-prism-component'
import puzzle from '../../assets/PuzzleScene.java'

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
