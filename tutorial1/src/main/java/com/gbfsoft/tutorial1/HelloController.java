package com.gbfsoft.tutorial1;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	private static final String GREETING = "Greetings from Spring Boot!";
	private static final String MAPPED_PATH = "/";

	@Secured("ROLE_ANONYMOUS")
	@RequestMapping(MAPPED_PATH)
	public Greeting index() {
		Greeting greeting = new Greeting();
		greeting.setMessage(GREETING);
		return greeting;
	}
}
