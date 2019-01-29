package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
@RequestMapping("/say")

public class HolaController {

	@RequestMapping("/hola")

public String hola()
{ 
	return "hola";}
}
