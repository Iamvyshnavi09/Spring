package in.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.application.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
	
	
	//Project findByProjectCode(long EmployeeAssignProject);

	Project findByProjectCode(String employeeAssignProject);

	Project findByProjectCode(long employeeAssignProject);

}
