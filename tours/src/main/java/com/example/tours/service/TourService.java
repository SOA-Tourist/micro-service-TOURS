package com.example.tours.service;

import com.example.tours.model.Tour;
import com.example.tours.repository.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourService {
    @Autowired
    private TourRepository tourRepository;

    public List<Tour> getAll() {
        return tourRepository.findAll();
    }

}
