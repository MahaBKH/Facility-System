package com.facility.Domain.maintenance;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.facility.Domain.facility.Facility;
import com.facility.Domain.facility.FacilityAddressImp;
import com.facility.Domain.facility.FacilityDetailsImp;
//import com.facility.Domain.facility.Facility;
//import com.facility.Domain.facility.FacilityDetails;
import com.facility.Domain.facility.FacilityImp;

public class MaintenanceImpTest {
	public static MaintenanceImp main;
	public static FacilityImp faci;
	public static FacilityDetailsImp details2;
	public static MaintenanceInspectionImp details;
	public static FacilityAddressImp address;
	public static MaintenanceInspectionImp insp;
	public static Date d1;
	
	
	@Before
	public void setUp() {
		main = new MaintenanceImp(30, insp,faci);
		faci = new FacilityImp ("Shardien","1234",details2);
		details2 = new FacilityDetailsImp(100, address, "666555");
		address = new FacilityAddressImp ("winrhtop", "WA","USA", 606440);
		insp = new MaintenanceInspectionImp (d1," water inspection", "approved", "not urgent","water damage",d1);
			
		
	}
	@Test
	public void testMaintenanceImpIntMaintenanceInspectionImpStringFacilityImpMaintenanceInspectionImp() {
		assertEquals(main,insp,"1234", details);
	}

	//private void assertEquals(MaintenanceImp main2, MaintenanceInspectionImp insp2, String string,
			//MaintenanceInspectionImp details3) {
		// TODO Auto-generated method stub
	
	@Test
	public void testGetFacilityMaintenanceCost() {
		  main.setFacilityMaintenanceCost(333);
		assertEquals((Integer)333,main.getFacilityMaintenanceCost());
	}

	
	@Test
	public void testSetFacilityMaintenanceCost() {
		main.setFacilityMaintenanceCost(150);
		assertEquals((Integer)150, main.getFacilityMaintenanceCost());
	}

	@Test
	public void testGetFacilityMaintenanceDetails() {
		assertEquals(details, main.getFacilityMaintenanceDetails());
	}

	@Test
	public void testSetFacilityMaintenanceDetails() {
		main.setFacilityMaintenanceDetails(details);
		assertEquals(details, main.getFacilityMaintenanceDetails());
		

	}

	@Test
	public void getFacilityMaintenanceCost() {
		assertEquals("333", main.getFacilityMaintenanceCost());
		
		
	}
	@Test
	public void testGetFacilityID() {
		assertEquals("1234", faci.getFacilityId());
	}

	@Test
	public void testSetFacilityID() {
		faci.setFacilityId("1234");
		assertEquals("1234", faci.getFacilityId());
	}

	@Test
	public void testGetFacility() {
		main.setFacility(faci);
		assertEquals(faci, main.getFacility());
		
	}

	@Test
	public void testSetFacility() {
		main.setFacility(faci);
		assertEquals(faci, main.getFacility());
	}


}
