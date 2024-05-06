package in.application.service;

import in.application.entity.Employee;
import in.application.payload.EmployeeDto;

public interface EmployeeService {
	public EmployeeDto saveEmployee(Employee employee);
	public EmployeeDto getEmployeeById (long id);

}
