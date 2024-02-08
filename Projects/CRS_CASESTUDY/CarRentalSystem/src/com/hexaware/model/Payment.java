package com.hexaware.model;

public class Payment {
	private int paymentID;
	private int leaseID;
	private String paymentDate;
	private int amount;
	
	public  Payment() {
		
	}
	
	
	public Payment(int paymentID, int leaseID, String paymentDate, int amount) {
		super();
		this.paymentID = paymentID;
		this.leaseID = leaseID;
		this.paymentDate = paymentDate;
		this.amount = amount;
	}


	public int getPaymentID() {
		return paymentID;
	}
	public int getLeaseID() {
		return leaseID;
	}
	public String getPaymentDate() {
		return paymentDate;
	}
	public int getAmount() {
		return amount;
	}
	
	
	
	
	public void setPaymentID(int paymentID) {
		this.paymentID = paymentID;
	}
	public void setLeaseID(int leaseID) {
		this.leaseID = leaseID;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}


	@Override
	public String toString() {
		return "Payment [paymentID=" + paymentID + ", leaseID=" + leaseID + ", paymentDate=" + paymentDate + ", amount="
				+ amount + "]";
	}
	
	
}
