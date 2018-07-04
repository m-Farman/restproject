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
@Table(name = "Location", schema = "HR")
public class Location implements Serializable {

	private static final long serialVersionUID = 2869048595912286846L;

	@Id
	@SequenceGenerator(name = "locn_seq_generator", sequenceName = "LOCATIONS_SEQ", schema = "HR", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "locn_seq_generator")
	private int locationId;
	private String streetAddress;
	private String postalCode;
	@NonNull
	private String city;
	private String stateProvince;
	private String countryId;

	public int getLocationId() {
		return locationId;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getCity() {
		return city;
	}

	public String getStateProvince() {
		return stateProvince;
	}

	public String getCountryId() {
		return countryId;
	}

}
