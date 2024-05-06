package in.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.application.controller.TestController;

@SpringBootApplication
public class SpringSecurityApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringSecurityApplication.class, args);
	
		TestController controller = context.getBean(TestController.class);
		controller.dataCall();
	}

}
