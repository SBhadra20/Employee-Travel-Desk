package com.cognizant.employeetraveldesk.travelplanner.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.employeetraveldesk.travelplanner.entities.TravelBudgetAllocations;

public interface TravelBudgetAllocationsRepo extends JpaRepository<TravelBudgetAllocations, Integer> {

	
}
