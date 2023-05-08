package com.cognizant.employeetraveldesk.travelplanner.entities;

import java.time.LocalDate;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TravelRequests")
@NoArgsConstructor
@Getter
@Setter
public class TravelRequests {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int requestId;

	@Column(name = "raisedbyemployeeid")
	private int RaisedByEmployeeId;
	@Column(name = "tobeapprovedbyhrid")
	private int ToBeApprovedByHRId;
	@Column(name = "requestraisedon")
	private LocalDate RequestRaisedOn;
	@Column(name = "fromdate")
	private LocalDate FromDate;
	@Column(name = "todate")
	private LocalDate ToDate;
	@Column(name = "purposeoftravel", length = 100)
	private String PurposeOfTravel;
//	@Column(name = "locationid")
//	private int LocationId;
	@Column(name = "requeststatus", length = 15)
	private String RequestStatus;
	@Column(name = "requestapprovedon")
	private LocalDate RequestApprovedOn;
	@Column(name = "priority", length = 6)
	private String Priority;

	@OneToOne
	private TravelBudgetAllocations travelBudgetAllocations;
	
	@ManyToOne
	@JoinColumn(name = "locationid")
	private Locations locations;

	/**
	 * @return the requestId
	 */
	public int getRequestId() {
		return requestId;
	}

	/**
	 * @param requestId the requestId to set
	 */
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	/**
	 * @return the raisedByEmployeeId
	 */
	public int getRaisedByEmployeeId() {
		return RaisedByEmployeeId;
	}

	/**
	 * @param raisedByEmployeeId the raisedByEmployeeId to set
	 */
	public void setRaisedByEmployeeId(int raisedByEmployeeId) {
		RaisedByEmployeeId = raisedByEmployeeId;
	}

	/**
	 * @return the toBeApprovedByHRId
	 */
	public int getToBeApprovedByHRId() {
		return ToBeApprovedByHRId;
	}

	/**
	 * @param toBeApprovedByHRId the toBeApprovedByHRId to set
	 */
	public void setToBeApprovedByHRId(int toBeApprovedByHRId) {
		ToBeApprovedByHRId = toBeApprovedByHRId;
	}

	/**
	 * @return the requestRaisedOn
	 */
	public LocalDate getRequestRaisedOn() {
		return RequestRaisedOn;
	}

	/**
	 * @param requestRaisedOn the requestRaisedOn to set
	 */
	public void setRequestRaisedOn(LocalDate requestRaisedOn) {
		RequestRaisedOn = requestRaisedOn;
	}

	/**
	 * @return the fromDate
	 */
	public LocalDate getFromDate() {
		return FromDate;
	}

	/**
	 * @param fromDate the fromDate to set
	 */
	public void setFromDate(LocalDate fromDate) {
		FromDate = fromDate;
	}

	/**
	 * @return the toDate
	 */
	public LocalDate getToDate() {
		return ToDate;
	}

	/**
	 * @param toDate the toDate to set
	 */
	public void setToDate(LocalDate toDate) {
		ToDate = toDate;
	}

	/**
	 * @return the purposeOfTravel
	 */
	public String getPurposeOfTravel() {
		return PurposeOfTravel;
	}

	/**
	 * @param purposeOfTravel the purposeOfTravel to set
	 */
	public void setPurposeOfTravel(String purposeOfTravel) {
		PurposeOfTravel = purposeOfTravel;
	}

	/**
	 * @return the locationId
	 */

	/**
	 * @return the requestStatus
	 */
	public String getRequestStatus() {
		return RequestStatus;
	}

	public Locations getLocations() {
		return locations;
	}

	public void setLocations(Locations locations) {
		this.locations = locations;
	}

	/**
	 * @param requestStatus the requestStatus to set
	 */
	public void setRequestStatus(String requestStatus) {
		RequestStatus = requestStatus;
	}

	/**
	 * @return the requestApprovedOn
	 */
	public LocalDate getRequestApprovedOn() {
		return RequestApprovedOn;
	}

	/**
	 * @param requestApprovedOn the requestApprovedOn to set
	 */
	public void setRequestApprovedOn(LocalDate requestApprovedOn) {
		RequestApprovedOn = requestApprovedOn;
	}

	/**
	 * @return the priority
	 */
	public String getPriority() {
		return Priority;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(String priority) {
		Priority = priority;
	}

	/**
	 * 
	 */
	public TravelRequests() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TravelRequests addTravelRequests(TravelRequests travelRequestsRepo) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getLocationId() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void setLocationId(int locationId) {
		// TODO Auto-generated method stub
//		LocationId = locationId;
	}

}
