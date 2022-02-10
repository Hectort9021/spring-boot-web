package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@GetMapping({"index", "/", "home"})
	public ModelAndView index(ModelAndView mv) {
		
		mv.addObject("titulo", "Hola Spring Framework con Model And View!");
		mv.setViewName("index");
		return mv;
		
	}
	
}
