package com.info.main;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController  //controller +response body
public class RestControllerApp {

	@GetMapping("/name")
	public ResponseEntity getName() {
		String msg="my name is baby";
		return  new ResponseEntity(msg, HttpStatus.OK) ;
		
	}
	
	@GetMapping("/name/{age}")
	public Integer getAge(@PathVariable Integer age) {
		return age;
		
	}
}
