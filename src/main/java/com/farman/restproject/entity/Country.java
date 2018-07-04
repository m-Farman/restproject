package com.farman.restproject.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Countries")
public class Country implements Serializable {

	private static final long serialVersionUID = -7496700346108994214L;

	@Id
	private String countryId;

	@Column(nullable = false, updatable = false)
	@NotBlank
	private String countryName;

	@Column(nullable = false, updatable = false)
	@NotBlank
	private int regionId;

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getRegionId() {
		return regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

}
