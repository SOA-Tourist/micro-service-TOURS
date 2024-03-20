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
public class TourCoupon extends Entity{
    private String couponHash;
    private double discountPercentage;
    private LocalDateTime discountExpiration;
    private int applicableTourId;
    private int couponIssuerId;
    private Boolean applicableToAllUserTours;
    private Boolean valid;
}
