package com.hexaware.dao;

import java.sql.Connection;






import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.hexaware.model.*;
import com.hexaware.util.DBConnection;
import com.hexaware.util.ResultFormatter;

public class CarLeaseRepositoryImplDao{

	Connection con;
	Statement stmt;
	PreparedStatement ps;
	ResultSet rs;
			
			
//Customer 		
			
	Customer cus;

// This is the method to insert a record in the DB.
	 
	public void createCustomer(Customer cus) {
		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement("insert into customer values(?,?,?,?,?)");
			ps.setInt(1, cus.getCustomerID());
			ps.setString(2, cus.getFirstName());
			ps.setString(3, cus.getLastName());
			ps.setString(4, cus.getEmail());
			ps.setString(5, cus.getPhoneNumber());
			int noofrows = ps.executeUpdate();
			System.out.println(noofrows + " inserted Successfully !!!");
		} catch (SQLException e) {

		e.printStackTrace();
	}
 }
	
	
	
	public void findCustomerById(int customerID) {

		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement("SELECT * FROM customer WHERE customerID = ?");
			ps.setInt(1, customerID);
			rs = ps.executeQuery();
			ResultFormatter.printRows(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}


//  This is the method to show a record retrieved from the DB.
	
  public void showCustomer() {
    try {
      con = DBConnection.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from customer");
			while (rs.next()) {
				System.out.println("***************");
				System.out.println("CustomerID " + rs.getInt(1));
				System.out.println("FirstName " + rs.getString(2));
				System.out.println("LastName " + rs.getString(3));
				System.out.println("Email " + rs.getString(4));
				System.out.println("PhoneNumber " + rs.getString(5));
				System.out.println("***************");

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
  
  
  public void removeCustomer(int customerID) {
		try {
			con = DBConnection.getConnection();			
			ps = con.prepareStatement("delete from customer where customerID=?");
			ps.setInt(1, customerID);
			int noofrows = ps.executeUpdate();
			System.out.println(noofrows + " removed Successfully !!!");
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
 }
  
  public void updateCustomer(Customer customer) {
		try {
			con = DBConnection.getConnection();			

			StringBuilder updateQuery = new StringBuilder("UPDATE customer SET ");
	        
			if (customer.getFirstName() != null) {
	            updateQuery.append("firstName = ?, ");
	        }
			if (customer.getLastName() != null) {
	            updateQuery.append("lastName = ?, ");
	        }
	        if (customer.getEmail() != null) {
	            updateQuery.append("email = ?, ");
	        }
	        if (customer.getPhoneNumber() != null) {
	            updateQuery.append("phoneNumber = ?, ");
	        }
	
	        updateQuery.setLength(updateQuery.length() - 2);
	        
	        updateQuery.append(" WHERE customerID = ?");
	        
	        ps = con.prepareStatement(updateQuery.toString());
	        
	        int parameterIndex = 1;
	        if (customer.getFirstName() != null) {
	           ps.setString(parameterIndex++, customer.getFirstName());
	        }
	        if (customer.getLastName() != null) {
	            ps.setString(parameterIndex++, customer.getLastName());
	        }
	        if (customer.getEmail() != null) {
	           ps.setString(parameterIndex++, customer.getEmail());
	        }
	        
	        if (customer.getPhoneNumber() != null) {
	            ps.setString(parameterIndex++, customer.getPhoneNumber());
	        }
	      
	        ps.setInt(parameterIndex, customer.getCustomerID());
			
			int totalRows = ps.executeUpdate();
			System.out.println(totalRows+" rows affected!");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

  
  
  
	
// Lease 
	
   Lease les;

// This is the method to insert a record in the DB.

public void createLease(Lease les) {
try {
	con = DBConnection.getConnection();
	ps = con.prepareStatement("insert into lease values(?,?,?,?,?,?,?)");
	ps.setInt(1, les.getLeaseID());
	ps.setInt(2, les.getVehicleID());
	ps.setInt(3, les.getCustomerID());
	ps.setString(4, les.getStartDate());
	ps.setString(5, les.getEndDate());
	ps.setString(6, les.getType());
	ps.setInt(7, les.getDays());
	int noofrows = ps.executeUpdate();
	System.out.println(noofrows + " inserted Successfully !!!");
} catch (SQLException e) {

	e.printStackTrace();
}
}


//This is the method to show a record retrieved from the DB.

public void showLease() {
try {
con = DBConnection.getConnection();
	stmt = con.createStatement();
	rs = stmt.executeQuery("select * from lease");
	while (rs.next()) {
		System.out.println("***************");
		System.out.println("LeaseID " + rs.getInt(1));
		System.out.println("VehicleID " + rs.getInt(2));
		System.out.println("CustomerID " + rs.getInt(3));
		System.out.println("StartDate " + rs.getString(4));
		System.out.println("EndDate " + rs.getString(5));
		System.out.println("Type " + rs.getString(6));
		System.out.println("Days " + rs.getString(7));
		System.out.println("***************");

	}
} catch (SQLException e) {

	e.printStackTrace();
}
}

		
public List<Lease> showLeaseList() {
	
	List<Lease> leaseList = new ArrayList<Lease>();
	try {
		
		con = DBConnection.getConnection();
		stmt = con.createStatement();
		rs = stmt.executeQuery("select * from lease");
		ResultFormatter.printRows(rs);
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			if (con!= null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	return leaseList;
}		





public Lease findLeaseById(int leaseID) {

	try {
		con = DBConnection.getConnection();
		ps = con.prepareStatement("select * from lease where leaseID = ?");
		ps.setInt(1, leaseID);
		rs = ps.executeQuery();
		ResultFormatter.printRows(rs);
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	return les;
}

public void showTotalLeaseCost(){
	try {
		con = DBConnection.getConnection();
		ps = con.prepareStatement("select l.leaseID,l.days,v.dailyRate,(l.days*v.dailyRate)as totalleasecost from vehicle as v join lease as l on v.vehicleID = l.vehicleID");
		System.out.println();
		rs = ps.executeQuery();
		ResultFormatter.printRows(rs);
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}


public void removeLease(int leaseID) {
		try {
			con = DBConnection.getConnection();			
			ps = con.prepareStatement("delete from lease where leaseID=?");
			ps.setInt(1, leaseID);
			int noofrows = ps.executeUpdate();
			System.out.println(noofrows + " removed Successfully !!!");
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
}




//Vehicle 

Vehicle vcl;

// This is the method to insert a record in the DB.

public void createVehicle(Vehicle vcl) {
	try {
		con = DBConnection.getConnection();
		ps = con.prepareStatement("insert into vehicle values(?,?,?,?,?,?,?)");
		ps.setInt(1, vcl.getVehicleID());
		ps.setString(2, vcl.getMake());
		ps.setString(3, vcl.getModel());
		ps.setInt(4, vcl.getDailyRate());
		ps.setString(5, vcl.getStatus());
		ps.setInt(6, vcl.getPassengerCapacity());
		ps.setString(7, vcl.getEngineCapacity());
		
		int noofrows = ps.executeUpdate();
		System.out.println(noofrows + " inserted Successfully !!!");
	} catch (SQLException e) {

		e.printStackTrace();
	}
}



public void updateVehicleAvailability(Vehicle vehicle) {
	try {
		con = DBConnection.getConnection();	
		ps = con.prepareStatement("UPDATE vehicle SET status = ? WHERE vehicleID = ?");
		ps.setString(1, vehicle.getStatus());
		ps.setInt(2, vehicle.getVehicleID());
		int totalRows = ps.executeUpdate();
		System.out.println(totalRows+" rows affected!");
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}


//This is the method to show a record retrieved from the DB.

public void showVehicle() {
try {
 con = DBConnection.getConnection();
		stmt = con.createStatement();
		rs = stmt.executeQuery("select * from vehicle");
		while (rs.next()) {
			System.out.println("***************");
			System.out.println("vehicleID " + rs.getInt(1));
			System.out.println("make " + rs.getString(2));
			System.out.println("model " + rs.getString(3));
			System.out.println("dailyRate " + rs.getInt(4));
			System.out.println("status " + rs.getString(5));
			System.out.println("passengerCapacity " + rs.getInt(6));
			System.out.println("engineCapacity " + rs.getString(7));
			System.out.println("***************");

		}
	} catch (SQLException e) {

		e.printStackTrace();
	}
}


public void removeVehicleById(int vehicleID) {
		try {
			con = DBConnection.getConnection();			
			ps = con.prepareStatement("delete from vehicle where vehicleID=?");
			ps.setInt(1, vehicleID);
			int noofrows = ps.executeUpdate();
			System.out.println(noofrows + " removed Successfully !!!");
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
}
public void listAvailableVehicles(){

	try {
		con = DBConnection.getConnection();
		ps = con.prepareStatement("SELECT * FROM vehicle WHERE status = 'Available'");
		rs = ps.executeQuery();
		ResultFormatter.printRows(rs);
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

public void listRentedVehicles() {
	try {
		con = DBConnection.getConnection();
		ps = con.prepareStatement("SELECT * FROM vehicle WHERE status = 'NotAvailable'");
		System.out.println();
		rs = ps.executeQuery();
		ResultFormatter.printRows(rs);
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

		
		
public void findVehicleById(int vehicleID) {
	try {
		con = DBConnection.getConnection();
		ps = con.prepareStatement("SELECT * FROM vehicle WHERE vehicleID = ?");
		ps.setInt(1, vehicleID);
		rs = ps.executeQuery();
		ResultFormatter.printRows(rs);
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

		



//PAYMENT

Payment pay;

// This is the method to insert a record in the DB.

public void createPayment(Payment pay) {
	try {
		con = DBConnection.getConnection();
		ps = con.prepareStatement("insert into payment values(?,?,?,?)");
		ps.setInt(1, pay.getPaymentID());
		ps.setInt(2, pay.getLeaseID());
		ps.setString(3, pay.getPaymentDate());
		ps.setInt(4, pay.getAmount());
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
		rs = stmt.executeQuery("select * from payment");
		while (rs.next()) {
			System.out.println("***************");
			System.out.println("Payment ID " + rs.getInt(1));
			System.out.println("Lease ID " + rs.getInt(2));
			System.out.println("PaymentDate " + rs.getString(3));
			System.out.println("Amount " + rs.getInt(4));
			System.out.println("***************");

		}
	} catch (SQLException e) {

		e.printStackTrace();
	}
}



public void recordPayment() {
	try {
		con = DBConnection.getConnection();
		ps = con.prepareStatement("select lease.leaseID,lease.customerID,payment.amount from lease join payment on lease.leaseID = payment.leaseID");
		System.out.println();
		rs = ps.executeQuery();
		ResultFormatter.printRows(rs);
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}


public void paymentByCustomer(int customerID) {

	try {
		con = DBConnection.getConnection();
		ps = con.prepareStatement("select lease.leaseID,lease.customerID,payment.amount from lease join payment on lease.leaseID = payment.leaseID where lease.customerID = ?");
		ps.setInt(1, customerID);
		rs = ps.executeQuery();
		ResultFormatter.printRows(rs);
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

public int showtotalRevenue() {
	int totalRevenue = 0;
	try {
		con = DBConnection.getConnection();
		stmt = con.createStatement();
		rs = stmt.executeQuery("select sum(amount) as totalRevenue from payment");
		if(rs.next()) {
			totalRevenue = rs.getInt(1);
		}
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	return totalRevenue;
}

}
