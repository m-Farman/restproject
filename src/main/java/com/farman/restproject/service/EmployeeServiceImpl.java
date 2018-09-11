package com.farman.restproject.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import com.farman.restproject.entity.Employee;
import com.farman.restproject.repository.EmployeeRepository;

@Configurable(dependencyCheck = true)
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getTopNSalariedEmployee(int noOfEmployees) throws EntityNotFoundException {
		return employeeRepository.geTopNSalariedEmployee(noOfEmployees);
	}

	@Override
	public Employee getEmployeeWithId(Long employeeId) {
		return employeeRepository.findByEmployeeId(employeeId);
	}

}
