package com.facility.DAL.Maintenance;

import java.util.ArrayList;
import com.facility.Domain.facility.Facility;
import com.facility.Domain.maintenance.Maintenance;
import com.facility.Domain.maintenance.MaintenanceInspection;

public class MaintenanceDAO {

	
	public Maintenance makeFacilityMaintRequest(Facility facility, MaintenanceInspection facilityMaintenanceDetails,
			String facilityID, int facilityMaintenanceCost) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void scheduleMaintenance(Maintenance maint) {
		// TODO Auto-generated method stub
		
	}


	public Integer calcMaintenanceCostForFacility(Facility facility) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Maintenance> listMaintenance(Facility facility) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Maintenance> listMaintRequests(Facility facility) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String calcProblemRateForFacility(Facility facility) {
		return null;
		
	}

	public Integer calcDownTimeForFacility(Facility facility) {
		return null;
		
	}

	public ArrayList<Maintenance> listFacilityProblems(Facility facility){
		return null;
	}
}
