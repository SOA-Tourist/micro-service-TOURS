package com.example.tours.dto;

import com.example.tours.model.Coordinate;
import com.example.tours.model.PublicRequest;
import com.example.tours.model.Tour;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckpointDto {
    private String Id;
    private String name;
    private String description;
    private String pictureURL;
    // Coordinate coordinates;
    private double latitude;
    private double longitude;
    private String tourId;
    private PublicRequest request;
    private Tour tour;
}
