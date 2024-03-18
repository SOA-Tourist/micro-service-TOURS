package com.example.tours.mapper;

import com.example.tours.dto.CheckpointDto;
import com.example.tours.dto.TourDto;
import com.example.tours.model.Checkpoint;
import com.example.tours.model.Tour;

import java.util.ArrayList;
import java.util.List;

public class CheckpointMapper {
    public static CheckpointDto mapToDto(Checkpoint checkpoint) {
        CheckpointDto checkpointDto = new CheckpointDto();
        checkpointDto.setId(checkpoint.getId());
        checkpointDto.setName(checkpoint.getName());
        checkpointDto.setDescription(checkpoint.getDescription());
        checkpointDto.setPictureURL(checkpoint.getPictureURL());
        checkpointDto.setCoordinates(checkpoint.getCoordinates());
        checkpointDto.setTourId(checkpoint.getTourId());
        checkpointDto.setTour(checkpoint.getTour());
        checkpointDto.setRequest(checkpoint.getRequest());
        return checkpointDto;
    }

    public static Checkpoint mapToEntity(CheckpointDto checkpointDto) {
        Checkpoint checkpoint = new Checkpoint();
        checkpoint.setId(checkpointDto.getId());
        checkpoint.setName(checkpointDto.getName());
        checkpoint.setDescription(checkpointDto.getDescription());
        checkpoint.setPictureURL(checkpointDto.getPictureURL());
        checkpoint.setCoordinates(checkpointDto.getCoordinates());
        checkpoint.setTourId(checkpointDto.getTourId());
        checkpoint.setTour(checkpointDto.getTour());
        checkpoint.setRequest(checkpointDto.getRequest());
        return checkpoint;
    }

    public static List<CheckpointDto> mapToDtoList(List<Checkpoint> checkpointList) {
        List<CheckpointDto> checkpointDtoList = new ArrayList<>();
        for (Checkpoint checkpoint : checkpointList) {
            checkpointDtoList.add(mapToDto(checkpoint));
        }
        return checkpointDtoList;
    }

    public static List<Checkpoint> mapToEntityList(List<CheckpointDto> checkpointDtoList) {
        List<Checkpoint> checkpointList = new ArrayList<>();
        for (CheckpointDto checkpointDto : checkpointDtoList) {
            checkpointList.add(mapToEntity(checkpointDto));
        }
        return checkpointList;
    }
}
