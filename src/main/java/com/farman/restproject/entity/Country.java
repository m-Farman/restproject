package com.farman.restproject.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Countries")
public class Country implements Serializable {

	private static final long serialVersionUID = -7496700346108994214L;

	@Id
	private String countryId;

	@Column(nullable = false, updatable = false)
	private String countryName;

	@Column(nullable = false, updatable = false)
	private int regionId;

	@OneToMany
	// @JoinTable(name = "mapped", joinColumns = { @JoinColumn(name = "c_id") },
	// inverseJoinColumns = {
	// @JoinColumn(name = "l_id") })
	@JoinColumn(name = "COUNTRY_ID")
	private List<Location> locations;

	public List<Location> getLocations() {
		return locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}

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
