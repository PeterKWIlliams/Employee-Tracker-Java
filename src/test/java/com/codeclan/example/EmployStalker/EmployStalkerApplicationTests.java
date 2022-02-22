package com.codeclan.example.EmployStalker;

import com.codeclan.example.EmployStalker.models.Employee;
import com.codeclan.example.EmployStalker.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployStalkerApplicationTests {
	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void  createEmployee(){
		Employee andrew = new Employee("Andrew","Garfield",28,"SK24","Andrew@GHotYahooMailApple.com");
		employeeRepository.save(andrew);
	}

}
