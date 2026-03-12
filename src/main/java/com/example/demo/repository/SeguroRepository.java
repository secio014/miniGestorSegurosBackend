package com.example.demo.repository;

import com.example.demo.model.Seguro;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SeguroRepository extends MongoRepository<Seguro, String> {
}