package com.employeetraveldesk.suraj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeetraveldesk.suraj.entities.Locations;

public interface LocationsRepo extends JpaRepository<Locations, Integer>{
		
}
