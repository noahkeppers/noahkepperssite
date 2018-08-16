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

export default {
  name: 'App',
  components: {
    Nav
  },
  methods: {
    // Height animation JS + CSS from https://markus.oberlehner.net/blog/vue-router-page-transitions/
    beforeLeave (element) {
      this.prevHeight = getComputedStyle(element).height
    },
    enter (element) {
      const { height } = getComputedStyle(element)

      element.style.height = this.prevHeight

      setTimeout(() => {
        element.style.height = height
      })
    },
    afterEnter (element) {
      element.style.height = 'auto'
    }
  }
}
</script>

<style>
a {
  color: #57886C;
  text-decoration: none;
  transition: 50ms;
}

a:hover {
  color: #27583C;
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
