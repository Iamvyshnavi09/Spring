package in.application.payload;





public class EmployeeDto {
	
	private long id;
	private String employeeName;
	private String employeeEmail;
	private String employeeBaseLocaton;
	private long projectCode;
	private String projectName;
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
	public String getEmployeeBaseLocaton() {
		return employeeBaseLocaton;
	}
	public void setEmployeeBaseLocaton(String employeeBaseLocaton) {
		this.employeeBaseLocaton = employeeBaseLocaton;
	}
	public long getProjectCode() {
		return projectCode;
	}
	public void setProjectCode(long projectCode) {
		this.projectCode = projectCode;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

}
