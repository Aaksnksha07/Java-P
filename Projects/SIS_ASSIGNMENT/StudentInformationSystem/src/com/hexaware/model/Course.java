package com.hexaware.model;

public class Course {
	private int courseID;
    private String courseName; 
	private int courseCredits;
	private int teacherId;
	
	public Course() {
		
	}
	
	public Course(int courseID, String courseName, int courseCredits, int teacherId )
	{
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
        this.teacherId = teacherId;
    }
	
	
	
	public int getCourseID() {
		return courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public int getCourseCredits() {
		return courseCredits;
	}
	public int getTeacherId() {
		return teacherId;
	}
	
	
	
	
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public void setCourseCredits(int courseCredits) {
		this.courseCredits = courseCredits;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	
	@Override
	public String toString() {
		return "Course [courseID=" + courseID + ", courseName=" + courseName + ", courseCredits=" + courseCredits
				+ ", teacherId=" + teacherId + "]";
	}	
	
}
