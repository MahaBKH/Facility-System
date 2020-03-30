package com.facility.Domain.maintenance;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import static java.util.Arrays.asList;

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
	@Test
	public void testreportProblemForFacility() {
		main.reportProblemForFacility(faci, "water damage");
		assertEquals(faci, main);
	}
	
	@Test
	public void testlistFacilityProblems () {
		ArrayList<String> m = new ArrayList<String>();
		m.addAll(Arrays.asList("problem 1", "problem2", "problem3", "problem4"));
		assertEquals(m, main.listFacilityProblems(faci));
		}
	
	@Test
	public void testcalcProblemRateForFacility() {
		assertEquals((Integer)66, main.calcProblemRateForFacility());
		
		
	}
	
	@Test
	public void testmakeFacilityMaintRequest() {
		
		
		
	}
	
	@Test
	public void TestscheduleMaintenance() {
		insp.setInspectionDate(d1);
		insp.setInspectionReport("report");
		insp.setInspectionType("water");
		insp.setUrgency("Urg");
		assertEquals(main.scheduleMaintenance(insp));
		
		
		
	}
	
	@Test
	public void testlistMaintenance() {
		assertEquals(10,main.listMaintenance());
	}
	
	@Test
	public void testlistMaintRequests() {
		ArrayList<Object> m = new ArrayList<Object>(); 
		m.addAll(Arrays.asList(1,2,3,4));
		assertEquals(m, main.listMaintRequests(faci));
		} 
	@Test
	public void testcalcMaintenanceCostForFacility() {
		assertEquals((Integer)100, main.calcMaintenanceCostForFacility(faci));
		}
	
	@Test
	public void testcalcDownTimeForFacility() {
		ArrayList<Object> m = new ArrayList<Object>(); 
		m.addAll(Arrays.asList(00, 11));
		assertEquals(m, main.calcDownTimeForFacility(faci));
	
	}


}
