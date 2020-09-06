package com.pinku.mobileapp.controller.model.response;

public class UserRest {

	private String userId;
	private String firstName;
	private String lastName;
	private String email;

	public String getUserId() {
		return userId;
	}

	public UserRest setUserId(String userId) {
		this.userId = userId;
		return this;
	}

	public String getFirstName() {
		return firstName;
	}

	public UserRest setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public String getLastName() {
		return lastName;
	}

	public UserRest setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public UserRest setEmail(String email) {
		this.email = email;
		return this;
	}

}
