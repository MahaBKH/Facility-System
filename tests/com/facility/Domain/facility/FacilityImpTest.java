package com.facility.Domain.facility;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.facility.Domain.facility.FacilityAddressImp;
import com.facility.Domain.facility.FacilityDetailsImp;
import com.facility.Domain.facility.FacilityImp;


public class FacilityImpTest {
	
	
public static FacilityImp facility;
public static FacilityDetailsImp details;
public static FacilityAddressImp address;

	
	
	
	@BeforeClass
	public static void setUp(){
		address = new FacilityAddressImp();
		details = new FacilityDetailsImp();
		facility = new FacilityImp("Peet's", "1236467", details);
		address.setCountry("USA");
		address.setState("IL");
		address.setStreet("1110 Sherdian");
		address.setZip(33303);
		details.setAddress(address);
		details.setCapacity(100);
		details.setPhone("6305552323");
		facility = new FacilityImp("Peet's", "1236467", details);
	}


	@Test
	public void testGetName() {
	
	facility.setName("Peet's");
	
	assertEquals("Peet's", facility.getName());
		
	}

	
	@Test
	public void testSetName() {
	
	facility.setName("N");
		
	assertEquals("N", facility.getName());
			
	}

	@Test
	public void testGetFacilityId() {
	facility.setFacilityId("673");
	
	assertEquals("673", facility.getFacilityId());
	}

	@Test
	public void testSetFacilityId() {
		facility.setFacilityId("73");
		
		assertEquals("73", facility.getFacilityId());

	}

	@Test
	public void testGetDetails() {
		address.setCountry("USA");
		address.setState("IL");
		address.setStreet("1110 South");
		
		details.setAddress(address);
		details.setCapacity(101);
		details.setPhone("555");
		
		assertEquals(details, facility.getDetails());
		
	}

	@Test
	public void testSetDetails() {
		address.setCountry("USA");
		address.setState("IL");
		address.setStreet("1110 South");
		
		details.setAddress(address);
		details.setCapacity(101);
		details.setPhone("555");
		
		assertEquals(details, facility.getDetails());
		
	}

	
}
