package com.jet.jet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@GetMapping("/")
	public String sayHello()
	{
		return "hello from first url";
	}
	
	
	@GetMapping("/hello")
	public String sayHello1()
	{
		return "hello from second url";
	}
	
	
}
