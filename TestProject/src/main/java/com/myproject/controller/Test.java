package com.myproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class Test {
	@GetMapping("/test1")
	@ResponseBody
	public String test1() {
		return "this is test functioon for online testing";
	}
	
	@GetMapping("/goto/{name}")
	public String test1(@PathVariable("name") String name) {
		
		if(name.equalsIgnoreCase("google")) {
			 
		       return "redirect:https://www.google.com";
		}
		if(name.equalsIgnoreCase("doit")) {
			 
		       return "redirect:https://doitc.rajasthan.gov.in/";
		}
		return null;
	}
	
	
	
}
