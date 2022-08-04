package com.axisbank.green.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class UserRegistration {
	private String name;
	@Id
	private String email;
	private String street;
	private String city;
	private String phoneNumber;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public UserRegistration(String name, String email, String street, String city, String phoneNumber,
			String password) {
		super();
		this.name = name;
		this.email = email;
		this.street = street;
		this.city = city;
		this.phoneNumber = phoneNumber;
		this.password = password;
	}
	public UserRegistration() {
		super();
	}
	@Override
	public String toString() {
		return "UserRegistration [name=" + name + ", email=" + email + ", street=" + street + ", city=" + city
				+ ", phoneNumber=" + phoneNumber + ", password=" + password + "]";
	}
	
	
	
	
}

