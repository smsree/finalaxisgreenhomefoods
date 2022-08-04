package com.axisbank.green.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.axisbank.green.model.*;
public interface UserService {
	public List<User> getAllUser();
	public User getUserById(String id);
	public ResponseEntity<String> addNewUser(User u);
	
}