package com.axisbank.green.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.axisbank.green.model.Meals;

public interface MealsService {
	public List<Meals> getAllmeals();
	public Meals getMealById(String id);
	public ResponseEntity<String> addNewmeal(Meals m);
	public ResponseEntity<String> removeOldmealById(String id);
}
