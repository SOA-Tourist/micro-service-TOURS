package com.example.tours.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class TourActivityStats {
    private long tourId;
    private double ratingsCount;
    private double ordersCount;
    private double averageRating;
    private double algorithmScore;
}
