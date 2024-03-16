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

    public List<TourDto> getAllForUser(long authorId) {
        return TourMapper.mapToDtoList(tourRepository.findAllByAuthorId(authorId));
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
    public TourDto updateNew(String id, TourDto dto){
        TourDto tura = TourMapper.mapToDto(tourRepository.findById(id).orElse(null));
        if(tura==null)
        {
           tura=create(dto);
           return tura;
        }else{
            tura.setId(id);
            tura.setName(dto.getName());
            tura.setDescription(dto.getDescription());
            tura.setDifficult(dto.getDifficult());
            tura.setTags(dto.getTags());
            tura.setAuthorId(dto.getAuthorId());
            tura.setStatus(dto.getStatus());
            tura.setPrice(dto.getPrice());
            tura.setDistance(dto.getDistance());
            tura.setPublishTime(dto.getPublishTime());
            tura.setArchiveTime(dto.getArchiveTime());
            Tour turaNorm = TourMapper.mapToEntity(tura);
            return TourMapper.mapToDto(tourRepository.save(turaNorm));
        }
    }
}
