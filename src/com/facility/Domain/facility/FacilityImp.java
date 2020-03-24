package com.facility.Domain.facility;



import  com.facility.Domain.facility.FacilityDetailsImp;



public class FacilityImp implements Facility   {
	private String name;
	private String facilityId;
	private FacilityDetailsImp details;
	
	
	public FacilityImp(String name, String facilityID, FacilityDetailsImp details2) {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFacilityId() {
		return facilityId;
	}
	public void setFacilityId(String facilityId) {
		this.facilityId = facilityId;
	}
	public FacilityDetailsImp getDetails() {
		return details;
	}
	public void setDetails(FacilityDetailsImp details) {
		this.details = details;
	}
	
	@Override
	public String toString() {
		return "FacilityImp [name=" + name + ", facilityId=" + facilityId + ", details=" + details + "]";
	}



	


}
