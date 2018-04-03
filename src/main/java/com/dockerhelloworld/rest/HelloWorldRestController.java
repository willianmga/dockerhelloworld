package com.dockerhelloworld.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldRestController {

	@GetMapping
	public ResponseEntity<Map<String, String>> helloWorld() {
		
		final Map<String, String> myMap = new HashMap<String, String>();
		myMap.put("message", "hello-world!");
		
		return ResponseEntity.ok().body(myMap);
		
	}
	
}