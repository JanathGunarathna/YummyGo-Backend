package com.example.YummyGo.controller;

<<<<<<< HEAD
import com.example.YummyGo.io.FoodRequest;
import com.example.YummyGo.io.FoodResponse;
import com.example.YummyGo.service.FoodService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.bson.json.JsonParseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
=======
import com.example.YummyGo.io.FoodResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> 3cb16ae9d963da13d2ec0f692b864f733d5b7ec4

@RestController
@RequestMapping("/api/foods")
@AllArgsConstructor
public class FoodController {
<<<<<<< HEAD

    private final FoodService foodService;

    @PostMapping
    public FoodResponse addFood(@RequestPart("food")String foodString,
                                @RequestPart("file")MultipartFile file){
        ObjectMapper objectMapper = new ObjectMapper();
        FoodRequest request = null;
        try{
             request = objectMapper.readValue(foodString, FoodRequest.class);
        }catch (JsonProcessingException ex){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Invalid JSON format");
        }
        FoodResponse response =foodService.addFood(request,file);
        return response;
    }
    @GetMapping
    public List<FoodResponse> readFoods(){
         return foodService.readFoods();
=======
    public FoodResponse addFood(@RequestPart("food")){

>>>>>>> 3cb16ae9d963da13d2ec0f692b864f733d5b7ec4
    }
}
