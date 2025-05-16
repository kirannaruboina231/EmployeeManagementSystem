package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employeedetails;
import com.example.demo.repository.EmployeedetailsRepository;


@Service
public class EmployeeServiceImplementaion implements EmployeeService {

	@Autowired
	EmployeedetailsRepository employeedetailsRepository;
	
	@Override
	public Employeedetails createEmployee(Employeedetails employeedetails) {
		return employeedetailsRepository.save(employeedetails);
	}

	@Override
	public List<Employeedetails> fetchAllEmployee() {
	
		return employeedetailsRepository.findAll();
	}

	@Override
	public Employeedetails fetchEmployeeById(int id) {
		return employeedetailsRepository.findById(id).orElse(null);
	}

	@Override
	public Employeedetails updateEmployee(Employeedetails employeedetails) {
		return employeedetailsRepository.save(employeedetails);
	}

	@Override
	public String deleteEmployee(int id) {
		employeedetailsRepository.deleteById(id);
		return "Delete Successfull!!!";
	}

}
