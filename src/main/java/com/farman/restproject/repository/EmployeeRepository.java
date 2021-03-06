package com.farman.restproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.farman.restproject.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query("Select distinct p.salary from Employee p where p.departmentId in (:dpIds)")
	List<Long> findByDepartmentIds(@Param("dpIds") List<Long> deaprtmentId);

	@Query(value = "select * from (Select * from employees order by salary desc) where rownum<= :limit", nativeQuery = true)
	List<Employee> geTopNSalariedEmployee(@Param("limit") int n);

	List<Employee> findByDepartmentIdIsIn(List<Long> deaprtmentId);

	Employee findByEmployeeId(Long employeeId);

}
