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

import java.util.List;

@Service
public class CheckpointService {
    @Autowired
    private CheckpointRepository checkpointRepository;

    public CheckpointDto create(CheckpointDto dto) {
        Checkpoint checkpoint = CheckpointMapper.mapToEntity(dto);
        return CheckpointMapper.mapToDto(checkpointRepository.save(checkpoint));
    }

    public CheckpointDto update(String id, CheckpointDto dto){
        CheckpointDto checkpoint = CheckpointMapper.mapToDto(checkpointRepository.findById(id).orElse(null));
        if(checkpoint==null)
        {
            return null;
        }else{
            checkpoint.setId(id);
            checkpoint.setName(dto.getName());
            checkpoint.setDescription(dto.getDescription());
            checkpoint.setPictureURL(dto.getPictureURL());
            checkpoint.setCoordinates(dto.getCoordinates());
            checkpoint.setTourId(dto.getTourId());
            checkpoint.setTour(dto.getTour());
            checkpoint.setRequest(dto.getRequest());
            Checkpoint checkpointNorm = CheckpointMapper.mapToEntity(checkpoint);
            return CheckpointMapper.mapToDto(checkpointRepository.save(checkpointNorm));
        }
    }

    public List<CheckpointDto> getAllForTour(String tourId) {
        return CheckpointMapper.mapToDtoList(checkpointRepository.findAllByTourId(tourId));
    }

    public boolean delete(String checkpointId) {
        Checkpoint checkpoint = checkpointRepository.findById(checkpointId).get();
        checkpointRepository.delete(checkpoint);
        return checkpoint != null ? true : false;
    }
}
