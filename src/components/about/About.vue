<template>
  <div class="about" role="main">
      <h1 class="display-2 mb-3">About</h1>
      <div class="row">
        <div class="col-lg mb-4">
          <img class="rounded" src="../../assets/me.jpeg" alt="Headshot of Noah Keppers">
        </div>
        <div class="col-lg" id="bio">
          <div>
            <p>This is where a bio will go.</p>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur mauris mauris, consequat at fringilla a, mollis ut orci. Suspendisse quis tortor nisl. Morbi eu velit ipsum. Cras blandit ac felis id commodo. Maecenas molestie dictum eleifend. Curabitur non ante non risus feugiat efficitur ut eu est. Vestibulum viverra nisl vel nibh ultricies hendrerit. Quisque in vestibulum lorem, quis consectetur neque. Nam tincidunt ex nec vulputate posuere. Fusce fermentum nisl eget lacus aliquet ultrices. Etiam nec justo eu sapien vehicula rhoncus.</p>
          </div>
          <hr>
          <Social />
        </div>
      </div>
  </div>
</template>

<script>
import Nav from '../common/Nav'
import Social from '../common/Social'

export default {
  name: 'About',
  components: {
    Nav,
    Social
  }
}
</script>

<style lang="scss" scoped>
</style>
