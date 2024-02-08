package com.hexaware.model;


public class Payment {
	private int paymentId ;
	private int studentId ;
	private int amount ;
	private String paymentDate ;
	private int payforcourseid;
	
	public Payment() {
		
	}
	
	public Payment(int paymentId, int studentId, int amount, String paymentDate, int payforcourseid )
	{
        this.paymentId = paymentId;
        this.studentId = studentId;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.payforcourseid =payforcourseid;
    }
	
	
	public int getPaymentId() {
		return paymentId;
	}
	public int getStudentId() {
		return studentId;
	}
	public int getAmount() {
		return amount;
	}
	public String getPaymentDate() {
		return paymentDate;
	}
	public int getPayforcourseid() {
		return payforcourseid;
	}

	
	
	
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public void setPayforcourseid(int payforcourseid) {
		this.payforcourseid = payforcourseid;
	}
	
	

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", studentId=" + studentId + ", amount=" + amount + ", paymentDate="
				+ paymentDate + ", payforcourseid=" + payforcourseid + "]";
	}

	
}
