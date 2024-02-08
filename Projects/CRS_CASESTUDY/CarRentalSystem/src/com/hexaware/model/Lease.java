package com.hexaware.model;

public class Lease {
	private int leaseID;
	private int vehicleID;
	private int customerID;
	private String startDate;
	private String endDate;
	private String type;
	private int days;
	
	public Lease() {
		
	}

	
	public Lease(int leaseID, int vehicleID, int customerID, String startDate, String endDate, String type, int days) {
		super();
		this.leaseID = leaseID;
		this.vehicleID = vehicleID;
		this.customerID = customerID;
		this.startDate = startDate;
		this.endDate = endDate;
		this.type = type;
		this.days = days;
	}


	public int getLeaseID() {
		return leaseID;
	}
	public int getVehicleID() {
		return vehicleID;
	}
	public int getCustomerID() {
		return customerID;
	}
	public String getStartDate() {
		return startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public String getType() {
		return type;
	}
	public int getDays() {
		return days;
	}
	
	
	
	
	public void setLeaseID(int leaseID) {
		this.leaseID = leaseID;
	}
	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setDays(int days) {
		this.days = days;
	}


	@Override
	public String toString() {
		return "Lease [leaseID=" + leaseID + ", vehicleID=" + vehicleID + ", customerID=" + customerID + ", startDate="
				+ startDate + ", endDate=" + endDate + ", type=" + type + ", days=" + days + "]";
	}
	
	
	
}
