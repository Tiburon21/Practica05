package edu.uacm.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
	
	
	@RequestMapping("/")
	public String index(){
		return "Saludos desde Spring Boot :D";
	}
	

}
