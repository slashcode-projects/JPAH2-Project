package com.telesko.demo.model;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.telesko.demo.dao.IAlienRepo;

import ch.qos.logback.core.net.SyslogOutputStream;

@Controller
public class AlienController {

	@Autowired
	IAlienRepo repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		repo.save(alien);
		return "home";
	}
	
	/*
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aid) {
		ModelAndView mv = new ModelAndView("showAlien");
		Alien alien = repo.findById(aid).orElse(new Alien());
		
		System.out.println(repo.findByTech("Java")); // get alien who has tech as Java
		
		// get alien who has Id greater than 102
		System.out.println(repo.findByAidGreaterThan(102));
		
		//user definded query
		System.out.println(repo.findByTechSorted("Java"));
		mv.addObject(alien);
		
		return mv;
	}
	*/
	
	
	//REST API
	// to get all alien details 
	
	@RequestMapping("/aliens")
	@ResponseBody
	public List<Alien> getAliens() {
		return repo.findAll();
		
	}

	
	//to get Alien by Id
	@RequestMapping("/aliens/{aid}")
	@ResponseBody
	public Optional<Alien> getAlien(@PathVariable("aid") int aid) {
		return repo.findById(aid);
		
	}
	
}
