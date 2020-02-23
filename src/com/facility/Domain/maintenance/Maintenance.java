package com.facility.Domain.maintenance;

import com.facility.Domain.facility.FacilityImp;

public interface Maintenance {
	public int getFacilityMaintenanceCost();
	public void setFacilityMaintenanceCost(int facilityMaintenanceCost);
	public String getFacilityMaintenanceDetails();
	public void setFacilityMaintenanceDetails(String facilityMaintenanceDetails);
	public String getFacilityID();
	public void setFacilityID(String facilityID);
	
	public FacilityImp getFacility();
	public void setFacility(FacilityImp facility);
}
