package com.sathya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.service.DemoService;

@RestController
public class DemoController 
{
	@Autowired
	DemoService service;
	
	@GetMapping("/hello")
	public String hello()
	{
		return service.sayHello();
	}
	@GetMapping("/bye")
	public String bye()
	{
		return "bye";
	}
	
}
