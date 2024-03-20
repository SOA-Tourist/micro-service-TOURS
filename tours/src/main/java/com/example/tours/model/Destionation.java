package com.example.tours.model;

import com.example.tours.model.enums.DestinationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Destionation extends Entity {
    private long personId;
    private double longitude;
    private double latitude;
    private String name;
    private String description;
    private String imageURL;
    private DestinationType type;
    private PublicRequest request;

}
