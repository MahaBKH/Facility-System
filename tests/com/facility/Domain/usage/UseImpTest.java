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
		use = new UseImp(12, 15, "roof inspection");
		address = new FacilityAddressImp("1110 Sheridan", "AL", "USA", 33303);
		details = new FacilityDetailsImp(100, address, "55555555");
		fac4 = new FacilityImp("Peet's", "11", details);
		
		address2 = new FacilityAddressImp("1110 Sheridan", "AL", "USA", 33303);
		details2 = new FacilityDetailsImp(50, address, "6305551315");
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
		assertEquals(new Integer(9), use.getFacilityActualUsage());
	}

	@Test
	public void testSetFacilityActualUsage() {
		use.setFacilityActualUsage(15);
		assertEquals(new Integer(15), use.getFacilityUseEnd());	
	}
	
	@Test
	public void testsetFacilityInspectionType() {
		use.setFacilityForUse(fac4);
		assertEquals(fac4, use.getFacilityForUse());
	}
	
	@Test
	public void testgetFacilityInspectionType() {
		assertEquals(fac4, use.getFacilityForUse());
	}
	
	@Test
	public void testlistActualUsage() {
		assertEquals(9, use.getAllUsages().size());
	}
	
	@Test
	public void getFacilityForUse() {
		assertEquals(3, use.getAllUsages().size());
	}
	
	@Test
	public void listActualUsage() {
		ArrayList<Integer> n = new ArrayList<Integer>();
		n.addAll(Arrays.asList(3, 15, 3, 3));
		
		assertEquals(n, use.listActualUsage());
	}
	
	@Test
	public void listInspection() {
		ArrayList<String> n = new ArrayList<String>();
		n.add("roof inspection");
		assertEquals(n, use.listInspection());
	}
	
	@Test
	public void calcUsageRate() {
		assertEquals(15, use.listInspection());
	}
	
	@Test
	public void assignFacilityToUse() {
		assertEquals(fac, use.getFacilityForUse());
	}
	
	@Test
	public void vacateFacility() {
		assertEquals(fac4, use.vacateFacility(fac4));
	}
	
	@Test 
	public void isInUseDuringInterval() {
		assertEquals(new Integer(3), use.isInUseDuringInterval());
	}
	

}