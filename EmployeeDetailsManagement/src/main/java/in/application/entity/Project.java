package in.application.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="project", uniqueConstraints= {@UniqueConstraint(columnNames= {"projectcode"})})
public class Project {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
 private long id;
	@Column(nullable=false)
	private long projectCode;
	@Column(nullable=false)
	private String projectName;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "Project [id=" + id + ", projectCode=" + projectCode + ", projectName=" + projectName + "]";
	}
	
 
}
