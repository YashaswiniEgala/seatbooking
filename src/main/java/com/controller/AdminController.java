package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Admin;
import com.model.AdminDAO;

@RestController
public class AdminController {
	
	@Autowired
	AdminDAO adminDAO;
	
	/*@PostMapping("/addLocation")
	public String addLocation(@RequestBody Admin admin) {
		adminDAO.save(admin);
		return "Location added";
	}*/
	@GetMapping("/home")
	public String getHome() {
		return "Hello Admin";
	}

}