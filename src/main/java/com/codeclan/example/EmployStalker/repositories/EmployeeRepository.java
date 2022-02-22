package com.codeclan.example.EmployStalker.repositories;

import com.codeclan.example.EmployStalker.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {


}
