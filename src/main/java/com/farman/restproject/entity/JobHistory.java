package com.farman.restproject.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Job_History", schema = "HR")
public class JobHistory implements Serializable {

	private static final long serialVersionUID = -1492436029415365650L;

	@EmbeddedId
	private JobHistoryPK primaryK;

	@NotNull
	@Temporal(TemporalType.DATE)
	private Date endDate;
	@NotNull
	private String jobId;

	private Integer departmentId;

	public Date getEndDate() {
		return endDate;
	}

	public String getJobId() {
		return jobId;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

}
