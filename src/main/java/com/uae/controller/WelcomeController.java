package com.uae.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {


	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", "Hello World");
		System.out.println("---->"+model);
		return "welcome";
	}

}