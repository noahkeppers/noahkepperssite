<template>
  <div class="social">
    <a
      href="https://www.facebook.com/noahkeppers"
      aria-label="facebook">
      <FacebookLogo
        id="facebook"
        class="icon" />
    </a>
    <a
      href="https://www.linkedin.com/in/noah-keppers/"
      aria-label="linkedin">
      <LinkedinLogo
        id="linkedin"
        class="icon" />
    </a>
    <a
      href="https://twitter.com/NoahKeppers"
      aria-label="twitter">
      <TwitterLogo
        id="twitter"
        class="icon"/>
    </a>
    <a
      href="https://github.com/noahkeppers"
      aria-label="github">
      <GithubLogo
        id="github"
        class="icon" />
    </a>
    <a
      :href="decryptEmail('bWFpbHRvOm5rZXBwZXJzQGdtYWlsLmNvbQ==')"
      aria-label="email">
      <EmailLogo
        id="email"
        class="icon" />
    </a>
  </div>
</template>

<script>
import FacebookLogo from '../../icons/facebook.svg'
import GithubLogo from '../../icons/github.svg'
import LinkedinLogo from '../../icons/linkedin.svg'
import TwitterLogo from '../../icons/twitter.svg'
import EmailLogo from '../../icons/email.svg'

export default {
  name: 'Social',
  components: {
    FacebookLogo,
    GithubLogo,
    LinkedinLogo,
    TwitterLogo,
    EmailLogo
  },
  methods: {
    decryptEmail (text) {
      return atob(text)
    }
  }
}
</script>

<style lang="scss" scoped>
.icon {
  width: 56px;
  height: 56px;
  transition: fill 0.5s ease;
}

#facebook:hover, a:focus #facebook {
  fill: #3B5998;
}

#github:hover, a:focus #github {
  fill: #6e5494;
}

#linkedin:hover, a:focus #linkedin {
  fill: #0077B5;
}

#twitter:hover, a:focus #twitter {
  fill: #55acee;
}

#email:hover, a:focus #email {
  fill: #555555;
}
</style>
