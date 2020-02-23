package com.facility.Domain.facility;

import java.util.ArrayList;
import com.facility.DAL.Facility.FacilityDAO;


public class FacilityService {
	
	
	private FacilityDAO facDAO = new FacilityDAO();
	
	public ArrayList<Facility> listFacilities() {
		 try {
	            return facDAO.listFacilities();
	        } catch (Exception e) {
	            System.err.println("Cannot retrieve all facilities.");
	        }
		return null;
	}

	public FacilityDetails getFacilityDetails(Facility facility) {
		 FacilityDetails facilityDetail = facility.getDetails();
		 return facilityDetail;
	}

	public Integer requestAvailableCapacity(Facility facility) {
		int facilityCapacity = facility.getDetails().getCapacity();
		return facilityCapacity;	
	}

	public void addFacilityDetail(FacilityDetails details) {
		try {
            facDAO.addFacilityDetail(details);
            System.out.println("Facility details added.");
        } catch (Exception e) {
            System.err.println("Cannot add Facility detail.");
        }
	}

	public void addNewFacility(Facility facility) {
		try {
		facDAO.addNewFacility(facility);
		System.out.println("Facility added.");
		}catch(Exception e) {
		System.out.println("Cannot add facility.");
		}
	}
	
	public void removeFacility(Facility facility) {
		try {
            facDAO.removeFacility(facility);
        } catch (Exception e) {
            System.err.println("Cannot remove facility.");
        }

	}

}

