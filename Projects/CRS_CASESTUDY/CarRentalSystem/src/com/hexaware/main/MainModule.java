package com.hexaware.main;

import java.util.Scanner;



import com.hexaware.controller.CrsController;
import com.hexaware.controller.CrsInterface;

// import controller and interface from package controller

public class MainModule {

	public static void main(String[] args) {
		System.out.println("\n**********************************");
		System.out.println("***WELCOME TO CAR RENTAL SYSTEM***");
		System.out.println("**********************************\n");
		
		CrsInterface scon = new CrsController(); 
		try (Scanner sc = new Scanner(System.in)) {
			String ch=null;
			do {
			System.out.println("* Enter your choice *");
			System.out.println("------------------------------------------");
			System.out.println("****Vehicle Management****");
			System.out.println("1.Show Vehicle");
			System.out.println("2.Add Vehicle");
			System.out.println("3.Update Vehicle Availability");
			System.out.println("4.Show Vehicle Detail ByID");
			System.out.println("5.List Of Available Vehicle");
			System.out.println("6.List Of Rented Vehicles");
			System.out.println("7.Remove Vehicle");
			System.out.println("------------------------------------------");
			
			System.out.println("****Customer Management****");
			System.out.println("8.View Customer");
			System.out.println("9.Add Customer");
			System.out.println("10.Update Customer Detail");
			System.out.println("11.Show Customer Detail ByID");
			System.out.println("12.Remove Customer");
			System.out.println("------------------------------------------");
			
			System.out.println("****Lease Management****");
			System.out.println("13.View Lease");
			System.out.println("14.Add Lease");
			System.out.println("15.Show Lease Detail ByID");
			System.out.println("16.Show Total Lease Cost");
			System.out.println("------------------------------------------");
			
			System.out.println("****Payment Management****");
			System.out.println("17.View Payment");
			System.out.println("18.Add Payment");
			System.out.println("19.Show Payment ByCustomer");
			System.out.println("20.Show Lease Payments");
			System.out.println("------------------------------------------");
			
			
			
			
			
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				scon.viewVehicle();
				break;
			}
			case 2: {
				scon.addVehicle();
				break;
			}
			case 3: {
				scon.updateVehicleAvailability();
				break;
			}
			case 4: {
				scon.showVehicleById();
				break;
			}
			case 5: {
				scon.listOfAvailableVehicle();
				break;
			}
			case 6: {
				scon.listOfRentedVehicles();
				break;
			}
			case 7: {
				scon.removeVehicle();
				break;
			}
			
			
			case 8: {
				scon.viewCustomer();
				break;
			}
			case 9: {
				scon.addCustomer();
				break;
			}
			case 10: {
				scon.updateCustomerInfo();
				break;
			}
			case 11: {
				scon.showCustomerById();
				break;
			}
			case 12: {
				scon.removeCustomer();
				break;
			}
			
			
			case 13: {
				scon.viewLease();
				break;
			}
			case 14: {
				scon.addLease();
				break;
			}
			case 15: {
				scon.showLeaseDetail();
				break;
			}
			case 16: {
				scon.showTotalLeaseCost();
				break;
			}
			
			
			
			case 17: {
				scon.viewPayment();
				break;
			}
			case 18: {
				scon.addPayment();
				break;
			}
			case 19: {
				scon.showPaymentByCustomer();
				break;
			}
			case 20: {
				scon.leasePayment();
				break;
			}
			default: {
				System.out.println("Enter a valid choice ");
				break;
			}
			}
			System.out.println("do you want to continue ? Y or y");
			ch=sc.next();
			}while(ch.equals("Y") ||ch.equals("y"));
			
		}
		System.out.println("\n**********************************");
		System.out.println("Thanks for using our system...");
		System.out.println("**********************************\n");
		System.exit(0);		
			
	}

}
