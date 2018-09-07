<template>
  <div
    class="not-found"
    role="main">
    <div class="row">
      <div class="col">
        <p
          id="text-404"
          class="display-1 font-weight-bold mb-0 mt-4">404 Not Found</p>
        <p class="display-4 mb-4">Whoops! There isn't a page at that URL.</p>
        <b-btn
          id="home"
          variant="primary"
          size="lg"
          class="mr-2"
          to="/">Home</b-btn>
        <b-btn
          variant="primary"
          size="lg"
          @click="back">Go Back</b-btn>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'NotFound',
  methods: {
    back: function (event) {
      this.$router.go(-1)
    }
  }
}
</script>

<style lang="scss" scoped>
@import "../../scss/constants.scss";

.not-found {
  height: inherit;
}

#text-404 {
  color: $primary !important;
}

#home {
  background-color: $primary;
  border-color: $primary;
}

#home:hover, #home:focus {
  background-color: $link-hover-color;
  border-color: $link-hover-color;
}
</style>
