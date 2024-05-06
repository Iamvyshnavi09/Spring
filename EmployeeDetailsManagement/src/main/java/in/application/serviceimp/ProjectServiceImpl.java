package in.application.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.application.entity.Project;
import in.application.repository.ProjectRepository;
import in.application.service.ProjectService;

@Service
public class ProjectServiceImpl  implements ProjectService{
	
	
	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public Project saveProject(Project project) {
		Project saveProject = projectRepository.save(project);
		return saveProject;
	}

	@Override
	public Project getProjectByCode(long projectcode) {
		Project findByProjectCode = projectRepository.findByProjectCode(projectcode);
		return findByProjectCode;
	}

}
