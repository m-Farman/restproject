package com.farman.restproject.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import com.farman.restproject.entity.Employee;

public interface EmployeeService {

	public List<Employee> getTopNSalariedEmployee(int noOfEmployees) throws EntityNotFoundException;

}