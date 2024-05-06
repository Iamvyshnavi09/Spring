package in.application.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.application.entity.Employee;
import in.application.entity.Project;
import in.application.payload.EmployeeDto;
import in.application.repository.EmployeeRepository;
import in.application.repository.ProjectRepository;
import in.application.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private ProjectRepository projectRepository;
	
	
	@Override
	public EmployeeDto saveEmployee(Employee employee) {
		Employee saveEmployee= employeeRepository.save(employee);
		Project project = projectRepository.findByProjectCode(saveEmployee.getEmployeeAssignProject());
		EmployeeDto employeeDto = new EmployeeDto();
		employeeDto.setId(saveEmployee.getId());
		employeeDto.setEmployeeName(saveEmployee.getEmployeeName());
		employeeDto.setEmployeeEmail(saveEmployee.getEmployeeEmail());
		employeeDto.setEmployeeBaseLocaton(saveEmployee.getEmployeeBaseLocation());
		employeeDto.setProjectCode(project.getProjectCode());
		employeeDto.setProjectName(project.getProjectName());
		return employeeDto;
	}

	@Override
	public EmployeeDto getEmployeeById(long id) {
		Employee foundEmployee = employeeRepository.findById(id).get();
		Project project = projectRepository.findByProjectCode(foundEmployee.getEmployeeAssignProject());
		EmployeeDto employeeDto = new EmployeeDto();
		employeeDto.setId(foundEmployee.getId());
		employeeDto.setEmployeeName(foundEmployee.getEmployeeName());
		employeeDto.setEmployeeEmail(foundEmployee.getEmployeeEmail());
		employeeDto.setEmployeeBaseLocaton(foundEmployee.getEmployeeBaseLocation());
		employeeDto.setProjectCode(project.getProjectCode());
		employeeDto.setProjectName(project.getProjectName());
		return employeeDto;
	}

}
