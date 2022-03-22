package com.myproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	@GetMapping("/test1")
	public String test1() {
		return "this is test functioon for online testing";
	}
	
}
