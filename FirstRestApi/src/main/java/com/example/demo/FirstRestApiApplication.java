package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.controller.DemoController;

@SpringBootApplication
public class FirstRestApiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstRestApiApplication.class, args);
		 DemoController controller = context.getBean(DemoController.class);
		 controller.getApps();
	}

}
