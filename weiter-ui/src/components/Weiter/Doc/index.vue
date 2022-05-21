<template>
  <div>
    <svg-icon icon-class="question" @click="goto" />
  </div>
</template>

<script>
export default {
  name: 'WeiterDoc',
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
