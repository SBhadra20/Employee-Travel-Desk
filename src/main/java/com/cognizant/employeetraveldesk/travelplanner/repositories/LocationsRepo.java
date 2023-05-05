package com.cognizant.employeetraveldesk.travelplanner.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.employeetraveldesk.travelplanner.entities.Locations;

public interface LocationsRepo extends JpaRepository<Locations, Integer>{
		
}
