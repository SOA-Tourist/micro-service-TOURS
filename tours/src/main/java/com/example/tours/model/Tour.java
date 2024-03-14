package com.example.tours.model;

import com.example.tours.model.enums.Difficulty;
import com.example.tours.model.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Tour extends Entity{
    private long authorId;
    private String name;
    private String description;
    private Difficulty difficulty;
    private List<TravelTimeAndMethod> travelTimeAndMethods;
    private Status status;
    private double price;
    private String tags;
    private List<Equipment> tourEquipment;
    private List<Checkpoint> checkpoints;
    private double distance;
    private LocalDateTime publishTime;
    private List<TourReview> tourReviews;
    private LocalDateTime archiveTime;
    private List<FavouriteTour> favouriteTours;
    private List<CompositeTour> compositeTours;

}
