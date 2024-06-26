package in.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.application.entity.Employee;
import in.application.payload.EmployeeDto;
import in.application.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping
	public EmployeeDto createEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);

	}

	@GetMapping("/{employee_id}")

	public EmployeeDto getEmployeeBy(@PathVariable(name = "employee_id") long employee_id) {

		return employeeService.getEmployeeById(employee_id);

	}
}
