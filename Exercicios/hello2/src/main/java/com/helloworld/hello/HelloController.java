package com.helloworld.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello()
	{
		return "-Responsabilidade Pessoa\nMentalidade de crescimento\nOrientação ao futuro";
	}
	
}
