package com.facility.Domain.facility;



import java.util.ArrayList;

import  com.facility.Domain.facility.FacilityDetailsImp;



public class FacilityImp implements Facility {
	
	private String name;
	private String facilityId;
	private FacilityDetailsImp details;
	private static ArrayList<FacilityImp> facilityList = new ArrayList<FacilityImp>();
	

	

	public FacilityImp(String name, String facilityID, FacilityDetailsImp details) {
		this.name = name;
		this.facilityId = facilityID;
		this.details = details;
		
		facilityList.add(this);
	}
	
	//GETS ALL ALL OF THE FACILITIES 
	public ArrayList<FacilityImp> getAllFacilities() {
		return facilityList;
	}
	
	
	//GETS FACILITY NAME
	public String getName() {
		return name;
	}
	
	//UPDATES FACILITY NAME
	public void setName(String name) {
		this.name = name;
	}
	
	//GETS FACILITY ID
	public String getFacilityId() {
		return facilityId;
	}
	
	//UPDATES FACILITY ID
	public void setFacilityId(String facilityId) {
		this.facilityId = facilityId;
	}
	
	//GETS FACILITY DETAILS
	public FacilityDetailsImp getDetails() {
		return details;
	}
	
	//UPDATES FACILITY DETAIL 
	public void setDetails(FacilityDetailsImp details) {
		this.details = details;
	}
	
	//RETURNS ALL FACILITY INFORMATION TO STRING
	@Override
	public String toString() {
		return "FacilityImp [name=" + name + ", facilityId=" + facilityId + ", details=" + details + "]";
	}


	
	

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
			this.details = details;
			
			//facilityList.set(facilityList.indexOf(this), details);
			
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
