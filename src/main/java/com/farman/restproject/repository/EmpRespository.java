package com.farman.restproject.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.farman.restproject.beans.ManagerDetails;

@Repository
public class EmpRespository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	private String empTreeQuery="SELECT DISTINCT \n" + 
								"    manager_id,\n" + 
								"    job_id\n" + 
								"FROM\n" + 
								"    employees \n" + 
								"START with employee_id = ?\n" + 
								"    CONNECT BY\n" + 
								"    PRIOR manager_id = employee_id";

	public List<ManagerDetails> getManagerTreeOfEmployee(int employeeId) {

		return jdbcTemplate.query(empTreeQuery, new Object[] { employeeId },
				(rs, rowNum) -> new ManagerDetails(rs.getInt("manager_id"), rs.getString("job_id")));
	}
}
