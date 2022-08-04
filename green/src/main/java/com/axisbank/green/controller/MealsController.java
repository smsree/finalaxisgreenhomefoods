package com.axisbank.green.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axisbank.green.services.MealsServiceImpl;
import com.axisbank.green.model.*;

@RestController
@RequestMapping("/meals")
//@CrossOrigin("http://localhost:3000")
@CrossOrigin("http://ec2-54-213-102-2.us-west-2.compute.amazonaws.com:3000")
public class MealsController {
	@Autowired
	private MealsServiceImpl mealService;
	@GetMapping("/all")
	public List<Meals> showAllMeals(){
		return mealService.getAllmeals();
	}
	@GetMapping("/{id}")
	public Meals getMealsById(@PathVariable String id)
	{
		return mealService.getMealById(id);
	}
	@PostMapping("/add")
	public ResponseEntity<String> addMeals(@RequestBody Meals m){
		return mealService.addNewmeal(m);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteMeal(@PathVariable String id){
		return mealService.removeOldmealById(id);
	}
	
	
	
}
