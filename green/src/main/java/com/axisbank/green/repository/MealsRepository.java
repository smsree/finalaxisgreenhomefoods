package com.axisbank.green.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.axisbank.green.model.Meals;

@Repository
public interface MealsRepository extends MongoRepository<Meals,String>{
	
}