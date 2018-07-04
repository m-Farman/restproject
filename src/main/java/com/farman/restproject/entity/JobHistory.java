package com.farman.restproject.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Job_History", schema = "HR")
public class JobHistory implements Serializable {

	private static final long serialVersionUID = -1492436029415365650L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date startDate;

	@NotNull
	@Temporal(TemporalType.DATE)
	private Date endDate;
	@NotNull
	private String jobId;

	private int departmentId;

	public int getEmployeeId() {
		return employeeId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public String getJobId() {
		return jobId;
	}

	public int getDepartmentId() {
		return departmentId;
	}

}
