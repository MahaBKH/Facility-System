package com.facility.Domain.service;

import java.util.ArrayList;

import com.facility.DAL.Maintenance.MaintenanceDAO;
import com.facility.Domain.facility.Facility;
import com.facility.Domain.maintenance.Maintenance;
import com.facility.Domain.maintenance.MaintenanceInspection;

public class MaintenanceService {
	private MaintenanceDAO maintDAO = new MaintenanceDAO();
	
	public Maintenance makeFacilityMaintRequest(Facility facility, String facilityMaintenanceDetails, String facilityID, int facilityMaintenanceCost, MaintenanceInspection inspection) {
		try {
		return maintDAO.makeFacilityMaintRequest(facility,facilityMaintenanceDetails, facilityID, facilityMaintenanceCost, inspection);
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
	            return maintDAO.calcMaintenanceCostForFacility(facility);
	            
	        } catch (Exception e) {
	            System.err.println("Could not calucalte price of maintenance.");
	        }
	        return 0;
	    }
	
	public Double calcProblemRateForFacility(Facility facility) {
		return null;
	}
	
	public Integer calcDownTimeForFacility(Facility facility) {
	        int daysDown = 0;
	        try {
	            int completedMaintItems = maintDAO.listMaintenance(facility).size();
	            daysDown = completedMaintItems * 5;
	            return daysDown;
	        } catch (Exception e) {
	            System.err.println("Could not calculate down time for facility.");
	            
	        }
	        return daysDown;
	}
	
	public ArrayList<Maintenance> listMaintRequests(Facility facility){
		 try {
	            return maintDAO.listMaintRequests(facility);
	        } catch (Exception e) {
	            System.err.println("Could not display all maintenance requests for facility.");      
	        }
	        return null;
	}
	
	public ArrayList<Maintenance> listMaintenance(Facility facility){
		try {
            return maintDAO.listMaintenance(facility);
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
	            return facProblems;
	        } catch (Exception e) {
	            System.err.println("Could not list out all facility problems");
	        }
	        return null;
	}
	
	
}
