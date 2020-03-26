package com.facility.Domain.facility;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FacilityAddressImpTest {
	public static FacilityAddressImp address;
		
	@Before
	public void setUp(){
		address = new FacilityAddressImp("1110 Sheridan", "AL", "USA", 33303);
	}
	


	@Test
	public void testGetStreet() {
		assertEquals("1110 Sheridan", address.getStreet());	
	}

	@Test
	public void testSetStreet() {
		address.setStreet("12 peace");
		assertEquals("12 peace", address.getStreet());	
	}

	@Test
	public void testGetState() {
		assertEquals("AL", address.getState());
	}

	@Test
	public void testSetState() {
		address.setState("IL");
		assertEquals("IL", address.getState());
	}

	@Test
	public void testGetCountry() {
		assertEquals("USA", address.getCountry());
	}

	@Test
	public void testSetCountry() {
		address.setCountry("MEX");
		assertEquals("MEX", address.getCountry());
	}

	@Test
	public void testGetZip() {
		assertEquals("33303", address.getZip());
	}

	@Test
	public void testSetZip() {
		address.setZip(2);
		assertEquals(2, address.getZip());
	}


}
