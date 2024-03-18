package com.example.tours.repository;

import com.example.tours.model.Checkpoint;
import com.example.tours.model.Tour;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckpointRepository extends MongoRepository<Checkpoint, String> {
}
