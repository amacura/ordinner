package com.ordinner.backend.model;

import java.util.Map;

public class Food {
    private int FoodId;
    private String name;
    private static Map<Ingredient,Integer> ingredientUsed;
    private FoodStatus status;
}
