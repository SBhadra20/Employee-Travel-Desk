package com.cognizant.employeetraveldesk.travelplanner.services;

import java.util.List;

import com.cognizant.employeetraveldesk.travelplanner.entities.Locations;
import com.cognizant.employeetraveldesk.travelplanner.payloads.LocationsDto;

public interface LocationsService {

	List<LocationsDto> getAllLocations();

	Locations LocationsDtoToLocations(LocationsDto locationsDto);

	LocationsDto LocationsToLocationsDto(Locations locations);
}
