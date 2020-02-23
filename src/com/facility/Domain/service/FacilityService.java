package com.facility.Domain.service;

import java.util.ArrayList;
import com.facility.DAL.Facility.FacilityDAO;
import com.facility.Domain.facility.Facility;
import com.facility.Domain.facility.FacilityDetails;


public class FacilityService implements FacilityServiceInterface{
	
	private FacilityDAO facDAO = new FacilityDAO();
	
	public ArrayList<Facility> listFacilities() {
		 try {
	            return facDAO.listFacilities();
	        } catch (Exception e) {
	            System.err.println("Cannot retrieve all facilities.");
	        }
		return null;
	}

	public FacilityDetails getFacilityInformation(Facility facility) {
		 try {
	            FacilityDetails facilityDetails = facDAO.getFacilityDetails(facility);
	            return facilityDetails;
	        } catch (Exception e) {
	            System.err.println("Cannot retieve facility informaiton.");
	        }
	        return null;
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

	public Facility addNewFacility(Facility facility) {
		try {
		facDAO.addNewFacility(facility);
		System.out.println("Facility added.");
		return facility;
		}catch(Exception e) {
		System.out.println("Cannot add facility.");
		}
		return null;
	}
	
	public Facility removeFacility(Facility facility) {
		try {
            facDAO.removeFacility(facility);
            System.out.println("Facility has been removed.");
            return facility;

		} catch (Exception e) {
            System.err.println("Cannot remove facility.");
        }
		return null;

	}

}

