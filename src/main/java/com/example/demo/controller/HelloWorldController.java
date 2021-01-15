package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
	@GetMapping("/web")
	public String hello() {
		System.out.print("Controller Started");
		return "hello";
	}
	@GetMapping("/web/message")
	public String message(Model model) {
		model.addAttribute("message", 
				           "This is a custom message");
		return "message";
	}
	
	
}
