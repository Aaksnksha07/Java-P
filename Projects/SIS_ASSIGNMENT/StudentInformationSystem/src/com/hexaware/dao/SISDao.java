package com.hexaware.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.hexaware.model.*;
import com.hexaware.util.DBConnection;
public class SISDao{

			Connection con;
			Statement stmt;
			PreparedStatement ps;
			ResultSet rs;
			
			
//STUDENT 		
			
	Student stu;

// This is the method to insert a record in the DB.
	 
	public void createStudent(Student stu) {
		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement("insert into students values(?,?,?,?,?,?)");
			ps.setInt(1, stu.getStudentID());
			ps.setString(2, stu.getFirstName());
			ps.setString(3, stu.getLastName());
			ps.setString(4, stu.getDateOfBirth());
			ps.setString(5, stu.getEmail());
			ps.setString(6, stu.getPhoneNumber());
			int noofrows = ps.executeUpdate();
			System.out.println(noofrows + " inserted Successfully !!!");
		} catch (SQLException e) {

			e.printStackTrace();
		}
  }


//  This is the method to show a record retrieved from the DB.
	
  public void showStudent() {
    try {
            con = DBConnection.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from students");
			while (rs.next()) {
				System.out.println("***************");
				System.out.println("StudentID " + rs.getInt(1));
				System.out.println("FirstName " + rs.getString(2));
				System.out.println("LastName " + rs.getString(3));
				System.out.println("DateOfBirth " + rs.getString(4));
				System.out.println("Email " + rs.getString(5));
				System.out.println("PhoneNumber " + rs.getString(6));
				System.out.println("***************");

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
  

	public void updateStudent() {
		
		
		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement("update");
		
			int noofrows = ps.executeUpdate();
			System.out.println(noofrows + " updated Successfully !!!");
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	

	public void deleteStudent(int StudentID) {
		try {
			con = DBConnection.getConnection();			
			ps = con.prepareStatement("delete from students where student_id=?");
			ps.setInt(1, StudentID);
			int noofrows = ps.executeUpdate();
			System.out.println(noofrows + " deleted Successfully !!!");
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
		
	
// TEACHER 
	
	Teacher teach;

// This is the method to insert a record in the DB.

public void createTeacher(Teacher teach) {
try {
	con = DBConnection.getConnection();
	ps = con.prepareStatement("insert into teacher values(?,?,?,?)");
	ps.setInt(1, teach.getTeacherId());
	ps.setString(2, teach.getFirstName());
	ps.setString(3, teach.getLastName());
	ps.setString(4, teach.getEmail());
	int noofrows = ps.executeUpdate();
	System.out.println(noofrows + " inserted Successfully !!!");
} catch (SQLException e) {

	e.printStackTrace();
}
}


//This is the method to show a record retrieved from the DB.

public void showTeacher() {
try {
con = DBConnection.getConnection();
	stmt = con.createStatement();
	rs = stmt.executeQuery("select * from teacher");
	while (rs.next()) {
		System.out.println("***************");
		System.out.println("TeacherId " + rs.getInt(1));
		System.out.println("FirstName " + rs.getString(2));
		System.out.println("LastName " + rs.getString(3));
		System.out.println("Email " + rs.getString(4));
		System.out.println("***************");

	}
} catch (SQLException e) {

	e.printStackTrace();
}
}


public void updateTeacher() {


try {
	con = DBConnection.getConnection();
	ps = con.prepareStatement("update");

	int noofrows = ps.executeUpdate();
	System.out.println(noofrows + " updated Successfully !!!");
} catch (SQLException e) {

	e.printStackTrace();
}
}


public void deleteTeacher(int TeacherId) {
try {
	con = DBConnection.getConnection();			
	ps = con.prepareStatement("delete from teacher where teacher_id=?");
	ps.setInt(1, TeacherId);
	int noofrows = ps.executeUpdate();
	System.out.println(noofrows + " deleted Successfully !!!");
} catch (SQLException e) {

	e.printStackTrace();
}
}


//COURSE 

Course cor;

// This is the method to insert a record in the DB.

public void createCourse(Course cor) {
	try {
		con = DBConnection.getConnection();
		ps = con.prepareStatement("insert into courses values(?,?,?,?)");
		ps.setInt(1, cor.getCourseID());
		ps.setString(2, cor.getCourseName());
		ps.setInt(3, cor.getCourseCredits());
		ps.setInt(4, cor.getTeacherId());
		int noofrows = ps.executeUpdate();
		System.out.println(noofrows + " inserted Successfully !!!");
	} catch (SQLException e) {

		e.printStackTrace();
	}
}


//This is the method to show a record retrieved from the DB.

public void showCourse() {
try {
 con = DBConnection.getConnection();
		stmt = con.createStatement();
		rs = stmt.executeQuery("select * from courses");
		while (rs.next()) {
			System.out.println("***************");
			System.out.println("courseID " + rs.getInt(1));
			System.out.println("courseName " + rs.getString(2));
			System.out.println("courseCredits " + rs.getInt(3));
			System.out.println("teacherId " + rs.getInt(4));
			System.out.println("***************");

		}
	} catch (SQLException e) {

		e.printStackTrace();
	}
}


public void updateCourse() {
	
	
	try {
		con = DBConnection.getConnection();
		ps = con.prepareStatement("update");
	
		int noofrows = ps.executeUpdate();
		System.out.println(noofrows + " updated Successfully !!!");
	} catch (SQLException e) {

		e.printStackTrace();
	}
}


public void deleteCourse(int courseID) {
	try {
		con = DBConnection.getConnection();			
		ps = con.prepareStatement("delete from courses where course_id=?");
		ps.setInt(1, courseID);
		int noofrows = ps.executeUpdate();
		System.out.println(noofrows + " deleted Successfully !!!");
	} catch (SQLException e) {

		e.printStackTrace();
	}
}




//ENROLLMENT 

Enrollment enr;

// This is the method to insert a record in the DB.

public void createEnrollment(Enrollment enr) {
	try {
		con = DBConnection.getConnection();
		ps = con.prepareStatement("insert into enrollments values(?,?,?,?)");
		ps.setInt(1, enr.getEnrollmentId());
		ps.setInt(2, enr.getStudentId());
		ps.setInt(3, enr.getCourseId());
		ps.setString(4, enr.getEnrollmentDate());
		int noofrows = ps.executeUpdate();
		System.out.println(noofrows + " inserted Successfully !!!");
	} catch (SQLException e) {

		e.printStackTrace();
	}
}


//This is the method to show a record retrieved from the DB.


public void showEnrollment() {
try {
 con = DBConnection.getConnection();
		stmt = con.createStatement();
		rs = stmt.executeQuery("select * from enrollments");
		while (rs.next()) {
			System.out.println("***************");
			System.out.println("EnrollmentId " + rs.getInt(1));
			System.out.println("StudentId " + rs.getInt(2));
			System.out.println("CourseId " + rs.getInt(3));
			System.out.println("EnrollmentDate " + rs.getString(4));
			System.out.println("***************");

		}
	} catch (SQLException e) {

		e.printStackTrace();
	}
}


public void updateEnrollment() {
	
	
	try {
		con = DBConnection.getConnection();
		ps = con.prepareStatement("update");
	
		int noofrows = ps.executeUpdate();
		System.out.println(noofrows + " updated Successfully !!!");
	} catch (SQLException e) {

		e.printStackTrace();
	}
}


public void deleteEnrollment(int enrollmentId) {
	try {
		con = DBConnection.getConnection();			
		ps = con.prepareStatement("delete from enrollments where enrollment_id=?");
		ps.setInt(1, enrollmentId);
		int noofrows = ps.executeUpdate();
		System.out.println(noofrows + " deleted Successfully !!!");
	} catch (SQLException e) {

		e.printStackTrace();
	}
}


//PAYMENT

Payment pay;

// This is the method to insert a record in the DB.

public void createPayment(Payment pay) {
	try {
		con = DBConnection.getConnection();
		ps = con.prepareStatement("insert into payments values(?,?,?,?,?)");
		ps.setInt(1, pay.getPaymentId());
		ps.setInt(2, pay.getStudentId());
		ps.setInt(3, pay.getAmount());
		ps.setString(4, pay.getPaymentDate());
		ps.setInt(5, pay.getPayforcourseid());
		int noofrows = ps.executeUpdate();
		System.out.println(noofrows + " inserted Successfully !!!");
	} catch (SQLException e) {

		e.printStackTrace();
	}
}


//This is the method to show a record retrieved from the DB.


public void showPayment() {
try {
 con = DBConnection.getConnection();
		stmt = con.createStatement();
		rs = stmt.executeQuery("select * from payments");
		while (rs.next()) {
			System.out.println("***************");
			System.out.println("PaymentId " + rs.getInt(1));
			System.out.println("StudentId " + rs.getInt(2));
			System.out.println("Amount " + rs.getInt(3));
			System.out.println("PaymentDate " + rs.getString(4));
			System.out.println("Payforcourseid " + rs.getInt(5));
			System.out.println("***************");

		}
	} catch (SQLException e) {

		e.printStackTrace();
	}
}


public void updatePayment() {
	
	
	try {
		con = DBConnection.getConnection();
		ps = con.prepareStatement("update");
	
		int noofrows = ps.executeUpdate();
		System.out.println(noofrows + " updated Successfully !!!");
	} catch (SQLException e) {

		e.printStackTrace();
	}
}


public void deletePayment(int StudentId) {
	try {
		con = DBConnection.getConnection();			
		ps = con.prepareStatement("delete from payments where student_id=?");
		ps.setInt(1, StudentId);
		int noofrows = ps.executeUpdate();
		System.out.println(noofrows + " deleted Successfully !!!");
	} catch (SQLException e) {

		e.printStackTrace();
	}
}

}