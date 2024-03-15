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
    private String id;
    private long authorId;
    private String name;
    private String description;
    private Difficult difficulty;
    private Status status;
    private double price;
    private String tags;
    private double distance;
    private LocalDateTime publishTime;
    private LocalDateTime archiveTime;
}
