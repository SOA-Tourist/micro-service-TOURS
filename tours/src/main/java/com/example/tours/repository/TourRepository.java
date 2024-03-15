package com.example.tours.repository;

import com.example.tours.model.Tour;
import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TourRepository extends MongoRepository<Tour, String> {
    public List<Tour> findAllByAuthorId(long authorId);
}
