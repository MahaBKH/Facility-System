package com.facility.Domain.maintenance;

import java.util.ArrayList;

import com.facility.Domain.facility.Facility;
import com.facility.Domain.facility.FacilityImp;

public interface Maintenance {
	public Integer getFacilityMaintenanceCost();
	public void setFacilityMaintenanceCost(int facilityMaintenanceCost);
	public MaintenanceInspectionImp getFacilityMaintenanceDetails();
	public void setFacilityMaintenanceDetails(MaintenanceInspectionImp inspection);
	public String getFacilityID();
	public void setFacilityID(String facilityID);
	public Facility getFacility();
	public void setFacility(FacilityImp facility);
	public Integer calcProblemRateForFacility(Facility facility);
	public Integer calcDownTimeForFacility(Facility facility);
	public Integer calcMaintenanceCostForFacility(Facility facility);
	public ArrayList<MaintenanceImp> listFacilityProblems(Maintenance maint);
	public ArrayList<MaintenanceImp> listMaintRequests(Maintenance maint);
	public ArrayList<MaintenanceImp> getAllMaintenance();
}
