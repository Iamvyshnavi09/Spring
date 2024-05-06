package in.application.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect  
@Component  
public class EmployeeServiceAspect   
{  
@Before(value = "execution(* in.application.service.EmployeeService.*(..)) and args(empId, fname, sname)")  
public void beforeAdvice(JoinPoint joinPoint, int empId, String fname, String sname) {  
System.out.println("Before method:" + joinPoint.getSignature());  
System.out.println("Creating Employee with first name - " + fname + ", second name - " + sname );  
}  
}  
/*http://localhost:8080/add/employee?empId=101&firstName=Jhon&secondName=Harsh*/