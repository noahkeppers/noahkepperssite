const focusMixin = {
  async beforeRouteEnter (to, from, next) {
    // Reset screen reader focus on route change
    if (from.name === null) {
      next()
    } else {
      next(vm => {
        vm.$refs.srFocus.setAttribute('tabindex', '-1')
        vm.$refs.srFocus.focus()
      })
    }
  }
}

export default focusMixin
