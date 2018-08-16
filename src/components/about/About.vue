<template>
  <div class="about">
      <h1>About</h1>
      <div class="row">
        <div class="col-md">
          <img src="../../assets/google.jpeg">
        </div>
        <div class="col-md" id="bio">
          <div>
            <p>This is where a bio will go.</p>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur mauris mauris, consequat at fringilla a, mollis ut orci. Suspendisse quis tortor nisl. Morbi eu velit ipsum. Cras blandit ac felis id commodo. Maecenas molestie dictum eleifend. Curabitur non ante non risus feugiat efficitur ut eu est. Vestibulum viverra nisl vel nibh ultricies hendrerit. Quisque in vestibulum lorem, quis consectetur neque. Nam tincidunt ex nec vulputate posuere. Fusce fermentum nisl eget lacus aliquet ultrices. Etiam nec justo eu sapien vehicula rhoncus.</p>
            <p>Nullam velit quam, suscipit nec sem a, dictum sagittis urna. Aenean blandit neque in arcu sollicitudin, quis vestibulum turpis tempor. Aenean vitae orci non arcu elementum commodo. Donec ultrices maximus nulla ut efficitur. Ut accumsan ante eu massa luctus fermentum. Donec semper euismod massa, eu consectetur elit ornare vel. Integer et tempor nibh. Aliquam id tortor augue. Fusce varius augue at nunc suscipit ultricies. Aliquam quis magna et mauris finibus finibus. Curabitur vitae nibh erat. Sed sem lectus, laoreet eget gravida nec, pharetra condimentum nunc. Sed condimentum, nunc nec tristique eleifend, eros erat bibendum ligula, eget porttitor odio sem at quam.</p>
          </div>
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

<style scoped>
img {
  max-width: 500px;
  height: auto;
}
</style>
