package com.project.choosmart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class choosemart {
	
	@GetMapping("/home")
	public String home(){
		return "Home";
	}
	@GetMapping("/login")
	public String login(){
		return "login";
	}
	@GetMapping("/register")
	public String register(){
		return "register";
	}
	@GetMapping("/product_mobile")
	public String products(){
		return "mobiles";
	}

}
