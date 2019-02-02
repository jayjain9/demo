package com.example.demo.controler;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

@RestController 
public class HomeController {
	@RequestMapping(value = "shop", method=RequestMethod.GET)
	public String home() throws InvalidFormatException, IOException {
		//ModelAndView modelAndView = new ModelAndView();
		//modelAndView.addObject("key", "home");
		//modelAndView.setViewName("home");
		return "hello3";
	} 
}
