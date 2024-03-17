package com.example.tours.controller;

import com.example.tours.dto.TourDto;
import com.example.tours.mapper.TourMapper;
import com.example.tours.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/api/tours", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin
public class TourController {
    @Autowired
    private TourService tourService;

    @GetMapping("/for_author/{authorId}")
    public ResponseEntity<List<TourDto>> getAllForUser(@PathVariable long authorId) {
        return new ResponseEntity<>(tourService.getAllForUser(authorId), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<TourDto> getById(@PathVariable String id) {
        return new ResponseEntity<>(tourService.getById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<TourDto> create(@RequestBody TourDto dto) {
        dto.setId(null);
        return new ResponseEntity<>(tourService.create(dto), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TourDto> update(@PathVariable String id, @RequestBody TourDto dto) {
        dto.setId(id);
        return new ResponseEntity<>(tourService.updateNew(id, dto), HttpStatus.OK);
    }
    @PutMapping("/archive/{id}")
    public ResponseEntity<TourDto> archive(@PathVariable String id, @RequestBody TourDto dto) {
        dto.setId(id);
        TourDto returnDto = tourService.publish(id, dto);
        if(returnDto==null)
        {
            return new ResponseEntity<>(dto, HttpStatus.NOT_FOUND);
        }else
        {
            return new ResponseEntity<>(returnDto, HttpStatus.OK);
        }
    }
    @PutMapping("/publish/{id}")
    public ResponseEntity<TourDto> publish(@PathVariable String id, @RequestBody TourDto dto) {
        dto.setId(id);
        TourDto returnDto = tourService.publish(id, dto);
        if(returnDto==null)
        {
            return new ResponseEntity<>(dto, HttpStatus.NOT_FOUND);
        }else
        {
            return new ResponseEntity<>(returnDto, HttpStatus.OK);
        }
    }
}
