package com.pulkit.springbootjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pulkit.springbootjpa.dao.AlienDao;
import com.pulkit.springbootjpa.model.Alien;

@Controller
public class AlienController {
	
	@Autowired
	AlienDao dao;
	
	@RequestMapping("/")
	public String home() {
		return "Home.jsp";
	}

	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		dao.save(alien);
		return "Home.jsp";
	}

}
