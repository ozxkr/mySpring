package com.udemy.controller;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.udemy.model.Person;


@Controller
@RequestMapping("/example3")

public class Example3Controller {
	private static final Log LOGGER = LogFactory.getLog(Example3Controller.class);
	private static final String EXAMPLE3_VIEW="form"; 
	private static final String EXAMPLE4_VIEW="result"; 
	
	@GetMapping("/")
	/*public String redirect()
	{ 
		return "redirect:/example3/showform";
	} */
	public RedirectView redirect()
	{
		return  new RedirectView("/example3/showform");
	}
	
	
	
	
	
	
	
	
	@GetMapping("/showform")

	
	public String showform(Model model)
	{ model.addAttribute("person", new Person());
	// int  A = 0/0;
	 return 	EXAMPLE3_VIEW;
	}
	@PostMapping("/addperson")
	// redireccion metodo 1
	
	
	public ModelAndView addperson( @Valid @ModelAttribute("person") Person person, BindingResult bindingResult )
	{ 		ModelAndView mov = new ModelAndView();
	   if (bindingResult.hasErrors()){
		 mov.setViewName(EXAMPLE3_VIEW);
		 
	 }
	   else
	   {

		//LOGGER.info("METHOD: 'addperson' -- PARAMS: '" + person + "'" );
			 mov.setViewName(EXAMPLE4_VIEW);

		mov.addObject("person",person);

		//LOGGER.info("TEMPLATE: '" + EXAMPLE4_VIEW + "' -- DATA: '" + person + "'"   );
	   }
		return mov;
	}
	
		
}
