package com.example.tours.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class FavouriteTour extends Entity {
    private long touristId;
    private long tourId;
    private Tour tour;
}
