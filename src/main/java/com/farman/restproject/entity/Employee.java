package com.farman.restproject.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "Employees",schema="HR")
public class Employee implements Serializable {

	private static final long serialVersionUID = -1587951205612354228L;

	@Id
	@SequenceGenerator(name = "emp_seq_generator", sequenceName = "EMPLOYEES_SEQ", schema = "HR", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq_generator")
	private int employeeId;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private int phoneNumber;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date hireDate;
	
	@NonNull
	private String jobId;
	
	private long salary;
	
	private long commissionPct;
	
	private int managerId;
	
	private int departmentId;


	public int getEmployeeId() {
		return employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public String getJobId() {
		return jobId;
	}

	public long getSalary() {
		return salary;
	}

	public long getCommissionPct() {
		return commissionPct;
	}

	public int getManagerId() {
		return managerId;
	}

	public int getDepartmentId() {
		return departmentId;
	}

}
