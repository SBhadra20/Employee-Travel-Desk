package com.employeetraveldesk.suraj.entities;

import java.sql.Date;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="TravelRequests")
@NoArgsConstructor
@Getter
@Setter
public class TravelRequests {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int RequestId;
	
	private int RaisedByEmployeeId;
	private int ToBeApprovedByHRId;
	private Date RequestRaisedOn;
	private Date FromDate;
	private Date ToDate;
	@Column(name = "PurposeOfTravel", length = 100)
	private String PurposeOfTravel;
	
	@ManyToOne
	private Locations locationId; 
	@Column(name = "RequestStatus", length = 15)
	private String RequestStatus;
	private Date RequestApprovedOn;
	@Column(name = "Priority", length = 6)
	private String Priority;
	
	/**
	 * @return the requestId
	 */
	public int getRequestId() {
		return RequestId;
	}
	/**
	 * @param requestId the requestId to set
	 */
	public void setRequestId(int requestId) {
		RequestId = requestId;
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
	public Date getRequestRaisedOn() {
		return RequestRaisedOn;
	}
	/**
	 * @param requestRaisedOn the requestRaisedOn to set
	 */
	public void setRequestRaisedOn(Date requestRaisedOn) {
		RequestRaisedOn = requestRaisedOn;
	}
	/**
	 * @return the fromDate
	 */
	public Date getFromDate() {
		return FromDate;
	}
	/**
	 * @param fromDate the fromDate to set
	 */
	public void setFromDate(Date fromDate) {
		FromDate = fromDate;
	}
	/**
	 * @return the toDate
	 */
	public Date getToDate() {
		return ToDate;
	}
	/**
	 * @param toDate the toDate to set
	 */
	public void setToDate(Date toDate) {
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
	public int getLocationId() {
		return LocationId;
	}
	/**
	 * @param locationId the locationId to set
	 */
	public void setLocationId(int locationId) {
		LocationId = locationId;
	}
	/**
	 * @return the requestStatus
	 */
	public String getRequestStatus() {
		return RequestStatus;
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
	public Date getRequestApprovedOn() {
		return RequestApprovedOn;
	}
	/**
	 * @param requestApprovedOn the requestApprovedOn to set
	 */
	public void setRequestApprovedOn(Date requestApprovedOn) {
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
	
	
	
}
