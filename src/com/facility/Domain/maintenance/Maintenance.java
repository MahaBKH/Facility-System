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
<<<<<<< HEAD
	public Integer calcProblemRateForFacility(FacilityImp facility);
	public Integer calcDownTimeForFacility(FacilityImp facility);
	public Integer calcMaintenanceCostForFacility(FacilityImp facility);
=======
	public Integer getDownTimeForFacility();
	public void setDownTimeForFacility(int downTimeForFacility);
	public Integer getProblemRateForFacility();
	public void setProblemRateForFacility(int problemRateForFacility);
	public Integer calcProblemRateForFacility(Facility facility);
	public Integer calcDownTimeForFacility(Facility facility);
	public Integer calcMaintenanceCostForFacility(Facility facility);
	public MaintenanceInspectionImp makeFacilityMaintRequest();
>>>>>>> f3f0f008b9e608960878afda1e7cacfd5f6042a1
	public ArrayList<MaintenanceImp> listFacilityProblems(MaintenanceImp maint);
	public ArrayList<MaintenanceImp> listMaintRequests(MaintenanceImp maint);
	public ArrayList<MaintenanceImp> getAllMaintenance();
	
	public String toString();
}
