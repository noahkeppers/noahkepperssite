<template>
  <div
    class="work"
    role="main">
    <h1 class="display-2">Work</h1>
    <router-view/>
  </div>
</template>

<script>
import Nav from '../common/Nav'

export default {
  name: 'Work',
  components: {
    Nav
  }
}
</script>

<style lang="scss" scoped>
</style>
