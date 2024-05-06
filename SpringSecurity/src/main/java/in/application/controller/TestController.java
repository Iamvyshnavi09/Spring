package in.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping
	public String dataCall() {
		return "Hello Everyone this site is secured";
	}

}
