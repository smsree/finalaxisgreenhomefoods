package com.axisbank.green.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axisbank.green.services.UserService;
import com.axisbank.green.model.*;

@RestController
@RequestMapping("/user")
//@CrossOrigin("http://localhost:3000")
@CrossOrigin("http://ec2-54-213-102-2.us-west-2.compute.amazonaws.com:3000")
public class UserController {
	@Autowired
	private UserService userService;
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService2) {
		this.userService = userService2;
	}
	@GetMapping("/all")
	public List<User> getAllOrderedUser()
	{
		return userService.getAllUser();
	}
	@GetMapping("/{id}")
	public User getOrderedUserById(@PathVariable String id) {
		try {
			return userService.getUserById(id);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return null;
	}
	@PostMapping("/add")
	public ResponseEntity<String> addUser(@RequestBody User u){
		return userService.addNewUser(u);
	}
	
}
