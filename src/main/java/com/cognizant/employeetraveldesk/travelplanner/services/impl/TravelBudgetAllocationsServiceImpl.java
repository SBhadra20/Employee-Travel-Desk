package com.cognizant.employeetraveldesk.travelplanner.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.cognizant.employeetraveldesk.travelplanner.entities.TravelBudgetAllocations;
import com.cognizant.employeetraveldesk.travelplanner.payloads.TravelBudgetAllocationsDto;
import com.cognizant.employeetraveldesk.travelplanner.repositories.TravelBudgetAllocationsRepo;
import com.cognizant.employeetraveldesk.travelplanner.services.TravelBudgetAllocationsService;

public class TravelBudgetAllocationsServiceImpl implements TravelBudgetAllocationsService{

	@Autowired
	private TravelBudgetAllocationsRepo travelBudgetAllocationsRepo;
	
	@Override
	public TravelBudgetAllocationsDto updateTravelRequests(TravelBudgetAllocationsDto travelBudgetAllocationsDto, Integer RequestId) {
		// TODO Auto-generated method stub
		TravelBudgetAllocations travelBudgetAllocations = this.TravelBudgetAllocationsDtoToTravelBudgetAllocations(travelBudgetAllocationsDto);
		TravelBudgetAllocations travelBudgetAllocations1 = this.travelBudgetAllocationsRepo.findById(RequestId).get();
		this.travelBudgetAllocationsRepo.delete(travelBudgetAllocations1);
		this.travelBudgetAllocationsRepo.save(travelBudgetAllocations);
		return travelBudgetAllocationsDto;
	}

	@Override
	public TravelBudgetAllocations TravelBudgetAllocationsDtoToTravelBudgetAllocations(TravelBudgetAllocationsDto travelBudgetAllocationsDto) {
		// TODO Auto-generated method stub
		TravelBudgetAllocations travelBudgetAllocations = new TravelBudgetAllocations();
		travelBudgetAllocations.setId(travelBudgetAllocationsDto.getId());
		travelBudgetAllocations.setTravelRequestId(travelBudgetAllocationsDto.getTravelRequestId());
		travelBudgetAllocations.setApprovedBudget(travelBudgetAllocationsDto.getApprovedBudget());
		travelBudgetAllocations.setApprovedModeOfTravel(travelBudgetAllocationsDto.getApprovedModeOfTravel());
		travelBudgetAllocations.setApprovedHotelStarRating(travelBudgetAllocationsDto.getApprovedHotelStarRating());
		return travelBudgetAllocations;
	}

	@Override
	public TravelBudgetAllocationsDto TravelBudgetAllocationsToTravelBudgetAllocationsDto(TravelBudgetAllocations travelBudgetAllocations) {
		// TODO Auto-generated method stub
		TravelBudgetAllocationsDto travelBudgetAllocationsDto = new TravelBudgetAllocationsDto();
		travelBudgetAllocationsDto.setId(travelBudgetAllocations.getId());
		travelBudgetAllocationsDto.setTravelRequestId(travelBudgetAllocations.getTravelRequestId());
		travelBudgetAllocationsDto.setApprovedBudget(travelBudgetAllocations.getApprovedBudget());
		travelBudgetAllocationsDto.setApprovedModeOfTravel(travelBudgetAllocations.getApprovedModeOfTravel());
		travelBudgetAllocationsDto.setApprovedHotelStarRating(travelBudgetAllocations.getApprovedHotelStarRating());
		return travelBudgetAllocationsDto;
	}
}
