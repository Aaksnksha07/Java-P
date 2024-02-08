package com.hexaware.controller;

import java.util.ArrayList;


import java.util.List;
import java.util.Scanner;

import com.hexaware.dao.SISDao;
import com.hexaware.model.*;





public class SisController implements SisInterface{
	
	
	List<Student> stuList = new ArrayList<Student>();
	List<Enrollment> enrList = new ArrayList<Enrollment>();
	List<Course> corList = new ArrayList<Course>();
	List<Payment> payList = new ArrayList<Payment>();
	List<Teacher> teachList = new ArrayList<Teacher>();
	
	Student s1 ;
	Enrollment e1;
	Course c1;
	Payment p1;
	Teacher t1;
	
	Scanner sc = new Scanner(System.in);
	
	SISDao dao = new SISDao();
	public void addStudent() {
		s1 = new Student();
		System.out.println("*Enter Student Detail*");
		
		System.out.println("Enter Student ID : ");
		int Sid = sc.nextInt();
		s1.setStudentID(Sid);
		
		System.out.println("Enter First Name : ");
		String Sfirstname = sc.next();
		s1.setFirstName(Sfirstname);
		
		System.out.println("Enter Last Name : ");
		String Slastname = sc.next();
		s1.setLastName(Slastname);
		
		System.out.println("Enter Date Of Birth(YYYY-MM-DD): ");
		String Sdob = sc.next();
		s1.setDateOfBirth(Sdob);
		
		System.out.println("Enter Email : ");
		String Semail = sc.next();
		s1.setEmail(Semail);
		
		System.out.println("Enter Phone Number : ");
		String Sphno = sc.next();
		s1.setPhoneNumber(Sphno);
		
		
		stuList.add(s1);
		dao.createStudent(s1);
		System.out.println("Student " + Sid + " added Successfully...");
				
		
	}
	
	public void viewStudent() {

		System.out.println(" **"+stuList+"** ");
		
		stuList.forEach((s1)->System.out.println(s1));

		System.out.println("Data from DB");
		dao.showStudent();
	}

	
	public void addTeacher() {
		t1 = new Teacher();
		System.out.println("*Enter Teacher Detail*");
		
		System.out.println("Enter Teacher ID : ");
		int Tid = sc.nextInt();
		t1.setTeacherId(Tid);
		
		System.out.println("Enter First Name : ");
		String Tfirstname = sc.next();
		t1.setFirstName(Tfirstname);
		
		System.out.println("Enter Last Name : ");
		String Tlastname = sc.next();
		t1.setLastName(Tlastname);
		
		System.out.println("Enter Email : ");
		String Temail = sc.next();
		t1.setEmail(Temail);
		
		
		teachList.add(t1);
		dao.createTeacher(t1);
		System.out.println("Teacher " + Tid + " added Successfully...");	
		
	}
	
	public void viewTeacher() {
		// System.out.println(" Sid: " +s1.getStudentID()+",  Sfirstname: " +s1.getFirstName()+ ",  Slastname: " + s1.getLastName()+",  Sdob: " + s1.getDateOfBirth()+",  Semail: " + s1.getEmail()+",  Sphnno: "+s1.getPhoneNumber());
		System.out.println(" **"+teachList+"** ");
			
		teachList.forEach((t1)->System.out.println(t1));

		System.out.println("Data from DB");
		dao.showTeacher();
	}

	
	public void addCourse() {
		c1 = new Course();
		System.out.println("*Enter Course Detail*");
		
		System.out.println("Enter Course ID : ");
		int Cid = sc.nextInt();
		c1.setCourseID(Cid);
		
		System.out.println("Enter Course Name : ");
		String Cname = sc.next();
		c1.setCourseName(Cname);
		
		System.out.println("Enter Course Credits : ");
		int Cred = sc.nextInt();
		c1.setCourseCredits(Cred);
		
		System.out.println("Enter Teacher ID : ");
		int Tid = sc.nextInt();
		t1.setTeacherId(Tid);
		
		
		
		corList.add(c1);
		dao.createCourse(c1);
		System.out.println("Course " + Cid + " added Successfully...");
				
		
	}
	
	public void viewCourse() {
		// System.out.println(" Sid: " +s1.getStudentID()+",  Sfirstname: " +s1.getFirstName()+ ",  Slastname: " + s1.getLastName()+",  Sdob: " + s1.getDateOfBirth()+",  Semail: " + s1.getEmail()+",  Sphnno: "+s1.getPhoneNumber());
		System.out.println(" **"+corList+"** ");
		
		corList.forEach((c1)->System.out.println(c1));
		System.out.println("Data from DB");
		dao.showCourse();
	}
	
	

	public void addEnrollment() {
		e1 = new Enrollment();
		System.out.println("*Enter Enrollment Detail*");
		
		System.out.println("Enter enrollment ID : ");
		int Eid = sc.nextInt();
		e1.setEnrollmentId(Eid);
		
		System.out.println("Enter Student ID : ");
		int Sid = sc.nextInt();
		e1.setStudentId(Sid);
		
		System.out.println("Enter Course ID : ");
		int Cid = sc.nextInt();
		e1.setCourseId(Cid);
		
		System.out.println("Enter EnrollmentDate : ");
		String eDate = sc.next();
		e1.setEnrollmentDate(eDate);
		
		
		
		enrList.add(e1);
		dao.createEnrollment(e1);
		System.out.println("Enrollment " + Eid + " added Successfully...");
				
		
	}
	
	public void viewEnrollment() {
		// System.out.println(" Sid: " +s1.getStudentID()+",  Sfirstname: " +s1.getFirstName()+ ",  Slastname: " + s1.getLastName()+",  Sdob: " + s1.getDateOfBirth()+",  Semail: " + s1.getEmail()+",  Sphnno: "+s1.getPhoneNumber());
		System.out.println(" **"+enrList+"** ");
		
		enrList.forEach((e1)->System.out.println(e1));
		System.out.println("Data from DB");
		dao.showEnrollment();
	}




	
	public void addPayment() {
		p1 = new Payment();
		System.out.println("*Enter Payment Detail*");
		
		System.out.println("Enter Payment ID : ");
		int Pid = sc.nextInt();
		p1.setPaymentId(Pid);
		
		System.out.println("Enter Student ID : ");
		int Sid = sc.nextInt();
		(p1).setStudentId(Sid);
		
		System.out.println("Enter Amount : ");
		int Pamount = sc.nextInt();
		p1.setAmount(Pamount);
		
		System.out.println("Enter paymentDate : ");
		String paymentDate = sc.next();
		p1.setPaymentDate(paymentDate);
		
		System.out.println("Enter payForCourse ID : ");
		int Pcid = sc.nextInt();
		p1.setPayforcourseid(Pcid);
		
	
		payList.add(p1);
		
		dao.createPayment(p1);
		System.out.println("Payment " + Pid + " added Successfully...");
				
		
	}
	
	public void viewPayment() {

		System.out.println(" **"+payList+"** ");
	
		payList.forEach((p1)->System.out.println(p1));
		System.out.println("Data from DB");
		dao.showPayment();
	}

	
	@Override
	public void updateStudent() {
		dao.updateStudent();

	}

	@Override
	public void deleteStudent() {
		System.out.println("Enter StudentID");
		int StudentID = sc.nextInt();
		dao.deleteStudent(StudentID);

	}

}
