package com.cognizant.employeetraveldesk.travelplanner.services;

import java.util.List;

import com.cognizant.employeetraveldesk.travelplanner.entities.Locations;
import com.cognizant.employeetraveldesk.travelplanner.payloads.LocationsDto;

public interface LocationsService {

	List<LocationsDto> getAllLocations();
	
	LocationsDto createLocations(LocationsDto locations);

	LocationsDto updateLocations(LocationsDto locations, Integer id);

	LocationsDto getLocationsById(Integer id);

	void deleteLocations(Integer id);
	
	Locations LocationsDtoToLocations(LocationsDto locationsDto);
	
	LocationsDto LocationsToLocationsDto(Locations locations);
}
