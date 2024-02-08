package com.hexaware.testing;

import static org.junit.Assert.assertEquals;

//import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.hexaware.controller.CrsController;
import com.hexaware.dao.CarLeaseRepositoryImplDao;
import com.hexaware.model.Lease;
import com.hexaware.util.DBConnection;


public class LeaseTest extends DBConnection{
	  CrsController cCon;
	  Lease lease;
	  CarLeaseRepositoryImplDao clrI;
	  
	  @Before
		public void setUp(){
			lease = new Lease();
			cCon = new CrsController();
			clrI = new CarLeaseRepositoryImplDao();
		}
		
		@Test
		public void test(){
			
			assertEquals(1,cCon.showLeaseDetail());
	
		}
		
  
}
