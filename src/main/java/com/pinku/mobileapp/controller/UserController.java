package com.pinku.mobileapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pinku.mobileapp.controller.model.request.UserDetailRequestModel;
import com.pinku.mobileapp.controller.model.response.UserRest;

@RestController("users")
public class UserController {
	
	@GetMapping("/getusers")
	public String getUser() {
		return "getUser";
	}
	
	@PostMapping("/postusers")
	public UserRest createUser(@RequestBody UserDetailRequestModel userDetails ) {
		return new UserRest()
				.setUserId("101")
				.setFirstName(userDetails.getFirstName())
				.setLastName(userDetails.getLastName())
				.setEmail(userDetails.getEmail())
				;
	}
	
	
}
