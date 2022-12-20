package com.example.democrudmongo.dao.api;

import com.example.democrudmongo.model.Serie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SerieRepository extends MongoRepository<Serie, String> {
}
