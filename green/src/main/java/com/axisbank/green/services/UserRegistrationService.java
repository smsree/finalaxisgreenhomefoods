package com.axisbank.green.services;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.axisbank.green.model.*;
public interface UserRegistrationService {
	public List<UserRegistration> getAllUser();
	public UserRegistration getUserById(String id);
	public ResponseEntity<String> addNewUser(UserRegistration u);
}
