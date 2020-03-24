package com.facility.Domain.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.facility.Domain.facility.FacilityImp;
import com.facility.Domain.facility.Facility;
import com.facility.Domain.facility.FacilityDetailsImp;


public class FacilityService {
	




	private ArrayList<FacilityImp> facilityList = new ArrayList<FacilityImp>();
	

	// LISTS ALL FACILITIES ADDED 
	public ArrayList<FacilityImp> listFacilities() {
		 try {
			 System.out.println("List of Facilities: ");
		        for(int i = 0; i < facilityList.size(); i++){
		            System.out.println(facilityList.get(i).getName());
		        }
	        } catch (Exception e) {
	            System.err.println("Cannot retrieve all facilities.");
	        }
		 return facilityList;
	}

	//RETURNS FACILITY DETAILS 
	public FacilityDetailsImp getFacilityInformation(Facility facility) {
		 try {
	             System.out.println("Address: " +  facility.getDetails().getAddress());
	             System.out.println("Phone: " + facility.getDetails().getPhone());
	             System.out.println("Capacity: " + facility.getDetails().getCapacity());
	             
	        } catch (Exception e) {
	            System.err.println("Cannot retieve facility informaiton.");
	        }
		 return facility.getDetails();
	}

	
	//RETURNS THE TOTAL CAPACITY FOR THE FACILITY
	public Integer requestAvailableCapacity(Facility facility) {
		int facilityCapacity = facility.getDetails().getCapacity();
		return facilityCapacity;	
	}
	

	//ADDS NEW FACILITY DETAILS TODO
	public void addFacilityDetail(FacilityDetailsImp details) {
		try {
			facilityList.set();
			
            System.out.println("Facility details added.");
        } catch (Exception e) {
            System.err.println("Cannot add Facility detail.");
        }
	}

	//ADDS NEW FACILITY TO LIST
	public void addNewFacility(FacilityImp facility) {
		try {
		facilityList.add(new FacilityImp(facility.getName(), facility.getFacilityId(), facility.getDetails()));
		
		System.out.print("Facility added successfully.");
		}catch(Exception e) {
		System.out.println("Cannot add facility.");
		}
	}
	
	
	//REMOVES FACILITY FROM LIST OF FACILITIES
	public void removeFacility(Facility facility) {
		try {
			facilityList.remove(facility);
            System.out.println("Facility has been removed.");     

		} catch (Exception e) {
            System.err.println("Cannot remove facility.");
        }
	}

}

