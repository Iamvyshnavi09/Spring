package in.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.application.entity.Project;
import in.application.service.ProjectService;

@RestController
@RequestMapping("/api/project")
public class ProjectController {
	
	@Autowired
	private ProjectService projectservice;
	
	@PostMapping
	public Project createProject(@RequestBody Project project) {
		
		return projectservice.saveProject(project);
		
	}
	
	
	@GetMapping("/{project_code}")
	public Project getProjectByCode(
			@PathVariable(name= "project_code")long project_code) {
		return projectservice.getProjectByCode(project_code);
		
	}

}
