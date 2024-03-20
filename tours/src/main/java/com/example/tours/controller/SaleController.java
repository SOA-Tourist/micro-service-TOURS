package com.example.tours.controller;

import com.example.tours.dto.SaleDto;
import com.example.tours.mapper.SaleMapper;
import com.example.tours.model.Sale;
import com.example.tours.model.Tour;
import com.example.tours.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/sales", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class SaleController {
    @Autowired
    private SaleService saleService;

    @GetMapping
    public ResponseEntity<List<Sale>> getAll() {
        return new ResponseEntity<>(saleService.getAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Sale> create(@RequestBody SaleDto dto) {
        return new ResponseEntity<>(saleService.create(SaleMapper.DtoToSale(dto)), HttpStatus.OK);
    }

}
