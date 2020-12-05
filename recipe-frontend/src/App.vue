<template>
  <RecipePage/>
</template>

<script lang="ts">
import { Options, Vue } from 'vue-class-component';
import RecipePage from "@/components/RecipePage.vue";

@Options({
  components: {
    RecipePage,
  },
})
export default class App extends Vue {}
</script>
