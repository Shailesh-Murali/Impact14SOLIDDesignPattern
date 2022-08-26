package com.cts.Project.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.cts.Project.DTO.ProjectDTO;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.client.RestTemplate;

public class ProjectTestClient {

	private static final Log LOGGER = LogFactory.getLog(ProjectTestClient.class);

	public static void main(String[] args) {

		ProjectDTO project = new ProjectDTO(4, "Amazon", 60000.00,20,60, LocalDate.of(2025, 01, 31), "Chris");
		
		//addProjectDetails(project);
		getAllProjectDetails();
		updateProjectDetails(project);
		getAllProjectDetails();
		deleteCustomer(4);
		getAllProjectDetails();

	}

	private static void addProjectDetails(ProjectDTO project) {
		String url = "http://localhost:8095/projectdetails";
		RestTemplate restTemplate = new RestTemplate();
		String response = restTemplate.postForObject(url, project, String.class);
		LOGGER.debug(response);
		LOGGER.debug("\n");
	}
	
	public static void getAllProjectDetails() {
		String url = "http://localhost:8095/projectdetails";
		RestTemplate restTemplate = new RestTemplate();
		List<ProjectDTO> projects = restTemplate.getForObject(url, ArrayList.class);
		LOGGER.debug(projects);
		LOGGER.debug("\n");
	}
	
	public static void updateProjectDetails(ProjectDTO project) {
		String url = "http://localhost:8095/projectdetails";
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.put(url, project);
		LOGGER.info("Project updated successfully");
		LOGGER.info("\n");
	}

	public static void deleteCustomer(Integer projectId) {
		String url = "http://localhost:8095/projectdetails/{id}";
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.delete(url, projectId);
		LOGGER.info("Project deleted successfully");
		LOGGER.info("\n");
	}

}
