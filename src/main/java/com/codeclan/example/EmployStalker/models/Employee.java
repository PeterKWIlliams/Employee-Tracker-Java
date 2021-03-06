package com.codeclan.example.EmployStalker.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name ="Last_name")
    private String lastName;

    @Column(name ="age")
    private int age;

    @Column(name="employee_number")
    private String employeeNumber;

    @Column(name="email")
    private String email;

    @ManyToOne
    @JoinColumn(name="department_id",nullable = false)
    @JsonIgnoreProperties({"employees"})
    private Department department;

    @ManyToMany
    @JsonIgnoreProperties({"employees"})
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name="employees_projects",
            joinColumns = {@JoinColumn(
                    name = "employee_id",
                    nullable = false,
                    updatable = false
            )},inverseJoinColumns = {@JoinColumn(
                    name ="project_id",
                    nullable = false,
                    updatable = false
    )}
    )
    private List<Project> projects;


    public Employee(String firstName, String lastName, int age, String employeeNumber, String email, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.employeeNumber = employeeNumber;
        this.email = email;
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Employee(){

    }
    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;

    }
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void addProject(Project project){
        this.projects.add(project);
    }




}
