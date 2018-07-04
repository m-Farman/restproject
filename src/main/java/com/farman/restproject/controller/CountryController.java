package com.farman.restproject.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.farman.restproject.entity.Country;
import com.farman.restproject.exception.ResourceNotFoundException;
import com.farman.restproject.repository.CountryRepository;

@RestController
@RequestMapping("/hrapi/country")
public class CountryController {

	@Autowired
	CountryRepository countryRepository;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Country> getAllCountries() {
		return countryRepository.findAll();
	}

	@RequestMapping(value = "/{Id}", method = RequestMethod.GET)
	public Country getCountryById(@PathVariable(value = "Id") String Id) {
		return countryRepository.findById(Id).orElseThrow(() -> new ResourceNotFoundException("Country", "Id", Id));
	}

	@RequestMapping(value = "/multiple", method = RequestMethod.GET)
	public List<Country> getCountryByIds(@RequestParam(value = "Id") String Ids) {
		return countryRepository.findAllById(Arrays.asList(Ids.split(",")));
	}

	@RequestMapping(value = "/count", method = RequestMethod.GET)
	public long getCount() {
		return countryRepository.count();
	}
}
