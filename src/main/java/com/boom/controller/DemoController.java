package com.boom.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/")
	public String getGreetings() {
		
		return "Hello. Greetings from SpringbootProject ("+LocalDateTime.now()+")";
		
	}
}
