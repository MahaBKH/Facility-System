package com.facility.Domain.facility;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.facility.Domain.facility.FacilityAddressImp;
import com.facility.Domain.facility.FacilityDetailsImp;
import com.facility.Domain.facility.FacilityImp;


public class FacilityImpTest {
	public static FacilityImp fac;
	public static FacilityAddressImp address;
	public static FacilityDetailsImp details;
	//public static  ArrayList<FacilityImp> facilityList = new ArrayList<FacilityImp>();
	
	
	
	
	@Before
	public void setUp(){
		address = new FacilityAddressImp("1110 Sheridan", "AL", "USA", 33303);
		details = new FacilityDetailsImp(100, address, "55555555");
		fac = new FacilityImp("Peet's", "11", details);

	}


	@Test
	public void testGetName() {
	assertEquals("Peet's", fac.getName());	
	}

	
	@Test
	public void testSetName() {
	fac.setName("N");	
	assertEquals("N", fac.getName());		
	}

	@Test
	public void testGetFacilityId() {
	fac.setFacilityId("673");
	assertEquals("673", fac.getFacilityId());
	}

	@Test
	public void testSetFacilityId() {
		fac.setFacilityId("73");
		assertEquals("73", fac.getFacilityId());
	}

	
	@Test
	public void testGetDetails() {
		assertEquals(details, fac.getDetails());
	}

	
	@Test
	public void testSetDetails() {
		fac.getDetails().getAddress().setZip(2002);
		fac.getDetails().getAddress().setCountry("USA");
		fac.getDetails().getAddress().setState("MN");
		fac.getDetails().getAddress().setStreet("20025 W Alam");
		fac.getDetails().setCapacity(50);
		fac.getDetails().setPhone("222");
		
		assertEquals(details, fac.getDetails());	
	}
	
	//RETURNS LIST OF ALL FACILITIES, Notes how many facilities total by getting list size
	@Test
	public void testListFacilities() {
		//System.out.println(fac.getAllFacilities());
		assertEquals(8, fac.getAllFacilities().size());	
	}

	//GETS FACILITY INFORMATION 
	@Test 
	public void testGetFacilityInformation() {
		FacilityAddressImp address = new FacilityAddressImp("1110 Sheridan", "AL", "USA", 33303);
		FacilityDetailsImp details = new FacilityDetailsImp(100, address, "55555555");
		FacilityImp fac4 = new FacilityImp("Peet's", "11", details);
		
		
		//TODO: ADD ALL FACILITY INFORMATION INTO TEST INSTEAD OF JUST DETAILS
		ArrayList<Object> ans = new ArrayList<>();
		ans.add(fac4.getName());
		ans.add( fac4.getFacilityId());
		ans.add(fac4.getDetails());
		
		assertEquals(details, fac4.getDetails());
	}
	
	
	//TESTS AVAILABLE CAPACITY
	@Test 
	public void testRequestAvailableCapacity() {
		assertEquals(100, fac.getDetails().getCapacity());
	}
	
	@Test
	public void testAddFacilityDetail() {
		FacilityAddressImp address = new FacilityAddressImp("1110 Sheridan", "AL", "USA", 33303);
		FacilityDetailsImp details = new FacilityDetailsImp(50, address, "6305551315");
		fac.addFacilityDetail(details);
		assertEquals(details, fac.getDetails());
	}
	
	@Test
	public void testremoveFacility() {
		fac.getAllFacilities().remove(2);
		System.out.println(fac.getAllFacilities().size());
		assertEquals(4, fac.getAllFacilities().size());
	}

	
}
