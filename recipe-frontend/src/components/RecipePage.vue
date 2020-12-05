<template>
  {{ recipe.title }}
</template>

<script lang="ts">

import RecipeAPI from "@/api/RecipeAPI";
import {ref, onBeforeMount} from "vue";
import Recipe from "@/api/model/Recipe";

export default {
  name: 'RecipePage',
  setup() {
    const recipeApi = new RecipeAPI();
    const recipe = ref(
        {
          title: "",
          ingredients: [],
          method: [],
        } as Recipe);

    onBeforeMount(async () => {
      recipe.value = await recipeApi.getRecipe();
    });

    return {
      recipe,
    };
  }
}
</script>