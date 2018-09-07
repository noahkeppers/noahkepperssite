<template>
  <div id="app">
    <Nav />
    <div class="container">
      <transition
        name="fade"
        mode="out-in"
        @beforeLeave="beforeLeave"
        @enter="enter"
        @afterEnter="afterEnter">
        <router-view/>
      </transition>
    </div>
  </div>
</template>

<script>
import Nav from './components/common/Nav'
import transitionsMixin from './mixins/transitions'

export default {
  name: 'App',
  components: {
    Nav
  },
  mixins: [transitionsMixin]
}
</script>

<style lang="scss">
  @import "scss/constants.scss";
  @import "../node_modules/bootstrap/scss/bootstrap.scss";
  @import '../node_modules/bootstrap-vue/dist/bootstrap-vue.css';

a {
  color: $primary;
  text-decoration: none;
  transition: 50ms;
}

a:hover, a:focus {
  text-decoration: none;
}

.fade-enter-active,
.fade-leave-active {
  transition-duration: 0.3s;
  transition-property: opacity;
  transition-property: height, opacity;
  transition-timing-function: ease;
  overflow: hidden;
}

.fade-enter,
.fade-leave-active {
  opacity: 0
}
</style>
