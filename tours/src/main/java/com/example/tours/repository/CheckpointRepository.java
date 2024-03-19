package com.example.tours.repository;

import com.example.tours.model.Checkpoint;
import com.example.tours.model.Tour;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CheckpointRepository extends MongoRepository<Checkpoint, String> {
    public List<Checkpoint> findAllByTourId(String tourId);
}
