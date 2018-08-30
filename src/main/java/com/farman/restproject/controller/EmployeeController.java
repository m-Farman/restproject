package com.farman.restproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.farman.restproject.beans.ManagerDetails;
import com.farman.restproject.repository.EmpRespository;
import com.farman.restproject.repository.EmployeeRepository;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	EmpRespository empRespository;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<ManagerDetails> getAllCountries(@RequestParam("EmpId") String empId) {
		if (empId == null)
			throw new IllegalArgumentException();
		return empRespository.getManagerTreeOfEmployee(Integer.parseInt(empId));
	}

}
