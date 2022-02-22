package com.codeclan.example.EmployStalker.repositories;

import com.codeclan.example.EmployStalker.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Long> {
}
