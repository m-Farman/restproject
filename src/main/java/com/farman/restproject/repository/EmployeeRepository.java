package com.farman.restproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farman.restproject.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
