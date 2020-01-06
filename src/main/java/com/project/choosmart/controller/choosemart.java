package com.project.choosmart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class choosemart {
	
	@GetMapping("/home")
	public String home(){
		return "home";
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
	@GetMapping("/product_accessory")
	public String accessories(){
		return "accessories";
	}
	@GetMapping("/cart")
	public String cart(){
		return "cart";
	}
	@GetMapping("/checkout")
	public String checkout(){
		return "checkout";
	}
	@GetMapping("/singlemobileview")
	public String singlemobileview(){
		return "singlemobileview";
	}

}
