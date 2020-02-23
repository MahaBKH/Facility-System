package com.facility.Domain.facility;

import  com.facility.Domain.facility.FacilityDetails;
import  com.facility.Domain.facility.FacilityAddress;

public interface Facility {
	public void FacilityImp(String name, String facilityId, FacilityDetails details);
	public String getName();
	public void setName(String name);
	public String getFacilityId();
	public void setFacilityId(String facilityId);
	public FacilityDetails getDetails();

	public void setDetails(FacilityDetails details);

	public String toString();


}
