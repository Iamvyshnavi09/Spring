package in.application.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;


@Entity
@Table(name="employee",uniqueConstraints= {@UniqueConstraint(columnNames= {"employeeEmail"})})
public class Employee {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long id;
	@Column(nullable = false)
	private String employeeName;
	@Column(nullable = false)
	private String employeeEmail;
	@Column(nullable = false)
	private long employeeAssignProject;
	@Column(nullable = false)
	private String employeeBaseLocation;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public long getEmployeeAssignProject() {
		return employeeAssignProject;
	}
	public void setEmployeeAssignProject(long employeeAssignProject) {
		this.employeeAssignProject = employeeAssignProject;
	}
	public String getEmployeeBaseLocation() {
		return employeeBaseLocation;
	}
	public void setEmployeeBaseLocation(String employeeBaseLocation) {
		this.employeeBaseLocation = employeeBaseLocation;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", employeeEmail=" + employeeEmail
				+ ", employeeAssignProject=" + employeeAssignProject + ", employeeBaseLocation=" + employeeBaseLocation
				+ "]";
	}
	

}
