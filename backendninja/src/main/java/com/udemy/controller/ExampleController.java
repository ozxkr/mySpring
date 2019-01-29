package com.udemy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.udemy.component.ExampleComponent;
import com.udemy.component.RequestTimeInterceptor;
import com.udemy.model.Person;
import com.udemy.service.ExampleService;

import org.springframework.web.bind.annotation.GetMapping;
@Controller
@RequestMapping("/example")
 @ComponentScan("com.udemy.component")
@ComponentScan("com.udemy.service")
@ComponentScan("com.udemy.service.imp")

@EnableWebMvc

public class ExampleController {
	 @Autowired
	 @Qualifier("exampleService")
	 private ExampleService exampleService;

 
	public static final String EXAMPLE_VIEW="example";
	
	
	 @Autowired
	 @Qualifier("exampleComponent")

	 private ExampleComponent exampleComponent;
	 private RequestTimeInterceptor requestTimeInterceptor;
	//primer forma pocos datos o ninguno a cargar datos
	@GetMapping("/exampleString")
	public String examampleString(Model model )
	{ exampleComponent.sayHello();
	    
		model.addAttribute("people",exampleService.getListPeople()); // nombre del atributo que esta en el html (example.html) y luego el valor
		return EXAMPLE_VIEW;
	}
	
	// segunda forma muchos datos a cargar
	@GetMapping("/exampleMAV")

	
	public ModelAndView exampleMAV()
	{ 
		ModelAndView mov = new ModelAndView("example");
		mov.addObject("people",exampleService.getListPeople());
		return mov;
	}
	

	
}
