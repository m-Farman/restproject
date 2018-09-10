package com.farman.restproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farman.restproject.entity.Location;
import com.farman.restproject.repository.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	LocationRepository locationRepository;

	@Override
	public Location getLocationById(Long locationId) {
		return locationRepository.findById(locationId).orElse(null);
	}

}
