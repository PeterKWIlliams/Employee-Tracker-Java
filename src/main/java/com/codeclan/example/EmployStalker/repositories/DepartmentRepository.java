package com.codeclan.example.EmployStalker.repositories;

import com.codeclan.example.EmployStalker.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
