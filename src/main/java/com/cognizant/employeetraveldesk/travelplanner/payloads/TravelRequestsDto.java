package com.cognizant.employeetraveldesk.travelplanner.payloads;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor 
@Getter
@Setter
public class TravelRequestsDto {


	private int RequestId;
	private int RaisedByEmployeeId;
	private int ToBeApprovedByHRId;
	private LocalDate RequestRaisedOn;
	private LocalDate FromDate;
	private LocalDate ToDate;
    private String PurposeOfTravel;
	private int LocationId; 
	private String RequestStatus;
	private LocalDate RequestApprovedOn;
	private String Priority;
	
	public int getRequestId() {
		return RequestId;
	}
	public void setRequestId(int requestId) {
		RequestId = requestId;
	}
	public int getRaisedByEmployeeId() {
		return RaisedByEmployeeId;
	}
	public void setRaisedByEmployeeId(int raisedByEmployeeId) {
		RaisedByEmployeeId = raisedByEmployeeId;
	}
	public int getToBeApprovedByHRId() {
		return ToBeApprovedByHRId;
	}
	public void setToBeApprovedByHRId(int toBeApprovedByHRId) {
		ToBeApprovedByHRId = toBeApprovedByHRId;
	}
	public LocalDate getRequestRaisedOn() {
		return RequestRaisedOn;
	}
	public void setRequestRaisedOn(LocalDate requestRaisedOn) {
		RequestRaisedOn = requestRaisedOn;
	}
	public LocalDate getFromDate() {
		return FromDate;
	}
	public void setFromDate(LocalDate fromDate) {
		FromDate = fromDate;
	}
	public LocalDate getToDate() {
		return ToDate;
	}
	public void setToDate(LocalDate toDate) {
		ToDate = toDate;
	}
	public String getPurposeOfTravel() {
		return PurposeOfTravel;
	}
	public void setPurposeOfTravel(String purposeOfTravel) {
		PurposeOfTravel = purposeOfTravel;
	}
	public int getLocationId() {
		return LocationId;
	}
	public void setLocationId(int locationId) {
		LocationId = locationId;
	}
	public String getRequestStatus() {
		return RequestStatus;
	}
	public void setRequestStatus(String requestStatus) {
		RequestStatus = requestStatus;
	}
	public LocalDate getRequestApprovedOn() {
		return RequestApprovedOn;
	}
	public void setRequestApprovedOn(LocalDate requestApprovedOn) {
		RequestApprovedOn = requestApprovedOn;
	}
	public String getPriority() {
		return Priority;
	}
	public void setPriority(String priority) {
		Priority = priority;
	}

	
}
