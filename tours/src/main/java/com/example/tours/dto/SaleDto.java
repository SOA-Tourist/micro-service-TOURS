package com.example.tours.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleDto {
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private int percent;
    private long authorId;
}
