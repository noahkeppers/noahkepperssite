<template>
    <div class="nav">
        <div v-if="this.$route.path == '/'">
            <router-link to="/projects">Projects</router-link> // <router-link to="/about">About</router-link> // <a href="/static/resume.pdf">Resume</a>
        </div>
        <div v-else>
            <router-link to="/">Back</router-link>
        </div>
    </div>
</template>

<script>
export default {
  name: 'Nav'
}
</script>

<style scoped>
.nav {
    text-align: center;
}
</style>
