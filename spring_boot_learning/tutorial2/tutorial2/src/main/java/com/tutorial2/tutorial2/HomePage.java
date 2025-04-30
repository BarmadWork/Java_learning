package com.tutorial2.tutorial2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePage {

	@GetMapping("/home")
	public String home() {
		return "Hello World! this is home page";
	}

}
