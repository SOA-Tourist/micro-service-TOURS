package com.example.tours.model;

import com.example.tours.model.enums.Difficult;
import com.example.tours.model.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Tour extends Entity{
    private long AuthorId;
    private String Name;
    private String Description;
    private Difficult Difficulty;
    //private List<TravelTimeAndMethod> travelTimeAndMethods;
    private Status Status;
    private double Price;
    private String Tags;
   // private List<Equipment> tourEquipment;
   // private List<Checkpoint> checkpoints;
    private double Distance;
    private LocalDateTime PublishTime;
    //private List<TourReview> tourReviews;
    private LocalDateTime ArchiveTime;
   // private List<FavouriteTour> favouriteTours;
   // private List<CompositeTour> compositeTours;

}
