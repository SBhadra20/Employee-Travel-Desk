package com.cognizant.employeetraveldesk.travelplanner.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.employeetraveldesk.travelplanner.entities.TravelRequests;

public interface TravelRequestsRepo extends JpaRepository<TravelRequests, Integer>{

//	TravelRequests addTravelRequests(TravelRequests travelRequestsRepo);

	
}
