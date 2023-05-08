package com.cognizant.employeetraveldesk.travelplanner.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.employeetraveldesk.travelplanner.entities.TravelRequests;
import com.cognizant.employeetraveldesk.travelplanner.payloads.TravelRequestsDto;
import com.cognizant.employeetraveldesk.travelplanner.repositories.TravelRequestsRepo;
import com.cognizant.employeetraveldesk.travelplanner.services.TravelRequestsService;

@Service
public class TravelRequestsServiceImpl implements TravelRequestsService {

	@Autowired
	private TravelRequestsRepo travelRequestsRepo;
	
	@Override
	public TravelRequestsDto addTravelRequests(TravelRequestsDto travelRequestsDto) {
		// TODO Auto-generated method stub
		TravelRequests travelRequests = this.TravelRequestsDtoToTravelRequests(travelRequestsDto);
		this.travelRequestsRepo.save(travelRequests);
		return travelRequestsDto;
	}

	@Override
	public TravelRequestsDto updateTravelRequests(TravelRequestsDto travelRequestsDto, Integer RequestId) {
		// TODO Auto-generated method stub
		TravelRequests travelRequests = this.TravelRequestsDtoToTravelRequests(travelRequestsDto);
		TravelRequests travelRequests1 = this.travelRequestsRepo.findById(RequestId).get();
		this.travelRequestsRepo.delete(travelRequests1);
		this.travelRequestsRepo.save(travelRequests);
		return travelRequestsDto;
	}

	@Override
	public TravelRequestsDto getTravelRequestsByRequestId(Integer RequestId) {
		// TODO Auto-generated method stub
		TravelRequests travelRequests = this.travelRequestsRepo.findById(RequestId).get();
		TravelRequestsDto travelRequestsDto = this.TravelRequestsToTravelRequestsDto(travelRequests);
		return travelRequestsDto;
	}
	
	@Override
	public TravelRequestsDto getTravelRequestsByHRId(Integer HRid) {
		// TODO Auto-generated method stub
		TravelRequests travelRequests = this.travelRequestsRepo.findById(HRid).get();
		TravelRequestsDto travelRequestsDto = this.TravelRequestsToTravelRequestsDto(travelRequests);
		return travelRequestsDto;
	}

	@Override
	public TravelRequests TravelRequestsDtoToTravelRequests(TravelRequestsDto travelRequestsDto) {
		TravelRequests travelRequests = new TravelRequests();
		travelRequests.setRequestId(travelRequestsDto.getRequestId());
		travelRequests.setRaisedByEmployeeId(travelRequestsDto.getRaisedByEmployeeId());
		travelRequests.setToBeApprovedByHRId(travelRequestsDto.getToBeApprovedByHRId());
		travelRequests.setRequestRaisedOn(travelRequestsDto.getRequestRaisedOn());
		travelRequests.setFromDate(travelRequestsDto.getFromDate());
		travelRequests.setToDate(travelRequestsDto.getToDate());
		travelRequests.setPurposeOfTravel(travelRequestsDto.getPurposeOfTravel());
		travelRequests.setLocationId(travelRequestsDto.getLocationId());
		travelRequests.setRequestStatus(travelRequestsDto.getRequestStatus());
		travelRequests.setRequestApprovedOn(travelRequestsDto.getRequestApprovedOn());
		travelRequests.setPriority(travelRequestsDto.getPriority());
		
		return travelRequests;
	}
	
	@Override
	public TravelRequestsDto TravelRequestsToTravelRequestsDto(TravelRequests travelRequests) {
		TravelRequestsDto travelRequestsDto = new TravelRequestsDto();
		travelRequestsDto.setRequestId(travelRequests.getRequestId());
		travelRequestsDto.setRaisedByEmployeeId(travelRequests.getRaisedByEmployeeId());
		travelRequestsDto.setToBeApprovedByHRId(travelRequests.getToBeApprovedByHRId());
		travelRequestsDto.setRequestRaisedOn(travelRequests.getRequestRaisedOn());
		travelRequestsDto.setFromDate(travelRequests.getFromDate());
		travelRequestsDto.setToDate(travelRequests.getToDate());
		travelRequestsDto.setPurposeOfTravel(travelRequests.getPurposeOfTravel());
		travelRequestsDto.setLocationId(travelRequests.getLocationId());
		travelRequestsDto.setRequestStatus(travelRequests.getRequestStatus());
		travelRequestsDto.setRequestApprovedOn(travelRequests.getRequestApprovedOn());
		travelRequestsDto.setPriority(travelRequests.getPriority());
		
		return travelRequestsDto;
	}
	


}
