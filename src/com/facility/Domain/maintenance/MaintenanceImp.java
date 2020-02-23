package com.facility.Domain.maintenance;

import  com.facility.Domain.facility.FacilityImp;

import com.facility.Domain.maintenance.MaintenanceInspection;

public class MaintenanceImp implements Maintenance {

int facilityMaintenanceCost;
private String facilityID;
private FacilityImp facility;
private MaintenanceInspection inspection;
private MaintenanceInspection facilityMaintenanceDetails;

public MaintenanceImp() {
	// TODO Auto-generated constructor stub
}

public MaintenanceImp(int facilityMaintenanceCost, MaintenanceInspection facilityMaintenanceDetails, String facilityID,
		FacilityImp facility, MaintenanceInspection inspection) {
	this.facilityMaintenanceCost = facilityMaintenanceCost;
	this.facilityMaintenanceDetails = facilityMaintenanceDetails;
	this.facilityID = facilityID;
	this.facility = facility;

}



public int getFacilityMaintenanceCost() {
	return facilityMaintenanceCost;
}
public void setFacilityMaintenanceCost(int facilityMaintenanceCost) {
	this.facilityMaintenanceCost = facilityMaintenanceCost;
}
public MaintenanceInspection getFacilityMaintenanceDetails() {
	return inspection;
}
public void setFacilityMaintenanceDetails(MaintenanceInspection inspection) {
	this.inspection = inspection;
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


@Override
public String toString() {
	return "MaintenanceImp [facilityMaintenanceCost=" + facilityMaintenanceCost + ", facilityMaintenanceDetails="
			+ facilityMaintenanceDetails + ", facilityID=" + facilityID + ", facility=" + facility + ", inspection="
			+ inspection + "]";
}



}
