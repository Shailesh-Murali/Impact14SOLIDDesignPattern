package com.cts.Project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.Project.DTO.ProjectDTO;
import com.cts.Project.Service.ProjectService;

@RestController
public class ProjectController {

	@Autowired
	public ProjectService projectService;

	@GetMapping("/projectdetails")
	public ResponseEntity<List<ProjectDTO>> getAllProjectDetails() {

		List<ProjectDTO> projects = projectService.getProjectDetailsList();
		return new ResponseEntity<List<ProjectDTO>>(projects, HttpStatus.OK);
	}
	
	@PostMapping("/projectdetails")
	public ResponseEntity<Integer> addProjectDetails(@RequestBody ProjectDTO project)
	{
		int id=projectService.addProjectDetails(project);
		return new ResponseEntity<Integer>(id,HttpStatus.CREATED);	
	}
	
	@PutMapping("/projectdetails")
	public ResponseEntity<String> updateProjectDetails(@RequestBody ProjectDTO project)
	{
		projectService.updateProjectDetails(project);
		return new ResponseEntity<String>("Updated Successfully",HttpStatus.OK);	
	}
	
	@DeleteMapping("/projectdetails/{id}")
	public ResponseEntity<String> deleteProjectDetails(@PathVariable("id") int projectId)
	{
		projectService.deleteProjectDetails(projectId);
		return new ResponseEntity<String>("Deleted Successfully",HttpStatus.OK);	
	}

}
