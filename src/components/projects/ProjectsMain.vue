<template>
  <div
    class="projects"
    role="main">
    <transition
      name="fade"
      mode="out-in"
      appear="true"
      @beforeLeave="beforeLeave"
      @enter="enter"
      @afterEnter="afterEnter">
      <router-view :key="$route.fullPath"/>
    </transition>
  </div>
</template>

<script>
import Nav from '../common/Nav'
import transitionsMixin from '../../mixins/transitions'

export default {
  name: 'ProjectsMain',
  components: {
    Nav
  },
  mixins: [transitionsMixin]
}
</script>

<style lang="scss" scoped>
</style>
