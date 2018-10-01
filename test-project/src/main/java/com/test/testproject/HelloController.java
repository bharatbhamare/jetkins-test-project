package com.test.testproject;

import javax.xml.ws.RespectBinding;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String sayHello()
	{
		return "hello World";
	}
}
