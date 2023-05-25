package com.example.digitalnetwork.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World"; 
	}
	
	@GetMapping(path = "/hello-bean")
	public HelloBean helloWorldBean() {
		return new HelloBean("Hello"); 
	}
	
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloBean(String.format("Hello World, %s", name)); 
	}
	
}
