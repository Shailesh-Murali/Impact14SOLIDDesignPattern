package com.cts.Project.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.Project.Entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
