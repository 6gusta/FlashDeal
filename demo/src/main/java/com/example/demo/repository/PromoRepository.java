package com.example.demo.repository;

import com.example.demo.model.Promo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromoRepository extends MongoRepository<Promo, String> {
}


