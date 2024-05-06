package in.application.modal;

public class Employee   
{  
private int empId;  
private String firstName;  
private String secondName;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getSecondName() {
	return secondName;
}
public void setSecondName(String secondName) {
	this.secondName = secondName;
}  
//default constructor  
public Employee(int empId, String firstName, String secondName) {
	super();
	;
	this.firstName = firstName;
	this.secondName = secondName;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Employee [ firstName=" + firstName + ", secondName=" + secondName + "]";
}
}  

