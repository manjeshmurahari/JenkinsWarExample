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
	@GetMapping("/hai2")
	public String hai2() {
		return "Hai everyone2.............";
	}
	@GetMapping("/hai3")
	public String hai3() {
		return "Hai everyone3.............";
	}
	
}
