package com.shashwat.springapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringapiApplication.class, args);
	}

	@GetMapping
	public String helloWorld(){
		return "Hello World";
	}
}
