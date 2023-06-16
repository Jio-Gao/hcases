package com.hcases.cspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hcases")
public class HelloController {
	@RequestMapping("/sayHello")
	public String sayHello() {
		return "Hello, thank u having me here";
	}

}
