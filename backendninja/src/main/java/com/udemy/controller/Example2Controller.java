package com.udemy.controller;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.model.Person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@Controller
@RequestMapping("/example2")
public class Example2Controller {
	private static final String EXAMPLE2_VIEW="example2"; 
	@GetMapping("/request1")

	
	public ModelAndView request1(@RequestParam(name="nm",required=false,defaultValue="null") String name)
	{ 
		
		ModelAndView mov = new ModelAndView(EXAMPLE2_VIEW);
		mov.addObject("nm_in_model",name);
		return mov;
	}
	
	@GetMapping("/request2/{nm}")

	public ModelAndView request2(@PathVariable("nm") String name)
	{ 
		
		ModelAndView mov = new ModelAndView(EXAMPLE2_VIEW);
		mov.addObject("nm_in_model",name);
		return mov;
	}
	

}