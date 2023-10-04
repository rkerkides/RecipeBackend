package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.crud.entity.Recipe;
public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
    Recipe findByName(String name);
}
