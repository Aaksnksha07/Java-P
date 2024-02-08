package com.hexaware.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hexaware.dao.CarLeaseRepositoryImplDao;
import com.hexaware.model.*;

public class CrsController implements CrsInterface{


	List<Customer> customerList = new ArrayList<Customer>();
	List<Lease> leaseList = new ArrayList<Lease>();
	List<Payment> paymentList = new ArrayList<Payment>();
	List<Vehicle> vehicleList = new ArrayList<Vehicle>();
	
	Customer cus;
	Lease les;
	Vehicle vcl;
	Payment pay;
	
	Scanner sc = new Scanner(System.in);
	
	CarLeaseRepositoryImplDao dao = new CarLeaseRepositoryImplDao();
	
	
	
// Customer
	
	public void addCustomer() {
		
		cus = new Customer();
		
		System.out.println("*Enter Customer Detail*");
		
		System.out.println("Enter Customer ID : ");
		int customerID = sc.nextInt();
		cus.setCustomerID(customerID);
		
		System.out.println("Enter First Name : ");
		String firstname = sc.next();
		cus.setFirstName(firstname);
		
		System.out.println("Enter Last Name : ");
		String lastName = sc.next();
		cus.setLastName(lastName);
		
		System.out.println("Enter Email : ");
		String email = sc.next();
		cus.setEmail(email);
		
		System.out.println("Enter Phone Number : ");
		String phoneNumber = sc.next();
		cus.setPhoneNumber(phoneNumber);
		
		
		customerList.add(cus);
		dao.createCustomer(cus);
		System.out.println("Customer " + customerID + " added Successfully...");
				
		
	}
	
	public void updateCustomerInfo() {
		cus = new Customer();
		
		System.out.println("Enter Customer ID : ");
		int customerID = sc.nextInt();
		cus.setCustomerID(customerID);
		
		System.out.println("Enter First Name : ");
		String firstname = sc.next();
		cus.setFirstName(firstname);
		
		System.out.println("Enter Last Name : ");
		String lastName = sc.next();
		cus.setLastName(lastName);
		
		System.out.println("Enter Email : ");
		String email = sc.next();
		cus.setEmail(email);
		
		System.out.println("Enter Phone Number : ");
		String phoneNumber = sc.next();
		cus.setPhoneNumber(phoneNumber);

		dao.updateCustomer(cus);
		
	}
	
	public void showCustomerById() {

		System.out.println("Enter Customer ID : ");
		int customerID = sc.nextInt();
		dao.findCustomerById(customerID);
	
	}
	
	
	public void viewCustomer() {

		System.out.println(" **"+customerList+"** ");
		
		customerList.forEach((cus)->System.out.println(cus));

		System.out.println("Data from DB");
		dao.showCustomer();
	}
	
	public void removeCustomer() {
		System.out.println("Enter CustomerID");
		int customerID = sc.nextInt();
		dao.removeCustomer(customerID);;

	}
	
	
	
// Lease	
	
	public void addLease() {
		
		les = new Lease();
		
		System.out.println("*Enter Lease Detail*");
		
		System.out.println("Enter Lease ID : ");
		int leaseID = sc.nextInt();
		les.setLeaseID(leaseID);
		
		System.out.println("Enter Vehicle ID : ");
		int vehicleID = sc.nextInt();
		les.setVehicleID(vehicleID);
		
		System.out.println("Enter customer ID : ");
		int customerID = sc.nextInt();
		les.setCustomerID(customerID);
		
		System.out.println("Enter Start Date : ");
		String startDate = sc.next();
		les.setStartDate(startDate);
		
		System.out.println("Enter End Date : ");
		String endDate = sc.next();
		les.setEndDate(endDate);
		
		System.out.println("Enter Type : ");
		String type = sc.next();
		les.setType(type);
		
		System.out.println("Enter Days : ");
		int days = sc.nextInt();
		les.setDays(days);
		
		
		leaseList.add(les);
		dao.createLease(les);
		System.out.println("Lease " + leaseID + " added Successfully...");	
		
	}
	
	
	public void viewLease() {

		System.out.println(" **"+leaseList+"** ");
			
		leaseList.forEach((les)->System.out.println(les));

		System.out.println("Data from DB");
		dao.showLease();
	}
	
