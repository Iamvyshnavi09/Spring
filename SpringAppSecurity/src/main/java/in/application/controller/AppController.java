package in.application.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@GetMapping("/hello")
	  public String hello() {
	    return "Hello, World!";
	  }
	
	 
	  @GetMapping("/admin")
	  public String admin() {
	    return "Hello, Admin!";
	  }

}
