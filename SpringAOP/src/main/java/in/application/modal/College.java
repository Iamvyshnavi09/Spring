package in.application.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class College {
@GeneratedValue(strategy = GenerationType.AUTO)	
@Id
 private int ClassRoom;
 private String CollegeName;
 private String CollegeLocation;
 private int passpercentage;
public int getClassRoom() {
	return ClassRoom;
}
public void setClassRoom(int classRoom) {
	ClassRoom = classRoom;
}
public String getCollegeName() {
	return CollegeName;
}
public void setCollegeName(String collegeName) {
	CollegeName = collegeName;
}
public String getCollegeLocation() {
	return CollegeLocation;
}
public void setCollegeLocation(String collegeLocation) {
	CollegeLocation = collegeLocation;
}
public int getPasspercentage() {
	return passpercentage;
}
public void setPasspercentage(int passpercentage) {
	this.passpercentage = passpercentage;
}
public College(int classRoom, String collegeName, String collegeLocation, int passpercentage) {
	super();
	ClassRoom = classRoom;
	CollegeName = collegeName;
	CollegeLocation = collegeLocation;
	this.passpercentage = passpercentage;
}
public College() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "College [ClassRoom=" + ClassRoom + ", CollegeName=" + CollegeName + ", CollegeLocation=" + CollegeLocation
			+ ", passpercentage=" + passpercentage + "]";
}
 
 
}
