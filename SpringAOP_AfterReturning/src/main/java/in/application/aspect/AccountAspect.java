package in.application.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import in.application.modal.Account;

@Aspect
@Component
public class AccountAspect {
	
	@AfterReturning(value="execution(* in.application.service.AccountServiceImpl.*(..))",returning="account")  
	public void afterReturningAdvice(JoinPoint joinPoint, Account account) { 
	System.out.println("After Returing method:"+joinPoint.getSignature());  
	System.out.println(account);  
	

}
}
