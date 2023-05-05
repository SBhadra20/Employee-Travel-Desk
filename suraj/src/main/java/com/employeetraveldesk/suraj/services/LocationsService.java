package com.employeetraveldesk.suraj.services;

import java.util.List;

import com.employeetraveldesk.suraj.entities.Locations;
import com.employeetraveldesk.suraj.payloads.LocationsDto;

public interface LocationsService {
	
	LocationsDto createLocations(LocationsDto locations);
	LocationsDto updateLocations(LocationsDto locations, Integer id);
	LocationsDto getLocationsById(Integer id);
	List<LocationsDto> getAllLocations();
	void deleteLocations(Integer id);
}
