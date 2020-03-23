package com.facility.Domain.facility;

public interface FacilityDetails {
	public int getCapacity();
	public void setCapacity(int capacity);
	public FacilityAddressImp getAddress();
	public void setAddress(FacilityAddressImp address);
	public String getPhone();
	public void setPhone(String phone);
	public String toString();
}
