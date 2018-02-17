package com.sabre.producer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerTest {
	
	@RequestMapping("/name")
	public String getName()
	{
		return "Test";
	}
	
	

}
