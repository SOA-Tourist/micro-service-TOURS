package com.example.tours.mapper;

import com.example.tours.dto.TourDto;
import com.example.tours.model.Tour;

import java.util.ArrayList;
import java.util.List;

public class TourMapper {

    public static TourDto mapToDto(Tour tour) {
        TourDto tourDto = new TourDto();
        tourDto.setId(tour.getId());
        tourDto.setAuthorId(tour.getAuthorId());
        tourDto.setName(tour.getName());
        tourDto.setDescription(tour.getDescription());
        tourDto.setDifficult(tour.getDifficult());
        tourDto.setStatus(tour.getStatus());
        tourDto.setPrice(tour.getPrice());
        tourDto.setTags(tour.getTags());
        tourDto.setDistance(tour.getDistance());
        tourDto.setPublishTime(tour.getPublishTime());
        tourDto.setArchiveTime(tour.getArchiveTime());
        return tourDto;
    }

    public static Tour mapToEntity(TourDto tourDto) {
        Tour tour = new Tour();
        tour.setId(tourDto.getId());
        tour.setAuthorId(tourDto.getAuthorId());
        tour.setName(tourDto.getName());
        tour.setDescription(tourDto.getDescription());
        tour.setDifficult(tourDto.getDifficult());
        tour.setStatus(tourDto.getStatus());
        tour.setPrice(tourDto.getPrice());
        tour.setTags(tourDto.getTags());
        tour.setDistance(tourDto.getDistance());
        tour.setPublishTime(tourDto.getPublishTime());
        tour.setArchiveTime(tourDto.getArchiveTime());
        return tour;
    }

    public static List<TourDto> mapToDtoList(List<Tour> tourList) {
        List<TourDto> tourDtoList = new ArrayList<>();
        for (Tour tour : tourList) {
            tourDtoList.add(mapToDto(tour));
        }
        return tourDtoList;
    }

    public static List<Tour> mapToEntityList(List<TourDto> tourDtoList) {
        List<Tour> tourList = new ArrayList<>();
        for (TourDto tourDto : tourDtoList) {
            tourList.add(mapToEntity(tourDto));
        }
        return tourList;
    }
}
