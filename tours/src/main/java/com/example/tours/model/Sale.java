package com.example.tours.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Sale extends Entity {
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private int percent;
    private long authorId;
}
