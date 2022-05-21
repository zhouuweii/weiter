<template>
  <div>
    <svg-icon icon-class="github" @click="goto" />
  </div>
</template>

<script>
export default {
  name: 'WeiterGit',
  data() {
    return {
      url: 'https://github.com/zhouuweii/weiter'
    }
  },
  methods: {
    goto() {
      window.open(this.url)
    }
  }
}
</script>
