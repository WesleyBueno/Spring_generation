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
		return "-Criar tabelas usando o mysql\n"
				+ "Testar formas diferented de criar e popular tabelas no mysql\n"
				+ "Inicar o springboot\n"
				+ "Aprender mais, tirando dúvidas e pesquisando sobre os assunto falados em aula";
	}
	
}
