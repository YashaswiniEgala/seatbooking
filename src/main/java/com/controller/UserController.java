package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.UserDAO;



@RestController
public class UserController {

	@Autowired
	UserDAO userDAO;
	
	/*@GetMapping("/home")
	public String getHome() {
		
		return "Hello User";
	}*/
}