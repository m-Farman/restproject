package com.farman.restproject.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import com.farman.restproject.entity.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public List<Employee> getTopNSalariedEmployee(int noOfEmployees) throws EntityNotFoundException {
		return null;
	}

}