	public Lease showLeaseDetail() {
		System.out.println("Enter Lease ID : ");
		int leaseID = sc.nextInt();
		return dao.findLeaseById(leaseID);
	}
	
	
    public void showTotalLeaseCost() {
		dao.showTotalLeaseCost();
	}
	
    
	public void showLeaseList(){
		dao.showLeaseList();
	
	}
	
	public void removeLease(){

		System.out.println("Enter Lease ID : ");
		int leaseID = sc.nextInt();
		dao.removeLease(leaseID);
	}
	
	
	
	
//Vehicle
	
	public void addVehicle() {
		
		vcl = new Vehicle();
		
		System.out.println("*Enter Vehicle Detail*");
		
		System.out.println("Enter Vehicle ID : ");
		int vehicleID = sc.nextInt();
		vcl.setVehicleID(vehicleID);
		
		System.out.println("Enter Make : ");
		String make = sc.next();
		vcl.setMake(make);
		
		System.out.println("Enter Model : ");
		String model = sc.next();
		vcl.setModel(model);
		
		System.out.println("Enter DailyRate : ");
		int dailyRate = sc.nextInt();
		vcl.setDailyRate(dailyRate);
		
		System.out.println("Enter Status : ");
		String status = sc.next();
		vcl.setStatus(status);
		
		System.out.println("Enter PassengerCapacity : ");
		int passengerCapacity = sc.nextInt();
		vcl.setPassengerCapacity(passengerCapacity);
		
		System.out.println("Enter EngineCapacity : ");
		String engineCapacity = sc.next();
		vcl.setEngineCapacity(engineCapacity);
		
		
		
		vehicleList.add(vcl);
		dao.createVehicle(vcl);
		System.out.println("Vehicle " + vehicleID + " added Successfully...");
				
		
	}
	
	
	public void updateVehicleAvailability() {
		
		vcl = new Vehicle();
		
		System.out.println("Enter Vehicle ID : ");
		int vehicleID = sc.nextInt();
		vcl.setVehicleID(vehicleID);
		
		System.out.println("Enter Status : ");
		String status = sc.next();
		vcl.setStatus(status);
		
		dao.updateVehicleAvailability(vcl);
	}
	
	public void removeVehicle(){

		System.out.println("Enter Vehicle ID : ");
		int vehicleID = sc.nextInt();
		dao.removeVehicleById(vehicleID);
	}
	
	
	public void showVehicleById(){
		System.out.println("Enter Vehicle ID : ");
		int vehicleID = sc.nextInt();
		dao.findVehicleById(vehicleID);
	
	}
	
	public void viewVehicle() {

		System.out.println(" **"+vehicleList+"** ");
		
		vehicleList.forEach((vcl)->System.out.println(vcl));
		System.out.println("Data from DB");
		dao.showVehicle();
	}
	
	public void listOfAvailableVehicle() {
	dao.listAvailableVehicles();	
	}
		
	
	public void listOfRentedVehicles() {
		dao.listRentedVehicles();
	}
			

	
//Payment
	
	
	public void addPayment() {
		
		pay = new Payment();
		
		System.out.println("*Enter Payment Detail*");
		
		System.out.println("Enter Payment ID : ");
		int paymentID = sc.nextInt();
		pay.setPaymentID(paymentID);
		
		System.out.println("Enter Lease ID : ");
		int leaseID = sc.nextInt();
		(pay).setLeaseID(leaseID);
		
		System.out.println("Enter PaymentDate : ");
		String paymentDate = sc.next();
		pay.setPaymentDate(paymentDate);
		
		System.out.println("Enter Amount : ");
		int amount = sc.nextInt();
		pay.setAmount(amount);
		
	
		paymentList.add(pay);
		
		dao.createPayment(pay);
		System.out.println("Payment " + paymentID + " added Successfully...");
				
		
	}
	
	public void viewPayment() {

		System.out.println(" **"+ paymentList +"** ");
	
		paymentList.forEach((pay)->System.out.println(pay));
		System.out.println("Data from DB");
		dao.showPayment();
	}


	public void leasePayment() {
		dao.recordPayment();
	}
	
	
	public void showPaymentByCustomer() {
		System.out.println("Enter customer ID : ");
		int customerID = sc.nextInt();
		dao.paymentByCustomer(customerID);
	}
	
	public void totalPayRevenue() {
		int totalRevenue = dao.showtotalRevenue();
		System.out.println("Total Revenue Rs."+totalRevenue);
	}

	
}