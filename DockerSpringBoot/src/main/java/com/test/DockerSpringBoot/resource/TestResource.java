package com.test.DockerSpringBoot.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class TestResource {
	
	@GetMapping
	public String hello(){
		return "Hello World!";
	}

}
