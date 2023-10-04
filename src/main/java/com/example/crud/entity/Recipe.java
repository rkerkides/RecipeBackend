// Define the package where this class resides
package com.example.crud.entity;

// Import necessary annotations and classes
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

// @Data: Lombok annotation to generate getters, setters, equals, and hashCode methods
// @AllArgsConstructor: Lombok annotation to generate a constructor with all properties
// @NoArgsConstructor: Lombok annotation to generate a no-argument constructor
@Data
@AllArgsConstructor
@NoArgsConstructor

// @Entity: JPA annotation to indicate that this class is an entity (mapped to a database table)
@Entity

// @Table: JPA annotation to specify the name of the database table
@Table(name = "RECIPE_TABLE")
public class Recipe {

    // @Id: JPA annotation to indicate that 'id' is the primary key
    // @GeneratedValue: JPA annotation to auto-generate the value for the primary key
    @Id
    @GeneratedValue
    private int id; // Unique identifier for each recipe

    private String name; // Name of the recipe

    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> ingredients;; // Ingredients required for the recipe

    private int calories; // Calories in the recipe
}
