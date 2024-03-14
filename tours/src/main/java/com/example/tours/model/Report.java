package com.example.tours.model;

import com.example.tours.model.enums.Priority;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Report extends Entity{
    private String category;
    private Priority priority;
    private String description;
    private LocalDateTime dateCreated;
}
