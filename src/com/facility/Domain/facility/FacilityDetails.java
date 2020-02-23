package com.facility.Domain.facility;


import  com.facility.Domain.facility.FacilityAddress;

public class FacilityDetails {
	private int capacity;
	private FacilityAddress address;
	private String phone;
	
	
	public FacilityDetails() {
		
	}
	
	public FacilityDetails(int capacity, FacilityAddress address, String phone, String name, String facilityId,
			Facility facility) {
		
		this.capacity = capacity;
		this.address = address;
		this.phone = phone;
		
	}
	
	
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public FacilityAddress getAddress() {
		return address;
	}
	public void setAddress(FacilityAddress address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	


	@Override
	public String toString() {
		return "FacilityDetails [capacity=" + capacity + ", address=" + address + ", phone=" + phone + 
				   "]";
	}
	
	
}
