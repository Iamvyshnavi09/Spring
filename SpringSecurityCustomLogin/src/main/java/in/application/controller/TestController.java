package in.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping
	public String dataCall() {
		System.out.println("Login is Authorizing");
		return "Thank you for using custom login";
	}

}
