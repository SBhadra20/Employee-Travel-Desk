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
	public LocationsDto createLocations(LocationsDto locationsDto) {
		// TODO Auto-generated method stub
		Locations locations = this.LocationsDtoToLocations(locationsDto);
		this.locationsRepo.save(locations);
		return locationsDto;
	}

	@Override
	public LocationsDto updateLocations(LocationsDto locationsDto, Integer id) {
		// TODO Auto-generated method stub
		Locations locations = this.LocationsDtoToLocations(locationsDto);
		Locations locations1 = this.locationsRepo.findById(id).get();
		this.locationsRepo.delete(locations1);
		this.locationsRepo.save(locations);
		return locationsDto;
	}

	@Override
	public LocationsDto getLocationsById(Integer id) {
		Locations locations = this.locationsRepo.findById(id).get();
		LocationsDto locationsDto = this.LocationsToLocationsDto(locations);
		return locationsDto;
	}

	@Override
	public List<LocationsDto> getAllLocations() {
		List<Locations> list = this.locationsRepo.findAll();
		List<LocationsDto> res = new ArrayList<LocationsDto>();
		for(int i=0;i<list.size();i++) {
		res.add(this.LocationsToLocationsDto(list.get(i)));
		}
		return res;
		}


	@Override
	public void deleteLocations(Integer id) {
		// TODO Auto-generated method stub
		Locations locations = this.locationsRepo.findById(id).get();
		this.locationsRepo.delete(locations);
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
	locationsDto.setId(locationsDto.getId());
	locationsDto.setName(locationsDto.getName());
	return locationsDto;
	}

}
