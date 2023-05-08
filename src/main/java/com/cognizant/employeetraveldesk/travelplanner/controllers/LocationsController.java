package com.cognizant.employeetraveldesk.travelplanner.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.employeetraveldesk.travelplanner.payloads.LocationsDto;
import com.cognizant.employeetraveldesk.travelplanner.services.impl.LocationsServiceImpl;

@RestController
@RequestMapping("/api/travelrequests")
public class LocationsController {
	
	@Autowired
	private LocationsServiceImpl locationsServiceImpl;
	
	// returns all locations
	@GetMapping("/locations")
	public List<LocationsDto> getAllLocations() {
		return locationsServiceImpl.getAllLocations();
	}
}
