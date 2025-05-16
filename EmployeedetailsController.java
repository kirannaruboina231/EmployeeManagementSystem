package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employeedetails;
import com.example.demo.service.EmployeeServiceImplementaion;

@RestController
@RequestMapping("/emp")

public class EmployeedetailsController {

	@Autowired
	EmployeeServiceImplementaion emploeeServiceImplementaion;
	
	@PostMapping("/postemp")
	public Employeedetails createEmployee(@RequestBody Employeedetails employeedetails) {
		return emploeeServiceImplementaion.createEmployee(employeedetails);
	}
	
	@GetMapping("/employees")
	public List<Employeedetails> getEmployeedetailsAll() {
		return emploeeServiceImplementaion.fetchAllEmployee();
	}
	
	@GetMapping("/employee/{id}")
	public Employeedetails getEmployeeById(@PathVariable int id) {
		return emploeeServiceImplementaion.fetchEmployeeById(id);
	}
	
	@PutMapping("/updateemp")
	public Employeedetails updateEmployee(@RequestBody Employeedetails employeedetails) {
		return emploeeServiceImplementaion.updateEmployee(employeedetails);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return emploeeServiceImplementaion.deleteEmployee(id);
	}
	
	
}
