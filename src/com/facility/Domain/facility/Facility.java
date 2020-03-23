package com.facility.Domain.facility;

import  com.facility.Domain.facility.FacilityDetailsImp;


public interface Facility {
	
	public String getName();
	public void setName(String name);
	public String getFacilityId();
	public void setFacilityId(String facilityId);
	public FacilityDetailsImp getDetails();

	public void setDetails(FacilityDetailsImp details);

	public String toString();


}
