package com.facility.Domain.maintenance;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.facility.Domain.facility.FacilityDetailsImp;
import com.facility.Domain.facility.FacilityImp;

public class MaintenanceInspectionImpTest {
	public static FacilityImp fac;
	public static FacilityDetailsImp details;
	public static FacilityImp faci;
	public static FacilityDetailsImp details2;
	public static MaintenanceInspectionImp insp;
	public static Date d1;
	
	@Before
	public void setUp() {
		fac = new FacilityImp("winthrop", "20", details);
		faci = new FacilityImp ("Shardien","1234",details2);
		insp = new MaintenanceInspectionImp (d1," water inspection", "approved", "not urgent","water damage",d1);
		
	}

	@Test
	public void testMaintenanceInspectionImp() {
		insp.setRequestDate(d1);
		insp.setInspectionType("water inspection");
		insp.setInspectionReport("approved");
		insp.setUrgency("not urgent");
		insp.setInspectionDate(d1);
		
		assertEquals(d1, insp);
	}

	@Test
	public void testMaintenanceInspectionImpDateStringStringStringStringDate() {
		insp.setInspectionDate(d1);
		assertEquals(d1,insp.getInspectionDate());
	}

	@Test
	public void testGetInspectionDate() {
		assertEquals(d1,insp.getInspectionDate());
		
	}

	@Test
	public void testSetInspectionDate() {
		insp.getInspectionDate();
		assertEquals(d1,insp.getInspectionDate());
		
	}

	@Test
	public void testGetInspectionType() {
		assertEquals("water inspection",insp.getInspectionType());
	}

	@Test
	public void testSetInspectionType() {
		insp.setInspectionType("water inspection");
		assertEquals("water damage",insp.getInspectionType());
		
	}

	@Test
	public void testGetUrgency() {
		assertEquals("not urgent", insp.getUrgency());
		
	}

	@Test
	public void testSetUrgency() {
		insp.setInspectionType("not urgent");
		assertEquals("not urgent", insp.getUrgency());
		
	}

	@Test
	public void testSetRequestDate() {
		insp.setRequestDate(d1);
		//assertEquals(d1, insp.setRequestDate());
		
	}

	@Test
	public void testSetInspectionReport() {
		insp.setInspectionReport("water damage");
		//assertEquals("water damage",insp.)
		
	}

	@Test
	public void testToString() {
		 MaintenanceInspectionImp  maintenanceInspectionImp = new MaintenanceInspectionImp();
		 assertEquals(maintenanceInspectionImp.toString(), "");
		}
	}

