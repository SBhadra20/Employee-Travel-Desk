package com.cognizant.employeetraveldesk.travelplanner.entities;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TravelBudgetAllocations")
@NoArgsConstructor
@Getter
@Setter
public class TravelBudgetAllocations {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@OneToOne
	@JoinColumn(name = "travelrequestid")
	private TravelRequests TravelRequests;

	@Column(name = "approvedbudget")
	private int ApprovedBudget;

	@Column(name = "approvedmodeoftravel", length = 10)
	private String ApprovedModeOfTravel;

	@Column(name = "approvedhotelstarrating", length = 6)
	private String ApprovedHotelStarRating;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the travelRequestId
	 */

	/**
	 * @return the approvedBudget
	 */
	public int getApprovedBudget() {
		return ApprovedBudget;
	}

	/**
	 * @param approvedBudget the approvedBudget to set
	 */
	public void setApprovedBudget(int approvedBudget) {
		ApprovedBudget = approvedBudget;
	}

	/**
	 * @return the approvedModeOfTravel
	 */
	public String getApprovedModeOfTravel() {
		return ApprovedModeOfTravel;
	}

	/**
	 * @param approvedModeOfTravel the approvedModeOfTravel to set
	 */
	public void setApprovedModeOfTravel(String approvedModeOfTravel) {
		ApprovedModeOfTravel = approvedModeOfTravel;
	}

	/**
	 * @return the approvedHotelStarRating
	 */
	public String getApprovedHotelStarRating() {
		return ApprovedHotelStarRating;
	}

	/**
	 * @param approvedHotelStarRating the approvedHotelStarRating to set
	 */
	public void setApprovedHotelStarRating(String approvedHotelStarRating) {
		ApprovedHotelStarRating = approvedHotelStarRating;
	}

	/**
	 * 
	 */
	public TravelBudgetAllocations() {
		super();
		// TODO Auto-generated constructor stub
	}

}
