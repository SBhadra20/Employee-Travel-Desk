package com.cognizant.employeetraveldesk.travelplanner.payloads;

import java.sql.Date;

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
	private Date RequestRaisedOn;
	private Date FromDate;
	private Date ToDate;
    private String PurposeOfTravel;
	private int LocationId; 
	private String RequestStatus;
	private Date RequestApprovedOn;
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
	public Date getRequestRaisedOn() {
		return RequestRaisedOn;
	}
	public void setRequestRaisedOn(Date requestRaisedOn) {
		RequestRaisedOn = requestRaisedOn;
	}
	public Date getFromDate() {
		return FromDate;
	}
	public void setFromDate(Date fromDate) {
		FromDate = fromDate;
	}
	public Date getToDate() {
		return ToDate;
	}
	public void setToDate(Date toDate) {
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
	public Date getRequestApprovedOn() {
		return RequestApprovedOn;
	}
	public void setRequestApprovedOn(Date requestApprovedOn) {
		RequestApprovedOn = requestApprovedOn;
	}
	public String getPriority() {
		return Priority;
	}
	public void setPriority(String priority) {
		Priority = priority;
	}

	
}
