package com.example.YummyGo.service;

import com.example.YummyGo.io.FoodRequest;
import com.example.YummyGo.io.FoodResponse;
import org.springframework.web.multipart.MultipartFile;

public interface FoodService {
    String uploadfile(MultipartFile file);

    FoodResponse addFood(FoodRequest request, MultipartFile file);
}
