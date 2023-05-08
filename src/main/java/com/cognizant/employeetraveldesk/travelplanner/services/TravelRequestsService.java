package com.cognizant.employeetraveldesk.travelplanner.services;

import com.cognizant.employeetraveldesk.travelplanner.entities.TravelRequests;
import com.cognizant.employeetraveldesk.travelplanner.payloads.TravelRequestsDto;

public interface TravelRequestsService {

	TravelRequestsDto addTravelRequests(TravelRequestsDto travelRequestsDto);

	TravelRequestsDto updateTravelRequests(TravelRequestsDto travelRequestsDto, Integer RequestId);

	TravelRequestsDto getTravelRequestsByRequestId(Integer RequestId);
	
	TravelRequestsDto getTravelRequestsByHRId(Integer HRid);
	
	TravelRequests TravelRequestsDtoToTravelRequests(TravelRequestsDto travelRequestsDto);
	
	TravelRequestsDto TravelRequestsToTravelRequestsDto(TravelRequests travelRequests);

}
