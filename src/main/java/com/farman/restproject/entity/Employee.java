package com.farman.restproject.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name = "Employees", schema = "HR")
public class Employee implements Serializable {

	private static final long serialVersionUID = -1587951205612354228L;

	@Id
	@SequenceGenerator(name = "emp_seq_generator", sequenceName = "EMPLOYEES_SEQ", schema = "HR", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq_generator")
	private Long employeeId;

	private String firstName;

	private String lastName;

	private String email;

	private String phoneNumber;

	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date hireDate;

	private String jobId;

	private Long salary;

	private Long commissionPct;

	private Long managerId;

	private Long departmentId;

	@OneToMany
	@JoinColumn(name = "employee_Id")
	private List<JobHistory> histories;

	public List<JobHistory> getHistories() {
		return histories;
	}

	public void setHistories(List<JobHistory> histories) {
		this.histories = histories;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public Long getCommissionPct() {
		return commissionPct;
	}

	public void setCommissionPct(Long commissionPct) {
		this.commissionPct = commissionPct;
	}

	public Long getManagerId() {
		return managerId;
	}

	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
