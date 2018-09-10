package com.farman.restproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.farman.restproject.entity.Location;
import com.farman.restproject.service.LocationService;

@RestController
@RequestMapping("/location")
public class LocationController {

	@Autowired
	LocationService locationService;

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public Location getLocationDetail(@RequestParam(value = "LocationId") String locationId) {
		Location location = locationService.getLocationById(Long.valueOf(locationId));
		System.out.println(location.getCountry());
		return locationService.getLocationById(Long.valueOf(locationId));
	}

}
