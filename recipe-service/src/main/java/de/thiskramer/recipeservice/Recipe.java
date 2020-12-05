package de.thiskramer.recipeservice;

import java.util.List;

public class Recipe {
    private final String title;
    private final List<String> ingredients;
    private final List<String> method;

    public Recipe(String title, List<String> ingredients, List<String> method) {
        this.title = title;
        this.ingredients = ingredients;
        this.method = method;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public List<String> getMethod() {
        return method;
    }
}
