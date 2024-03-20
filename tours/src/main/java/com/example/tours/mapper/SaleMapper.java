package com.example.tours.mapper;

import com.example.tours.dto.SaleDto;
import com.example.tours.model.Sale;

public class SaleMapper {

    public static SaleDto SaleToDto(Sale sale) {
        SaleDto dto = new SaleDto();

        dto.setAuthorId(sale.getAuthorId());
        dto.setPercent(sale.getPercent());
        dto.setStartDate(sale.getStartDate());
        dto.setEndDate(sale.getEndDate());

        return dto;
    }

    public static Sale DtoToSale(SaleDto dto) {
        Sale sale = new Sale();

        sale.setAuthorId(dto.getAuthorId());
        sale.setEndDate(dto.getEndDate());
        sale.setPercent(dto.getPercent());
        sale.setStartDate(dto.getStartDate());

        return sale;
    }

}
