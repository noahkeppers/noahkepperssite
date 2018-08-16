<template>
    <nav>

        <b-navbar toggleable="md" type="light" variant="light">

  <b-navbar-toggle target="nav_collapse"></b-navbar-toggle>

  <b-navbar-brand href="#">
      <img class="mr-1" src="../../assets/signature.png">
    </b-navbar-brand>

  <b-collapse is-nav id="nav_collapse">

    <b-navbar-nav class="ml-auto">
        <b-nav-item to="/" exact>Home</b-nav-item>
      <b-nav-item to="/projects">Projects</b-nav-item>
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

<style scoped>

img {
    height: 34px;
    width: auto;
}

.navbar {
    background-color: transparent !important;
}

.active {
    border-bottom: 2px solid #57886C;
}

.nav-link {
    padding: 0 !important;
    margin-left: 8px;
    margin-right: 8px;
    transition: 50ms;
}

.nav-link:hover {
    border-bottom: 2px solid #57886C;
}
</style>
