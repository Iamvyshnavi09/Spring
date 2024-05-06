package in.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.application.service.EmployeeService;

@RestController  
public class EmployeeController   
{  
@Autowired  
private EmployeeService employeeService;  
@RequestMapping(value = "/add/employee", method = RequestMethod.GET)  
public in.application.modal.Employee addEmployee(@RequestParam("empId") int empId, @RequestParam("firstName") String firstName, @RequestParam("secondName") String secondName)   
{  
return employeeService.createEmployee(empId, firstName, secondName);  
} 

@RequestMapping(value = "/remove/employee", method = RequestMethod.GET)  
public String removeEmployee( @RequestParam("empId") String empId)   
{  
employeeService.deleteEmployee(empId);  
return "Employee removed";  
}  
}  