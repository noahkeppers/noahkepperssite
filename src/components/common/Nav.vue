<template>
  <nav role="navigation">
    <b-navbar
      toggleable="md"
      type="light"
      variant="light">
      <b-navbar-brand to="/">
        <img
          src="../../assets/logo.png"
          alt="Logo displaying a stylized letter N">
        Noah Keppers
      </b-navbar-brand>

      <b-navbar-toggle target="nav_collapse" />

      <b-collapse
        id="nav_collapse"
        is-nav>
        <b-navbar-nav class="ml-auto">
          <b-nav-item
            to="/"
            exact>
            Home
          </b-nav-item>
          <b-nav-item to="/work">Work</b-nav-item>
          <b-nav-item to="/about">About</b-nav-item>
          <b-nav-item href="/static/resume.pdf">Resume</b-nav-item>
        </b-navbar-nav>
      </b-collapse>
    </b-navbar>
  </nav>
</template>

<script>
export default {
  name: 'Nav'
}
</script>

<style lang="scss" scoped>
@import "../../scss/constants.scss";
@import "../../../node_modules/bootstrap/scss/bootstrap.scss";

img {
    height: 34px !important;
    width: auto;
}

.navbar {
    background-color: transparent !important;
}

.navbar-brand {
  border-bottom: none !important;
}

@include media-breakpoint-up(md) {
    .nav-link {
        padding: 0 !important;
        margin-left: 8px;
        margin-right: 8px;
        transition: 50ms;
        color: #666666 !important;
    }

    .nav-link:hover {
        border-bottom: 2px solid $primary;
        color: black !important;
    }

    a.active {
        border-bottom: 2px solid $primary;
        color: black !important;
    }
}
</style>
