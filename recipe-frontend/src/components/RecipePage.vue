<template>
  <div class="container mx-auto p-8 space-y-4">
    <div class="text-bold text-3xl">
      {{ recipe.title }}
    </div>
    <div class="space-y-4">
      <div class="space-y-2">
        <div class="text-semibold text-2xl">
          Ingredients
        </div>
        <div>
          <ul>
            <li v-for="(ingredient, index) in recipe.ingredients" :key="index">
              {{ ingredient }}
            </li>
          </ul>
        </div>
      </div>
      <div class="space-y-2">
        <div class="text-semibold text-2xl">
          Method
        </div>
        <div>
          <ul>
            <li v-for="(step, index) in recipe.method" :key="index">
              {{ index + 1 }}. {{ step }}
            </li>
          </ul>
        </div>
      </div>
    </div>
  </div>
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