package com.hexaware.model;

public class Vehicle {
	private int vehicleID;
	private String make;
	private String	model;
	private int	dailyRate;
	private String	status;
	private int passengerCapacity; 
	private String engineCapacity;
	
	
	
	public Vehicle() {
		super();
	}
	
	public Vehicle(int vehicleID, String make, String model,int dailyRate, String status, int passengerCapacity, String engineCapacity) {
		super();
		this.vehicleID = vehicleID;
		this.make = make;
		this.model = model;
		this.dailyRate = dailyRate;
		this.status = status;
		this.passengerCapacity = passengerCapacity;
		this.engineCapacity = engineCapacity;
	}

	public int getVehicleID() {
		return vehicleID;
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public int getDailyRate() {
		return dailyRate;
	}
	public String getStatus() {
		return status;
	}
	public int getPassengerCapacity() {
		return passengerCapacity;
	}
	public String getEngineCapacity() {
		return engineCapacity;
	}
	
	
	
	
	
	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setDailyRate(int dailyRate) {
		this.dailyRate = dailyRate;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}
	public void setEngineCapacity(String engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleID=" + vehicleID + ", make=" + make + ", model=" + model + ", dailyRate=" + dailyRate
				+ ", status=" + status + ", passengerCapacity=" + passengerCapacity + ", engineCapacity="
				+ engineCapacity + "]";
	}

	
	
	
}
