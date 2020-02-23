package com.facility.Domain.maintenance;

import  com.facility.Domain.facility.FacilityImp;
import com.facility.Domain.maintenance.MaintenanceInspection;

public abstract class MaintenanceImp implements Maintenance {

int facilityMaintenanceCost;
String facilityMaintenanceDetails;
private String facilityID;
private FacilityImp facility;
private MaintenanceInspection inspection;


public MaintenanceImp() {
	
}

public int getFacilityMaintenanceCost() {
	return facilityMaintenanceCost;
}
public void setFacilityMaintenanceCost(int facilityMaintenanceCost) {
	this.facilityMaintenanceCost = facilityMaintenanceCost;
}
public String getFacilityMaintenanceDetails() {
	return facilityMaintenanceDetails;
}
public void setFacilityMaintenanceDetails(String facilityMaintenanceDetails) {
	this.facilityMaintenanceDetails = facilityMaintenanceDetails;
}
public String getFacilityID() {
	return facilityID;
}
public void setFacilityID(String facilityID) {
	this.facilityID = facilityID;
}
public FacilityImp getFacility() {
	return facility;
}
public void setFacility(FacilityImp facility) {
	this.facility = facility;
}
public MaintenanceInspection getInspection() {
	return inspection;
}
public void setInspection(MaintenanceInspection inspection) {
	this.inspection = inspection;
}



}
