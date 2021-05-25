package com.helloworld.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloApplication {
	
	@GetMapping("/hello1")
	public String hello1() {
		return "Persistência e Orientação aos detalhes";
	}
	
	@GetMapping("/hello2")
	public String hello2() {
		return "Aprender o máximo de Spring Boot que eu puder";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

}
