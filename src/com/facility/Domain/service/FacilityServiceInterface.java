package com.facility.Domain.service;

import java.util.ArrayList;

import com.facility.Domain.facility.Facility;
import com.facility.Domain.facility.FacilityDetails;

public interface FacilityServiceInterface {
	public ArrayList<Facility> listFacilities ();
	public FacilityDetails getFacilityInformation(Facility facility);
	public Integer requestAvailableCapacity(Facility facility);
	public Facility addNewFacility(Facility facility);
	public void addFacilityDetail(FacilityDetails details);
	public Facility removeFacility(Facility facility);

}
