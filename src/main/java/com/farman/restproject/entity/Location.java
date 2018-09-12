package com.farman.restproject.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "Locations", schema = "HR")
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property = "locationId")
public class Location implements Serializable {

	private static final long serialVersionUID = 2869048595912286846L;

	@Id
	@SequenceGenerator(name = "locn_seq_generator", sequenceName = "LOCATIONS_SEQ", schema = "HR", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "locn_seq_generator")
	private Long locationId;
	private String streetAddress;
	private String postalCode;
	private String city;
	private String stateProvince;
	@Column(name = "country_Id")
	private String countryId;

	@ManyToOne
	@JoinColumn(name = "country_Id", insertable = false, updatable = false)
	// @JsonManagedReference
	private Country country;

	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStateProvince() {
		return stateProvince;
	}

	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}
