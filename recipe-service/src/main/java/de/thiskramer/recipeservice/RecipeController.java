package de.thiskramer.recipeservice;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080", allowCredentials = "true")
@RestController
public class RecipeController {

    @GetMapping("/recipe")
    public Recipe recipe() {
        return new Recipe(
                "Banan Bread",
                List.of("5 ripe bananas", "200g flour", "50g walnuts", "1 egg", "50g dark chocolate"),
                List.of("Mash the bananas.", "Incorporate the remaining ingredients", "Bake at 200 degrees Celsius")
        );
    }
}
