package com.javator.security.fba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello there !";
	}
	
	@GetMapping("/greetings")
	public String greet() {
		return "Good day !";
	}

}
