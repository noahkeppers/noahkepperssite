const transitionsMixin = { methods:
  {
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

export default transitionsMixin
