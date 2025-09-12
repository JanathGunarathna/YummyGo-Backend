package com.example.YummyGo.controller;

import com.example.YummyGo.io.FoodResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/foods")
@AllArgsConstructor
public class FoodController {
    public FoodResponse addFood(@RequestPart("food")){

    }
}
