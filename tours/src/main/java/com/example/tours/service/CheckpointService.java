package com.example.tours.service;

import com.example.tours.dto.CheckpointDto;
import com.example.tours.dto.TourDto;
import com.example.tours.mapper.CheckpointMapper;
import com.example.tours.mapper.TourMapper;
import com.example.tours.model.Checkpoint;
import com.example.tours.model.Tour;
import com.example.tours.repository.CheckpointRepository;
import com.example.tours.repository.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckpointService {
    @Autowired
    private CheckpointRepository checkpointRepository;

    public CheckpointDto create(CheckpointDto dto) {
        Checkpoint checkpoint = CheckpointMapper.mapToEntity(dto);
        return CheckpointMapper.mapToDto(checkpointRepository.save(checkpoint));
    }
}
