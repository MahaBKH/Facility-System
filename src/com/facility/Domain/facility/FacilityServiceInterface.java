package com.facility.Domain.facility;

import java.util.ArrayList;

public interface FacilityServiceInterface {
	public ArrayList<Facility> listFacilities ();
	public FacilityDetails getFacilityInformation();
	public Integer requestAvailableCapacity();
	public Facility addNewFacility();
	public void addFacilityDetail();
	public Facility removeFacility();

}
