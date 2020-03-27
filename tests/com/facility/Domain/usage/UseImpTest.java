package com.facility.Domain.usage;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.facility.Domain.facility.FacilityAddressImp;
import com.facility.Domain.facility.FacilityDetailsImp;
import com.facility.Domain.facility.FacilityImp;

public class UseImpTest {
	
	public static UseImp use;
	public static FacilityAddressImp address;
	public static FacilityDetailsImp details;
	public static FacilityImp fac4;
	public static FacilityAddressImp address2;
	public static FacilityDetailsImp details2;
	public static FacilityImp fac;
	
	@Before
	public void setUp(){
		use = new UseImp(12, 15, "general");
		address = new FacilityAddressImp("1110 Sheridan", "AL", "USA", 33303);
		details = new FacilityDetailsImp(100, address, "55555555");
		use.setFacilityInspectionType("general inspection");
		fac = new FacilityImp("Peet's", "11", details);
		use.setFacilityForUse(fac);
		
	}
	@Test
	public void testGetFacilityUseStart() {
		assertEquals(new Integer(12), use.getFacilityUseStart());	

	}
	@Test
	public void testSetFacilityUseStart() {
		use.setFacilityUseStart(8);
		assertEquals(new Integer(8), use.getFacilityUseStart());	
	}

	@Test
	public void testGetFacilityUseEnd() {
		assertEquals(new Integer(15), use.getFacilityUseEnd());	
	}

	@Test
	public void testSetFacilityUseEnd() {
		use.setFacilityUseEnd(17);
		assertEquals(new Integer(17), use.getFacilityUseEnd());	
	}

	@Test
	public void testGetFacilityActualUsage() {
		assertEquals(new Integer(3), use.getFacilityActualUsage());
	}

	@Test
	public void testSetFacilityActualUsage() {
		use.setFacilityActualUsage(15);
		assertEquals(new Integer(15), use.getFacilityUseEnd());	
	}
	
	@Test
	public void testSetFacilityInspectionType() {
		use.setFacilityForUse(fac);
		assertEquals(fac, use.getFacilityForUse());
	}
	
	@Test
	public void testGetFacilityInspectionType() {
		assertEquals("general inspection", use.getFacilityInspectionType());
	}
	
	@Test
	public void testGetFacilityForUse() {
		assertEquals(9, use.getAllUsages().size());
	}
	
	@Test
	public void testListActualUsage() {
		ArrayList<Integer> n = new ArrayList<Integer>();
		n.addAll(Arrays.asList(15, 3, 3, 3));
		assertEquals(n, use.listActualUsage());
	}
	
	@Test
	public void testlistInspection() {
		ArrayList<String> n = new ArrayList<String>();
		n.addAll(Arrays.asList("general inspection","general inspection","general inspection"));
		assertEquals(n, use.listInspection());
	}
	
	@Test
	public void testcalcUsageRate() {
		assertEquals((Integer)42, use.calcUsageRate());
	}
	
	@Test
	public void testassignFacilityToUse() {
		assertEquals(fac, use.getFacilityForUse());
	}
	
	@Test
	public void testvacateFacility() {
		assertEquals(fac, use.vacateFacility(fac));
	}
	
	@Test 
	public void testisInUseDuringInterval() {
		assertEquals(new Integer(3), use.isInUseDuringInterval());
	}
	

}