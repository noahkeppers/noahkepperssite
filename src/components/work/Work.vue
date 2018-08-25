<template>
  <div
    class="work"
    role="main">
    <transition
      name="fade"
      mode="out-in"
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
  name: 'Work',
  components: {
    Nav
  },
  mixins: [transitionsMixin]
}
</script>

<style lang="scss" scoped>
</style>
