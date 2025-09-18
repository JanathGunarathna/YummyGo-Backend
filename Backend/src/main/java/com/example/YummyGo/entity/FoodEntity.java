package com.example.YummyGo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
<<<<<<< HEAD
@Document(collection = "foods")
=======
@Document(collation = "food")
>>>>>>> 3cb16ae9d963da13d2ec0f692b864f733d5b7ec4
public class FoodEntity {
    @Id
    private String id;
    private String name;
    private String description;
    private double price;
    private String category ;
    private String imageUrl;
}
