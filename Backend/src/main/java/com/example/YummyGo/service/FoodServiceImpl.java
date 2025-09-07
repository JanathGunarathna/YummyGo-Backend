package com.example.YummyGo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import software.amazon.awssdk.services.s3.S3Client;

@Service
public class FoodServiceImpl implements FoodService {

    private final S3Client s3Client;
    @Override
    public String uploadfile(MultipartFile file) {
        return "";
    }
}
