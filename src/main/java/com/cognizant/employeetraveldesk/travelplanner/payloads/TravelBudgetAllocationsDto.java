package com.cognizant.employeetraveldesk.travelplanner.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor 
@Getter
@Setter
public class TravelBudgetAllocationsDto {


	private int id;
	private int TravelRequestId;
	private int ApprovedBudget;
	private String ApprovedModeOfTravel;
	private String ApprovedHotelStarRating;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTravelRequestId() {
		return TravelRequestId;
	}
	public void setTravelRequestId(int travelRequestId) {
		TravelRequestId = travelRequestId;
	}
	public int getApprovedBudget() {
		return ApprovedBudget;
	}
	public void setApprovedBudget(int approvedBudget) {
		ApprovedBudget = approvedBudget;
	}
	public String getApprovedModeOfTravel() {
		return ApprovedModeOfTravel;
	}
	public void setApprovedModeOfTravel(String approvedModeOfTravel) {
		ApprovedModeOfTravel = approvedModeOfTravel;
	}
	public String getApprovedHotelStarRating() {
		return ApprovedHotelStarRating;
	}
	public void setApprovedHotelStarRating(String approvedHotelStarRating) {
		ApprovedHotelStarRating = approvedHotelStarRating;
	}

	
}
