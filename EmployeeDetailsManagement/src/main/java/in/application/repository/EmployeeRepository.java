package in.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.application.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
