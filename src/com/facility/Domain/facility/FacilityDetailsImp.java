package com.facility.Domain.facility;


import  com.facility.Domain.facility.FacilityAddressImp;

public class FacilityDetailsImp {
	private int capacity;
	private FacilityAddressImp address;
	private String phone;

	
	public FacilityDetailsImp(int capacity, FacilityAddressImp address, String phone) {
		
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
	public FacilityAddressImp getAddress() {
		return address;
	}
	public void setAddress(FacilityAddressImp address) {
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
