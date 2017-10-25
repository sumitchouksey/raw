package org.sample.api.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleApiApplication
{

	@GetMapping("/greetings")
	public String greetings(){
		return "Welcome to Spring Boot Demo";
	}

	@PostMapping("/user")
	public String user(@PathVariable String name){
		return "Welcome "+name;
	}


	public static void main(String[] args) {
		SpringApplication.run(SampleApiApplication.class, args);
	}
}
