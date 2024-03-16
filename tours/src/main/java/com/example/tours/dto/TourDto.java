package com.example.tours.dto;

import com.example.tours.model.Checkpoint;
import com.example.tours.model.CompositeTour;
import com.example.tours.model.Equipment;
import com.example.tours.model.FavouriteTour;
import com.example.tours.model.enums.Difficult;
import com.example.tours.model.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TourDto {
    private String Id;
    private long AuthorId;
    private String Name;
    private String Description;
    private Difficult Difficult;
    private Status Status;
    private double Price;
    private String Tags;
    private double Distance;
    private LocalDateTime PublishTime;
    private LocalDateTime ArchiveTime;
}
