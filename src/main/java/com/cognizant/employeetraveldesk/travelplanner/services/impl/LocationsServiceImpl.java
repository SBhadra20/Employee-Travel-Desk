package com.cognizant.employeetraveldesk.travelplanner.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.employeetraveldesk.travelplanner.entities.Locations;
import com.cognizant.employeetraveldesk.travelplanner.payloads.LocationsDto;
import com.cognizant.employeetraveldesk.travelplanner.repositories.LocationsRepo;
import com.cognizant.employeetraveldesk.travelplanner.services.LocationsService;

@Service
public class LocationsServiceImpl implements LocationsService {
	
	@Autowired
	private LocationsRepo locationsRepo;

	@Override
	public List<LocationsDto> getAllLocations() {
		List<Locations> list = this.locationsRepo.findAll();
		List<LocationsDto> res = new ArrayList<LocationsDto>();
		for(int i=0;i<list.size();i++) {
		res.add(this.LocationsToLocationsDto(list.get(i)));
		System.out.println(res.get(i).getName());
		}
		return res;
		}
	
	@Override
	public Locations LocationsDtoToLocations(LocationsDto locationsDto) {
	// TODO Auto-generated method stub
	Locations locations = new Locations();
	locations.setId(locationsDto.getId());
	locations.setName(locationsDto.getName());
	return locations;
	}
	
	@Override
	public LocationsDto LocationsToLocationsDto(Locations locations) {
	// TODO Auto-generated method stub
	LocationsDto locationsDto = new LocationsDto();
	locationsDto.setId(locations.getId());
	locationsDto.setName(locations.getName());
	return locationsDto;
	}

}
