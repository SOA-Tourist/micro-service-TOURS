package com.example.tours.controller;

import com.example.tours.dto.CheckpointDto;
import com.example.tours.dto.TourDto;
import com.example.tours.service.CheckpointService;
import com.example.tours.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/checkpoints", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class CheckpointController {
    @Autowired
    private CheckpointService checkpointService;

    @PostMapping
    public ResponseEntity<CheckpointDto> create(@RequestBody CheckpointDto dto) {
        dto.setId(null);
        return new ResponseEntity<>(checkpointService.create(dto), HttpStatus.OK);
    }
}
