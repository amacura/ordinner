package com.ordinner.backend.controller;

import com.ordinner.backend.model.Food;
import com.ordinner.backend.service.FoodService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/food")
public class FoodController {
    @Autowired
    FoodService service;

    @GetMapping
    public List<Food> getFoods()
    {
        return service.getFoodList();
    }

    @GetMapping(params = {"id"})
    public Food getFood(@RequestParam int id)
    {
        //todo add exceptions
        return service.getFood(id);
    }

    @PostMapping(params = {"name","ingredient_used"})
    public Response createFood(String name, List<String>ingredient_used)
    {
        //todo add authentication and exception
        return service.createFood(name,ingredient_used);
    }
}
