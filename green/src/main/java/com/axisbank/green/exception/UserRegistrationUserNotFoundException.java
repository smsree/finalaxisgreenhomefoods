package com.axisbank.green.exception;

public class UserRegistrationUserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	public UserRegistrationUserNotFoundException() {
		super();
	}
	public UserRegistrationUserNotFoundException(String message) {
		super(message);
	}
}

