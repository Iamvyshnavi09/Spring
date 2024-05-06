package in.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import in.application.modal.Account;
import in.application.service.AccountService;
import in.application.service.AccountServiceImpl;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)  
public class SpringAopAfterReturningApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac =	SpringApplication.run(SpringAopAfterReturningApplication.class, args);
		AccountService accountService = ac.getBean("accountServiceImpl", AccountServiceImpl.class);  
		Account account; 
		try   
		{  
		account = accountService.getAccountByCustomerId("M4546779");  
		if(account != null)  
		System.out.println(account.getAccountNumber()+"\t"+account.getAccountType());  
		}   
		catch (Exception e)   
		{  
		System.out.println(e.getMessage());  
		}  
		 
		
	}

}
