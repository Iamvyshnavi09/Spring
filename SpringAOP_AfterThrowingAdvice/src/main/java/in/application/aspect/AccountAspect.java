package in.application.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AccountAspect {
	@AfterThrowing(value="execution(* in.application.service.AccountServiceImpl.*(..))",throwing="ex")  
	public void afterThrowingAdvice(JoinPoint joinPoint, Exception ex)  
	{  
	System.out.println("After Throwing exception in method:"+joinPoint.getSignature());  
	System.out.println("Exception is:"+ex.getMessage());  
	}     
	

}
