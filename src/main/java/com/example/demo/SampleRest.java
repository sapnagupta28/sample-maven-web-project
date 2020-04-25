package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRest {
	
	@GetMapping("/custom")
	public String hello() {
		return "This is custom application";
	}
	
}
