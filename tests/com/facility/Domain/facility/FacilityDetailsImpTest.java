package com.facility.Domain.facility;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FacilityDetailsImpTest {
	public static FacilityAddressImp address;
	public static FacilityDetailsImp d;
	
	@Before
	public void setUp(){
		address = new FacilityAddressImp("1110 Sheridan", "AL", "USA", 33303);
		d = new FacilityDetailsImp(100, address, "55555555");
	}

	@Test
	public void testGetCapacity() {
		assertEquals(100, d.getCapacity());	
	}

	@Test
	public void testSetCapacity() {
		d.setCapacity(50);
		assertEquals(50, d.getCapacity());	
	}

	@Test
	public void testGetAddress() {
		assertEquals(address, d.getAddress());
		
	}

	@Test
	public void testSetAddress() {
		FacilityAddressImp addy  = new FacilityAddressImp("1110 She", "IL", "USA", 60666);
		d.setAddress(addy);
		assertEquals(addy, d.getAddress());
	}

	@Test
	public void testGetPhone() {
		assertEquals("55555555", d.getPhone());
	}

	@Test
	public void testSetPhone() {
		d.setPhone("2323");
		assertEquals("2323", d.getPhone());
	}


}
