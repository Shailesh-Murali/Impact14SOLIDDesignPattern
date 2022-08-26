package com.cts.Project.Service;

import java.util.List;

import com.cts.Project.DTO.ProjectDTO;

public interface ProjectService {

	List<ProjectDTO> getProjectDetailsList();
	
	int addProjectDetails(ProjectDTO p); 
	
	void updateProjectDetails(ProjectDTO p);
	
	void deleteProjectDetails(int projectId);


}
