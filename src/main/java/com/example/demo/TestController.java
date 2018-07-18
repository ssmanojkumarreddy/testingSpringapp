package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/test")

public class TestController {

	@RequestMapping(value="/testing", method= RequestMethod.GET)
	public int testMethod() {
		return 11;
	}
	
}
