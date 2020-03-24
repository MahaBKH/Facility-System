package com.facility.Domain.service;

import java.util.ArrayList;

import com.facility.DAL.Maintenance.MaintenanceDAO;
import com.facility.Domain.facility.Facility;
import com.facility.Domain.maintenance.Maintenance;
import com.facility.Domain.maintenance.MaintenanceInspectionImp;

public class MaintenanceService {
	private MaintenanceDAO maintDAO = new MaintenanceDAO();
	
	public Maintenance makeFacilityMaintRequest(Facility facility, MaintenanceInspectionImp facilityMaintenanceDetails, String facilityID, int facilityMaintenanceCost) {
		try {
			
		Maintenance m =  maintDAO.makeFacilityMaintRequest(facility,facilityMaintenanceDetails, facilityID, facilityMaintenanceCost);
		System.out.println("Maintenance Request has been made.");
		return m;
		 } catch (Exception e) {
	            System.err.println("Could not make maintenance request.");
	        }
	        return null;
		}
	
	public Maintenance scheduleMaintenance(Maintenance maint) {
		 try {
	            maintDAO.scheduleMaintenance(maint);
	            System.out.println("Maintenance has been successfully scheduled.");
	            return maint;
	        } catch (Exception e) {
	            System.err.println("Could not schedule maintenance.");
	        }
		 return null;
	}
	
	public Integer calcMaintenanceCostForFacility(Facility facility) {
	        try {
	            Integer n =  maintDAO.calcMaintenanceCostForFacility(facility);
	            System.out.println("Price of maintenance for facility has been calculated.");
	            return n;
	        } catch (Exception e) {
	            System.err.println("Could not calucalte price of maintenance.");
	        }
	        return 0;
	    }
	
	public String calcProblemRateForFacility(Facility facility) {
		 ArrayList<Maintenance> facProblems = new ArrayList<Maintenance>();
		
	        try {
	        		if(maintDAO.listMaintRequests(facility) == null || maintDAO.listMaintenance(facility) == null) {
	        			return "LOW";
	        		}
	        		
	        	 facProblems.addAll(maintDAO.listMaintRequests(facility));
	             facProblems.addAll(maintDAO.listMaintenance(facility));
	        	
		         
		         System.out.println("Caluclated Problem rate for facility.");
		        
		         if (facProblems  != null) {
			        	if(facProblems.size()> 9) {
			        		return "HIGH";
			        	}else if(facProblems.size()> 3){
			        		return "LOW";
			        	}
	
	        } 
	        }catch (Exception e) {
	            System.err.println("Could not calucate the problem rate for facility.");
	            
	        }
	        return null;
	}
	
	public Integer calcDownTimeForFacility(Facility facility) {
	        Integer daysDown = 0;
	        Integer completedMaintItems;
	        try {
	        	if (maintDAO.listMaintenance(facility) == null) {
	        		 completedMaintItems  = 0;
	        	}else {
	        		completedMaintItems = maintDAO.listMaintenance(facility).size();  
	        	}
	            //5 weekdays
	            daysDown = completedMaintItems * 5;
	            System.out.println("Calculated Downtime for this facility.");
	            return daysDown;
	        } catch (Exception e) {
	            System.err.println("Could not calculate down time for facility.");   
	        }
	        return daysDown;
	}
	
	public ArrayList<Maintenance> listMaintRequests(Facility facility){
		 try {
			 ArrayList<Maintenance> n  = maintDAO.listMaintRequests(facility);
			 System.out.println("Retrieved list of maintenance requests.");
			 return n;
	        } catch (Exception e) {
	            System.err.println("Could not display all maintenance requests for facility.");      
	        }
	        return null;
	}
	
	public ArrayList<Maintenance> listMaintenance(Facility facility){
		try {
			ArrayList<Maintenance> m = maintDAO.listMaintenance(facility);
            System.out.println("Retreieved history of maintenance.");
            return m;
        } catch (Exception e) {
            System.err.println("Could not list all Maintenance history for facility.");
        }
        return null;
	};
	
	public ArrayList<Maintenance> listFacilityProblems(Facility facility){
		 ArrayList<Maintenance> facProblems = new ArrayList<Maintenance>();

	        try {
	        	
	            facProblems.addAll(maintDAO.listMaintRequests(facility));
	            facProblems.addAll(maintDAO.listMaintenance(facility));
	            
	            System.out.println("Retrieving list of facility problems.");
	            return facProblems;
	        } catch (Exception e) {
	        		System.out.println("There are no problems at this facility at this time.");
	        }
	        return facProblems;
	}
	
	
}
