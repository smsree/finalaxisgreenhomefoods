package com.axisbank.green.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axisbank.green.services.UserRegistrationService;
import com.axisbank.green.model.*;

@RestController
@RequestMapping("/userRegistration")
//@CrossOrigin("http://localhost:3000")
@CrossOrigin("http://ec2-54-213-102-2.us-west-2.compute.amazonaws.com:3000")
public class UserRegistrationController {
	@Autowired
	private UserRegistrationService userRegistrationService;
	
	public UserRegistrationService getUserRegistrationService() {
		return userRegistrationService;
	}
	public void setUserRegistrationService(UserRegistrationService userRegistrationService) {
		this.userRegistrationService = userRegistrationService;
	}
	@GetMapping("/all")
	public List<UserRegistration> getAllRegisteredUser(){
		return userRegistrationService.getAllUser();
	}
	@GetMapping("/find/{id}")
	public UserRegistration getById(@PathVariable String id) {
		try {
			 return userRegistrationService.getUserById(id);
		}
		catch(Exception e) {
			
		}
		return null;
	}
	
	@PostMapping("/add")
	public ResponseEntity<String> addNewUser(@RequestBody UserRegistration user){
		userRegistrationService.addNewUser(user);
		return new ResponseEntity<String>("User added successfully",HttpStatus.OK);
	}
}
