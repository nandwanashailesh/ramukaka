package com.ramukaka.usermanagement.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/sayhello")
	public String helloUser() {
		return "Hello";
	}

}
