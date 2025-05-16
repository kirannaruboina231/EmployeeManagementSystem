package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employeedetails;

public interface EmployeeService {
	
	public Employeedetails createEmployee(Employeedetails employeedetails);
	
	public List<Employeedetails> fetchAllEmployee();
	
	public Employeedetails fetchEmployeeById(int id);
	
	public Employeedetails updateEmployee(Employeedetails employeedetails);
	
	public String deleteEmployee(int id);

}
