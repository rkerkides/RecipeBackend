package com.example.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.crud.repository.RecipeRepository;
import com.example.crud.entity.Recipe;
import java.util.List;

@Service
public class RecipeService {
    @Autowired
    private RecipeRepository repository;

    public Recipe saveRecipe(Recipe recipe) {
        return repository.save(recipe);
    }

    public List<Recipe> saveRecipes(List<Recipe> recipes) {
        return repository.saveAll(recipes);
    }

    public List<Recipe> getRecipes() {
        return repository.findAll();
    }

    public Recipe getRecipeById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Recipe getRecipeByName(String name) {
        return repository.findByName(name);
    }

    public String deleteRecipe(int id) {
        repository.deleteById(id);
        return "Recipe removed" + id;
    }

    public Recipe updateRecipe(Recipe recipe) {
        Recipe existingRecipe = repository.findById(recipe.getId()).orElse(null);
        existingRecipe.setName(recipe.getName());
        existingRecipe.setIngredients(recipe.getIngredients());
        return repository.save(existingRecipe);
    }

}
