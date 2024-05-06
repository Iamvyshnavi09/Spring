package in.application.service;

import in.application.entity.Project;

public interface ProjectService {

	
	public Project saveProject(Project project);
	public Project getProjectByCode(long projectcode);
}
