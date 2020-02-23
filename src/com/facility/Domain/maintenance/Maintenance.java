package com.facility.Domain.maintenance;

import com.facility.Domain.facility.FacilityImp;

public interface Maintenance {
	public int getFacilityMaintenanceCost();
	public void setFacilityMaintenanceCost(int facilityMaintenanceCost);
	public MaintenanceInspection getFacilityMaintenanceDetails();
	public void setFacilityMaintenanceDetails(MaintenanceInspection inspection);
	public String getFacilityID();
	public void setFacilityID(String facilityID);
	
	public FacilityImp getFacility();
	public void setFacility(FacilityImp facility);
}
