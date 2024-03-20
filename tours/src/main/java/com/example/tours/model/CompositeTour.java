package com.example.tours.model;

import com.example.tours.model.enums.Difficult;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class CompositeTour extends Entity {
    private long touristId;
    private String name;
    private List<Tour> tours;
    public double getDistance() {
        return Math.round(tours.stream()
                .mapToDouble(Tour::getDistance)
                .sum() * 100.0) / 100.0;
    }

}
