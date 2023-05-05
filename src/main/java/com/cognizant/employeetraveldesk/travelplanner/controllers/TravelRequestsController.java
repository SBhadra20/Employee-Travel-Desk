package com.cognizant.employeetraveldesk.travelplanner.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.employeetraveldesk.travelplanner.entities.TravelRequests;
import com.cognizant.employeetraveldesk.travelplanner.repositories.TravelRequestsRepo;


@RestController
@RequestMapping("/TravelRequests")
public class TravelRequestsController {

	@Autowired
	private TravelRequestsRepo travelRequestsRepo;
	
	// insert a new travel request
//		@PostMapping("add/")
//		public TravelRequests addTravelRequests(@RequestBody TravelRequests travelRequestsRepo){
//			return this.travelRequestsRepo.addTravelRequests(travelRequestsRepo);
//		}
		
		
}
