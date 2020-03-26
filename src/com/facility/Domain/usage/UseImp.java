package com.facility.Domain.usage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.facility.Domain.facility.FacilityImp;

public class UseImp implements Usage {
	
	private Integer facilityUseStart;
	private Integer facilityUseEnd;
	private Integer facilityActualUsage;
	private String facilityInspectionType;
	private FacilityImp facility;
	
	private static ArrayList<UseImp> useList = new ArrayList<UseImp>();
	
	
	public UseImp(Integer facilityUseStart, Integer facilityUseEnd, String facilityInspectionType) {
		this.facilityUseStart = facilityUseStart;
		this.facilityUseEnd = facilityUseEnd;
		this.facilityActualUsage = facilityUseEnd - facilityUseStart;
		
		useList.add(this);
	}
	
	
	public UseImp(Integer facilityUseStart, Integer facilityUseEnd, String facilityInspectionType, FacilityImp facility) {
		this.facilityUseStart = facilityUseStart;
		this.facilityUseEnd = facilityUseEnd;
		this.facilityActualUsage = facilityUseEnd - facilityUseStart;
		this.facility = facility;
		useList.add(this);
	}

	public Integer getFacilityUseStart() {
		return facilityUseStart;
		
	}
	public void setFacilityUseStart(Integer facilityUseStart) {
		this.facilityUseStart = facilityUseStart;
	}
	
	public Integer getFacilityUseEnd() {
		return facilityUseEnd;
	}
	
	
	public void setFacilityUseEnd(Integer facilityUseEnd) {
		this.facilityUseEnd = facilityUseEnd;
	}
	
	public Integer getFacilityActualUsage() {
		return facilityActualUsage;
	}
	
	public void setFacilityActualUsage(Integer facilityActualUsage) {
		this.facilityActualUsage = facilityActualUsage;
	}
	
	public String getFacilityInspectionType() {
		return facilityInspectionType;
	}

	public void setFacilityInspectionType(String inspectionType) {
		this.facilityInspectionType = inspectionType;
	}
	
	public ArrayList<UseImp> getAllUsages() {
		return useList;
	}
	public FacilityImp getFacilityForUse() {
		if(facility == null) {
			System.out.println("No facility has been assigned for this use yet.");
		}
		return facility;
	}
	
	public void setFacilityForUse(FacilityImp facility) {
		this.facility = facility;
	}
	
	public String toString() {
		return "UseImp [FacilityUseStart=" + facilityUseStart + ", FacilityUseEnd=" + facilityUseEnd
				+ ", FacilityActualUsage=" + facilityActualUsage + "]";
	}
	
	
	public ArrayList<Integer> listActualUsage(){
		try {
			ArrayList<Integer> n = new ArrayList<Integer>();
			 System.out.println("List of Usage rates: ");
		        for(int i = 0; i < useList.size(); i++){
		            n.add(useList.get(i).getFacilityActualUsage());
		        }
		        return n;
		       
		} catch (Exception e) {
			System.err.println("Cannot retrieve all Usages.");
		}
		return null;
	}
	
	
		public ArrayList<String> listInspection(){
		try {
			ArrayList<String> n = new ArrayList<String>();
			System.out.println("List of Usage rates: ");
	        for(int i = 0; i < useList.size(); i++){
	             n.add(useList.get(i).getFacilityInspectionType());   
	        }
	        return n;
		} catch (Exception e) {
			System.err.println("Cannot retrieve all inspections.");
		}
		return null;
	}
		
		
		public Integer calcUsageRate() {
		try {
			System.out.println("List of Usage rates: ");
			Integer n = 0;
	        for(int i = 0; i < useList.size(); i++){
	            n = n + useList.get(i).getFacilityActualUsage();
	        }
		return n;
		}catch (Exception e) {
			System.err.println("Could not calculate price of usage.");
		}
		return 0;
	}
		
		
		public FacilityImp assignFacilityToUse(FacilityImp facility) {
		try {
			this.setFacilityForUse(facility);
			System.out.println("Facility has been assigned.");
			return facility;
		}catch (Exception e) {
			System.err.println("Facility could not be assigned,");
		}
		return null;
	}
		
		public FacilityImp vacateFacility(FacilityImp facility) {
			try{
				this.setFacilityUseStart(null);
				this.setFacilityUseEnd(null);
				this.setFacilityForUse(null);
				useList.remove(this);
				
				System.out.println("Facility have been voided.");
				return facility;
			}catch (Exception e) {
				System.err.println("Failed to be voided");	
			}
			return null;
		}
		
			public Integer isInUseDuringInterval() {
				try {
					return this.getFacilityActualUsage();
				}catch(Exception e) {
					System.err.println("Facility is not in use.");
				}
				return null;
			}


		


}
