package in.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)  
public class SpringAopBeforeAdviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAopBeforeAdviceApplication.class, args);
	}

}
