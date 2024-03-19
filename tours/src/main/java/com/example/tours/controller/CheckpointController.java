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

import java.util.List;

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

    @PutMapping("/{id}")
    public ResponseEntity<CheckpointDto> update(@PathVariable String id, @RequestBody CheckpointDto dto) {
        dto.setId(id);
        CheckpointDto returnDto = checkpointService.update(id, dto);
        if(returnDto==null)
        {
            return new ResponseEntity<>(dto, HttpStatus.NOT_FOUND);
        }else
        {
            return new ResponseEntity<>(returnDto, HttpStatus.OK);
        }
    }

    @GetMapping("/for_tour/{tourId}")
    public ResponseEntity<List<CheckpointDto>> getAllForTour(@PathVariable String tourId) {
        return new ResponseEntity<>(checkpointService.getAllForTour(tourId), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        return checkpointService.delete(id) ? new ResponseEntity<>(HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
