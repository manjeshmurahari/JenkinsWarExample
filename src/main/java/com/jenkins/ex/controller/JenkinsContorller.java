package com.jenkins.ex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsContorller {
	
	@GetMapping("/name")
	public String getname()
	{
		return "Hellow Millie.......";
	}
	
	@GetMapping("/hai")
	public String hai() {
		return "Hai everyone.............";
	}
	@GetMapping("/hai1")
	public String hai1() {
		return "Hai everyone1.............";
	}
}
