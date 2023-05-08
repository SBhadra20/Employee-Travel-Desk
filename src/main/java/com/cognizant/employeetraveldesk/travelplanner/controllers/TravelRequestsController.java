package com.cognizant.employeetraveldesk.travelplanner.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.employeetraveldesk.travelplanner.payloads.TravelRequestsDto;
import com.cognizant.employeetraveldesk.travelplanner.services.impl.TravelRequestsServiceImpl;


@RestController
@RequestMapping("/api/travelrequests")
public class TravelRequestsController {

	@Autowired
	private TravelRequestsServiceImpl travelRequestsServiceImpl;
	
	//return a request by request id
	@GetMapping("/{RequestId}")
	public TravelRequestsDto getTravelRequestsByRequestId(@PathVariable Integer RequestId) {
		return travelRequestsServiceImpl.getTravelRequestsByRequestId(RequestId);
	}
	
	//return all pending requests for HR id
	@GetMapping("/{HRid}/pending")
	public TravelRequestsDto getTravelRequestsByHRId(@PathVariable Integer HRid) {
		return travelRequestsServiceImpl.getTravelRequestsByRequestId(HRid);
	}
	
	// insert a new travel request
	@PostMapping("/new")
	public TravelRequestsDto addTravelRequests(@RequestBody TravelRequestsDto travelRequestsDto) {
		return travelRequestsServiceImpl.addTravelRequests(travelRequestsDto);
	}
	
		
}
