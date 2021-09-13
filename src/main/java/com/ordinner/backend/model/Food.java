package com.ordinner.backend.model;

import javax.persistence.*;
import java.util.Map;
@Entity
@Table(name = "Food")
public class Food {
    @Id @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "ingredient_used")
    private static Map<Ingredient,Integer> ingredientUsed;

    public Food(Integer foodId, String name) {
        id = foodId;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Map<Ingredient, Integer> getIngredientUsed() {
        return ingredientUsed;
    }

    public static void setIngredientUsed(Map<Ingredient, Integer> ingredientUsed) {
        Food.ingredientUsed = ingredientUsed;
    }

}
