package com.example.tours.service;

import com.example.tours.model.Sale;
import com.example.tours.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {
    @Autowired
    private SaleRepository saleRepository;

    public List<Sale> getAll() { return saleRepository.findAll(); }
}
