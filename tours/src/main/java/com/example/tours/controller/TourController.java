package com.example.tours.controller;

import com.example.tours.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/tours", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class TourController {
    @Autowired
    private TourService tourService;


}
