package com.pulkit.springbootjpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlienController {
	
	@RequestMapping("/")
	public String home() {
		return "Home.jsp";
	}

}
