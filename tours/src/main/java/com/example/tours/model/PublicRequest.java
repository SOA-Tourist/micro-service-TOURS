package com.example.tours.model;

import com.example.tours.model.enums.CheckpointRequestStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class PublicRequest extends Entity {
    private CheckpointRequestStatus status;
    private String comment;
}
