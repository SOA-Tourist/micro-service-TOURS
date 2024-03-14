package com.example.tours.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Checkpoint extends Entity{
    private String name;
    private String description;
    private String pictureURL;
    private Coordinate coordinates;
    private long tourId;
    private PublicRequest request;
    private Tour tour;
}
