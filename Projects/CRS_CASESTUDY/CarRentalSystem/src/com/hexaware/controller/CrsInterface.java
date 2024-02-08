package com.hexaware.controller;

import com.hexaware.model.Lease;

public interface CrsInterface {
	
	//Customer
	public void addCustomer();
	
	public void updateCustomerInfo();

	public void viewCustomer();
	
	public void removeCustomer();
	
	public void showCustomerById();

		
	
	//Lease
	public void addLease();
	
	public void viewLease();
	
	public Lease showLeaseDetail();
	
	public void showLeaseList();
	
	public void showTotalLeaseCost();
	
	public void removeLease();
	
	
	
	
	//Vehicle
	public void addVehicle();

	public void updateVehicleAvailability();

	public void viewVehicle();
	
	public void removeVehicle();
	
	public void listOfAvailableVehicle();
	
	public void listOfRentedVehicles();
	
	public void showVehicleById();
	
	
	
	
	
	//Payment
	public void addPayment();

	public void viewPayment();
	
	public void leasePayment();
	
	public void showPaymentByCustomer();
	
	public void totalPayRevenue();
}
