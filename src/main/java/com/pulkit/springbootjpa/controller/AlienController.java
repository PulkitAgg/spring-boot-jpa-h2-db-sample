package com.pulkit.springbootjpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping("/getAlien")
	public ModelAndView addAlien(@RequestParam int aId) {
		ModelAndView mv  = new ModelAndView("showAlien.jsp");
		Alien alien = dao.findById(aId).orElse(new Alien());
		
		System.out.println("Search by Eng Tech " + dao.findByTech("Eng"));
		System.out.println("Search by aId greater than 2" + dao.findByaIdGreaterThan(2));
		
		System.out.println("Search by Eng Tech and sort by name" + dao.findByTechAndSortOnName("Eng"));
		
		mv.addObject(alien);
		return mv;
	}
	
	@RequestMapping("/aliens")
	@ResponseBody // informing our dispatch serverlet, just return whatever data we have
	public List<Alien> getAliens() {
		
		return dao.findAll();
	}

	@RequestMapping("/alien/{aId}")
	@ResponseBody // informing our dispatch serverlet, just return whatever data we have
	public Optional<Alien> getAlien(@PathVariable("aId") int aId) {
		return dao.findById(aId);
	}
}
