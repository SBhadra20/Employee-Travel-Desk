package com.cognizant.employeetraveldesk.travelplanner.services;

import java.util.List;

import com.cognizant.employeetraveldesk.travelplanner.entities.TravelRequests;
import com.cognizant.employeetraveldesk.travelplanner.payloads.TravelRequestsDto;

public interface TravelRequestsService {

	TravelRequestsDto createTravelRequests(TravelRequestsDto TravelRequests);

	TravelRequestsDto updateTravelRequests(TravelRequestsDto TravelRequests, Integer RequestId);

	TravelRequestsDto getTravelRequestsById(Integer RequestId);

	List<TravelRequestsDto> addTravelRequests();

	List<TravelRequestsDto> getAllTravelRequests();

	void deleteTravelRequests(Integer RequestId);

}
