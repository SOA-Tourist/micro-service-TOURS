package com.example.tours.controller;

import com.example.tours.dto.TourDto;
import com.example.tours.model.Tour;
import com.example.tours.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/api/tours", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class TourController {
    @Autowired
    private TourService tourService;

    @GetMapping
    public ResponseEntity<List<Tour>> getAll() {
        return new ResponseEntity<>(tourService.getAll(), HttpStatus.OK);
    }

}
