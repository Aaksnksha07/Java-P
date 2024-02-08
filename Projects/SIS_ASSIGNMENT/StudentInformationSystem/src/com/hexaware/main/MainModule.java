package com.hexaware.main;

import java.util.Scanner;

import com.hexaware.model.*;
import com.hexaware.controller.SisController;
import com.hexaware.controller.SisInterface;

public class MainModule {

	public static void main(String[] args) {	

		
		System.out.println("***WELCOME TO STUDENT INFORMATION SYSTEM***\n");
			
		SisInterface scon = new SisController(); 
		try (Scanner sc = new Scanner(System.in)) {
			String ch=null;
			do {
			System.out.println("Enter your choice ");
			System.out.println("1.addStudent");
			System.out.println("2.viewStudent");
			System.out.println("3.addTeacher");
			System.out.println("4.viewTeacher");
			System.out.println("5.addCourse");
			System.out.println("6.viewCourse");
			System.out.println("7.addEnrollment");
			System.out.println("8.viewEnrollment");
			System.out.println("9.addPayment");
			System.out.println("10.viewPayment");
		    System.out.println("11.deleteStudent");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				scon.addStudent();
				break;
			}
			case 2: {
				scon.viewStudent();
				break;
			}
			case 3: {
				scon.addTeacher();
				break;
			}
			case 4: {
				scon.viewTeacher();
				break;
			}
			case 5: {
				scon.addCourse();
				break;
			}
			case 6: {
				scon.viewCourse();
				break;
			}
			case 7: {
				scon.addEnrollment();
				break;
			}
			case 8: {
				scon.viewEnrollment();
				break;
			}
			case 9: {
				scon.addPayment();
				break;
			}
			case 10: {
				scon.viewPayment();
				break;
			}
			case 11: {
				scon.deleteStudent();
				break;
			}
//		case 3: {
//			scon.updateStudent();
//			break;
//		}
//		case 4: {
//			scon.deleteStudent();
//			break;
//		}
			default: {
				System.out.println("Enter a valid choice ");
				break;
			}
			}
			System.out.println("do you want to continue ? Y or y");
			ch=sc.next();
			}while(ch.equals("Y") ||ch.equals("y"));
		}
		System.out.println("Thanks for using our system...");
		System.exit(0);		
			


	}

}
