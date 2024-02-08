package com.hexaware.model;

public class Student{

	private int	studentID;
	private String firstName; 
	private String lastName; 
	private String dateOfBirth; 
	private String email ;
	private String phoneNumber; 
	
	// Create Constructor without parameters
	public Student() {
		
	}
	
	// Create Constructor with parameters to initialize values
	public Student(int StudentID, String FirstName, String LastName, String DateOfBirth, String Email, String PhoneNumber)
	{
        this.studentID = StudentID;
        this.firstName = FirstName;
        this.lastName = LastName;
        this.dateOfBirth = DateOfBirth;
        this.email = Email;
        this.phoneNumber = PhoneNumber;
    }


	// Create Getters and Setters
	public int getStudentID() {
		return studentID;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	
	
	
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}


}

