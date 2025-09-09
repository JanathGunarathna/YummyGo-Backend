package com.example.YummyGo.service;

import org.springframework.web.multipart.MultipartFile;

public interface FoodService {
    String uploadfile(MultipartFile file);
}
