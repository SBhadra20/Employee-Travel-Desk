package com.cognizant.employeetraveldesk.travelplanner.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.employeetraveldesk.travelplanner.entities.Locations;
import com.cognizant.employeetraveldesk.travelplanner.repositories.LocationsRepo;

@RestController
@RequestMapping("/locations")
public class LocationsController {
	
	@Autowired
	private LocationsRepo locationsRepo;
	
	// returns all locations
		@GetMapping("all/")
		public List<Locations> getLocations() {
			return locationsRepo.findAll();
		}
}
