package com.example.tours.service;

import com.example.tours.dto.TourDto;
import com.example.tours.mapper.TourMapper;
import com.example.tours.model.Sale;
import com.example.tours.model.Tour;
import com.example.tours.repository.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourService {
    @Autowired
    private TourRepository tourRepository;

    public Page<TourDto> getAllForUser(long authorId, int pageNumber, int pageSize) {
        List<Tour> tours = tourRepository.findAllByAuthorId(authorId);
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        return new PageImpl<>(TourMapper.mapToDtoList(tours), pageable, tours.size());
    }

    public TourDto getById(String id) {
        return TourMapper.mapToDto(tourRepository.findById(id).orElse(null));
    }
    public TourDto create(TourDto dto) {
        Tour tour =  TourMapper.mapToEntity(dto);
        return TourMapper.mapToDto(tourRepository.save(tour));
    }

    public TourDto update(String id, TourDto dto) {
        Tour tour =  TourMapper.mapToEntity(dto);
        return tourRepository.existsById(id) ?  TourMapper.mapToDto(tourRepository.save(tour)) : null;
    }
}
