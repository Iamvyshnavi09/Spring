package in.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.application.controller.MobileController;

@SpringBootApplication
public class MobileApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MobileApplication.class, args);
		MobileController controller = context.getBean(MobileController.class);
		controller.updateMobile(0, null);
		controller.addMobile(null);
		controller.deleteMobile(0);
		controller.getAllMobile();
		
		
	}

}
