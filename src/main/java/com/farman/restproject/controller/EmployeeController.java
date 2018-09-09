package com.farman.restproject.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.farman.restproject.beans.ManagerDetails;
import com.farman.restproject.entity.Employee;
import com.farman.restproject.repository.EmpRespository;
import com.farman.restproject.repository.EmployeeRepository;
import com.farman.restproject.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	EmpRespository empRespository;

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/tree", method = RequestMethod.GET)
	public List<ManagerDetails> getManagerTree(@RequestParam("EmpId") String empId) {
		if (empId == null)
			throw new IllegalArgumentException();
		return empRespository.getManagerTreeOfEmployee(Integer.parseInt(empId));
	}

	@RequestMapping(value = "/salary", method = RequestMethod.GET)
	public List<Long> getSalaryInDeparts(@RequestParam("dpIds") String departmentIds) {

		List<Long> ids = Arrays.asList(departmentIds.split(",")).parallelStream().map(Long::parseLong)
				.collect(Collectors.toList());
		return employeeRepository.findByDepartmentIds(ids);
	}

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public List<Employee> getSalaryInDepartments(@RequestParam("dpIds") String departmentIds) {

		List<Long> ids = Arrays.asList(departmentIds.split(",")).parallelStream().map(s -> Long.parseLong(s))
				.collect(Collectors.toList());
		return employeeRepository.findByDepartmentIdIsIn(ids);
	}

	@RequestMapping(value = "/getId", method = RequestMethod.GET)
	public Employee getEmployee(@RequestParam("empId") String empId) {
		return employeeService.getEmployeeWithId(Long.parseLong(empId));

	}
}
