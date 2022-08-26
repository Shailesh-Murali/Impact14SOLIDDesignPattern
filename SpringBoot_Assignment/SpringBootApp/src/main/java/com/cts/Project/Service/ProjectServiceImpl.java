package com.cts.Project.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.Project.DAO.ProjectRepository;
import com.cts.Project.DTO.ProjectDTO;
import com.cts.Project.Entity.Project;

@Service
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	public ProjectRepository repo;

	@Override
	public List<ProjectDTO> getProjectDetailsList() {
		List<ProjectDTO> projectList = new ArrayList<>();
		List<Project> projects = repo.findAll();

		for (Project project : projects) {
			projectList.add(new ProjectDTO(project.getProjectId(), project.getTitle(), project.getBudget(),
					project.getTeamSize(), project.getDuration(), project.getEndDate(), project.getManagerName()));
		}
		return projectList;
	}

	@Override
	public int addProjectDetails(ProjectDTO p) {

		Project project = new Project(p.getProjectId(), p.getTitle(), p.getBudget(), p.getTeamSize(), p.getDuration(),
				p.getEndDate(), p.getManagerName());

		project = repo.save(project);
		return project.getProjectId();

	}

	@Override
	public void updateProjectDetails(ProjectDTO p) {
		

		Optional<Project> projectOpt = repo.findById(p.getProjectId());
		Project project;
		if(projectOpt.isPresent())
		{
			project=projectOpt.get();
			project.setBudget(p.getBudget());
			project.setDuration(p.getDuration());
			project.setEndDate(p.getEndDate());
			project.setManagerName(p.getManagerName());
			project.setTeamSize(p.getTeamSize());
			project.setTitle(p.getTitle());
			repo.save(project);
		}
		

	}

	@Override
	public void deleteProjectDetails(int projectId) {	
		repo.deleteById(projectId);
	}

}
