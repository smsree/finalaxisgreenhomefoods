package com.axisbank.green.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.axisbank.green.model.OrderMeals;

@Repository
public interface OrderRepostiory extends MongoRepository<OrderMeals,Double>{
	
}
