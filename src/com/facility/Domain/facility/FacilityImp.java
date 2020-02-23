package com.facility.Domain.facility;



import  com.facility.Domain.facility.FacilityDetails;

//import  com.facility.Domain.facility.FacilityAddress;

public abstract class FacilityImp implements Facility   {
	private String name;
	private String facilityId;
	private FacilityDetails details;
	
	
	public FacilityImp(String name, String facilityId, FacilityDetails details) {
		super();
		this.name = name;
		this.facilityId = facilityId;
		this.details = details;
	}
	
	
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
	public FacilityDetails getDetails() {
		return details;
	}
	public void setDetails(FacilityDetails details) {
		this.details = details;
	}
	
	
	@Override
	public String toString() {
		return "FacilityImp [name=" + name + ", facilityId=" + facilityId + ", details=" + details + "]";
	}


	


}
