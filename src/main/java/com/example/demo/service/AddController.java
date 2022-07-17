package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AddController {
	
	
	
	@GetMapping("/home")
	public String test() {
		return "Welcome Home";
	}
	
	@GetMapping("/get")
	public List<String> display(){
		List<String> list = Arrays.asList("One","Two","Three", "Test");
		System.out.println("Test|"+list);
		return list;	
	}

}
