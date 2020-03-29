package com.facility.Domain.maintenance;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.facility.Domain.facility.Facility;
import com.facility.Domain.facility.FacilityImp;

public interface Maintenance {
	
	public Integer getFacilityMaintenanceCost();
	public void setFacilityMaintenanceCost(Integer facilityMaintenanceCost);
	
	public Facility getFacility();
	public void setFacility(FacilityImp facility);
	


	
	public MaintenanceInspectionImp getFacilityMaintenanceDetails();
	public void setFacilityMaintenanceDetails(MaintenanceInspectionImp inspection);
	

	
	
	public MaintenanceInspectionImp makeFacilityMaintRequest (FacilityImp facility, MaintenanceInspectionImp inspection, Integer facilityMaintenanceCost); 
		
	public MaintenanceInspectionImp scheduleMaintenance(Date inspectionDate, String inspectionType, String inspectionReport, String urgency);
	public Integer calcMaintenanceCostForFacility(FacilityImp facility);
	public ArrayList<MaintenanceImp> listMaintenance();
	public ArrayList<Object> listMaintRequests(FacilityImp facility);
	
	public Integer calcProblemRateForFacility(FacilityImp facility);
	public Long calcDownTimeForFacility(FacilityImp facility);
	
	public ArrayList<String> listFacilityProblems(FacilityImp facility);
	public void reportProblemForFacility(FacilityImp facility, String problem);
	
	long getDateDiff(Date date1, Date date2);
	String toString();
}
