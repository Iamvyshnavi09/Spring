package in.application.service;

import org.springframework.stereotype.Service;

import in.application.modal.Employee;

@Service  
public class EmployeeService   
{  
public Employee createEmployee( int empId, String fname, String sname)   
{  
Employee emp = new Employee();  
emp.setEmpId(empId);  
emp.setFirstName(fname);  
emp.setSecondName(sname);  
return emp;  
}  
public void deleteEmployee(String empId)   
{  
}  
}  