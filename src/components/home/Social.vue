<template>
  <div class="social">
    <a href="https://www.facebook.com/noahkeppers"><FacebookLogo class="icon" id="facebook" /></a>
    <a href="https://www.linkedin.com/in/noah-keppers/"><LinkedinLogo class="icon" id="linkedin" /></a>
    <a href="https://twitter.com/NoahKeppers"><TwitterLogo class="icon" id="twitter"/></a>
    <a href="https://github.com/noahkeppers"><GithubLogo class="icon" id="github" /></a>
  </div>
</template>

<script>
import FacebookLogo from '../../icons/facebook.svg'
import GithubLogo from '../../icons/github.svg'
import LinkedinLogo from '../../icons/linkedin.svg'
import TwitterLogo from '../../icons/twitter.svg'

export default {
  name: 'Social',
  components: {
    FacebookLogo,
    GithubLogo,
    LinkedinLogo,
    TwitterLogo
  }
}
</script>

<style scoped>
.icon {
  width: 56px;
  height: 56px;
  transition: fill 0.5s ease;
}

#facebook:hover {
  fill: #3B5998;
}

#github:hover {
  fill: #6e5494;
}

#linkedin:hover {
  fill: #0077B5;
}

#twitter:hover {
  fill: #55acee;
}
</style>
