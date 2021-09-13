package com.ordinner.backend.service;

import com.ordinner.backend.model.Food;
import org.apache.coyote.Response;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    public List<Food> getFoodList() {
        return null;
    }

    public Food getFood(int id) {
        return null;
    }

    public Response createFood(String name, List<String> ingredient_used) {
        return null;
    }
}
