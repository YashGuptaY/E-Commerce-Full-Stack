package com.prb.demo.entity;

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
@Document(collection = "products")
public class ProductEntity {
    @Id
    private String id;
    private String name;
    private String description;
    private Boolean isAvailable;
    private double price;
    private String category;
    private String imageUrl;
}
