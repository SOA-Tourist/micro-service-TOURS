package com.example.tours.service;

import com.example.tours.model.Sale;
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
    public Tour create(Tour tour) {
        return tourRepository.save(tour);
    }

    public Tour update(String id, Tour tour) {
        return tourRepository.existsById(id) ?  tourRepository.save(tour) : null;
    }
}
