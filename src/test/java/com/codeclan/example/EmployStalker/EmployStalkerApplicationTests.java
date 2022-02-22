package com.codeclan.example.EmployStalker;

import com.codeclan.example.EmployStalker.models.Department;
import com.codeclan.example.EmployStalker.models.Employee;
import com.codeclan.example.EmployStalker.models.Project;
import com.codeclan.example.EmployStalker.repositories.DepartmentRepository;
import com.codeclan.example.EmployStalker.repositories.EmployeeRepository;
import com.codeclan.example.EmployStalker.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployStalkerApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	DepartmentRepository departmentRepository;
	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void  createEmployeeAndDepartment(){

		Department tech = new Department("Tech");
		departmentRepository.save(tech);

		Employee andrew = new Employee("Andrew","Garfield",28,"SK24","Andrew@GHotYahooMailApple.com",tech);
		employeeRepository.save(andrew);
	}

	@Test
	public void addEmployeesAndProjects(){
		Department tech = new Department("Tech");
		departmentRepository.save(tech);

		Employee andrew = new Employee("Andrew","Garfield",28,"SK24","Andrew@GHotYahooMailApple.com",tech);
		employeeRepository.save(andrew);

		Project project = new Project("SPRING","15 Days");
		projectRepository.save(project);

		project.addEmployee(andrew);
		projectRepository.save(project);

	}



}
