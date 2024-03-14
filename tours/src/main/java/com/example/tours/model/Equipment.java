package com.example.tours.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Equipment extends Entity {
    private String name;
    private String description;
    private List<Tour> Tours;
}
