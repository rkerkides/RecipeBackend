package com.example.crud.controller;

import com.example.crud.entity.Recipe;
import com.example.crud.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecipeController {

    @Autowired
    private RecipeService service;

    @PostMapping("/addRecipe")
    public Recipe addRecipe(@RequestBody Recipe recipe) {
        return service.saveRecipe(recipe);
    }

    @PostMapping("/addRecipes")
    public List<Recipe> addProducts(@RequestBody List<Recipe> recipes) {
        return service.saveRecipes(recipes);
    }
    @GetMapping("/recipes")
    public List<Recipe> findAllProducts() {
        return service.getRecipes();
    }
    @GetMapping("/recipeByID/{id}")
    public Recipe findRecipeByID(@PathVariable int id) {
        return service.getRecipeById(id);
    }

    @GetMapping("/recipeByName/{name}")
    public Recipe findRecipeByName(@PathVariable String name) {
        return service.getRecipeByName(name);
    }

    @PutMapping("/update")
    public Recipe updateRecipe(@RequestBody Recipe recipe) {
        return service.updateRecipe(recipe);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteRecipe(@PathVariable int id) {
        return service.deleteRecipe(id);
    }


}
