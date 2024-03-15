package com.example.tours.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleDto {
    private LocalDateTime StartDate;
    private LocalDateTime EndDate;
    private int Percent;
    private long AuthorId;
}
