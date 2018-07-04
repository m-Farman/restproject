package com.farman.restproject.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "Departments", schema = "HR")
public class Department implements Serializable {

	private static final long serialVersionUID = -5966032361409046722L;

	@Id
	@SequenceGenerator(name = "dep_seq_generator", sequenceName = "DEPARTMENTS_SEQ", schema = "HR", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dep_seq_generator")
	private int departmentId;

	@NonNull
	private String departmentName;
	private int managerId;
	private int locationId;

	public int getDepartmentId() {
		return departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public int getManagerId() {
		return managerId;
	}

	public int getLocationId() {
		return locationId;
	}

}
