package com.farman.restproject.beans;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ManagerDetails {

	private int managerId;
	private String jobId;

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public ManagerDetails(int managerId, String jobId) {
		super();
		this.managerId = managerId;
		this.jobId = jobId;
	}

	class ManagerDetailMapper implements RowMapper<ManagerDetails> {

		@Override
		public ManagerDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
	}
}
