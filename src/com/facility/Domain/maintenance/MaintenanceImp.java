package com.facility.Domain.maintenance;

import java.util.ArrayList;

import com.facility.Domain.facility.Facility;
import  com.facility.Domain.facility.FacilityImp;

import com.facility.Domain.maintenance.MaintenanceInspectionImp;

public class MaintenanceImp implements Maintenance {

private int facilityMaintenanceCost;
private String facilityID;
private Facility facility;
private MaintenanceInspectionImp inspection;
private MaintenanceInspectionImp facilityMaintenanceDetails;

public MaintenanceImp() {
	// TODO Auto-generated constructor stub
}

public MaintenanceImp(int facilityMaintenanceCost, MaintenanceInspectionImp facilityMaintenanceDetails, String facilityID,
		FacilityImp facility, MaintenanceInspectionImp inspection) {
	this.facilityMaintenanceCost = facilityMaintenanceCost;
	this.facilityMaintenanceDetails = facilityMaintenanceDetails;
	this.facilityID = facilityID;
	this.facility = facility;

}


public Integer getFacilityMaintenanceCost() {
	return facilityMaintenanceCost;
}
public void setFacilityMaintenanceCost(int facilityMaintenanceCost) {
	this.facilityMaintenanceCost = facilityMaintenanceCost;
}
public MaintenanceInspectionImp getFacilityMaintenanceDetails() {
	return inspection;
}
public void setFacilityMaintenanceDetails(MaintenanceInspectionImp inspection) {
	this.inspection = inspection;
}
public String getFacilityID() {
	return facilityID;
}
public void setFacilityID(String facilityID) {
	this.facilityID = facilityID;
}
public Facility getFacility() {
	return facility;
}
public void setFacility(FacilityImp facility) {
	this.facility = facility;
}
/*
 * 
 * TODO: ADD TO METHODS TO INTERFACE AS WELL 
public MaintenanceInspectionImp makeFacilityMaintRequest(Facility facility, MaintenanceInspectionImp facilityMaintenanceDetails, String facilityID, int facilityMaintenanceCost) {}

public Integer calcMaintenanceCostForFacility(Facility facility) {}
public String calcProblemRateForFacility(Facility facility) {}
public Integer calcDownTimeForFacility(Facility facility) {}

public Maintenance scheduleMaintenance(Maintenance maint) {}


public ArrayList<Maintenance> listMaintRequests(Facility facility){}

public ArrayList<Maintenance> listMaintenance(Facility facility){}
public ArrayList<Maintenance> listFacilityProblems(Facility facility){}
*/
@Override
public String toString() {
	return "MaintenanceImp [facilityMaintenanceCost=" + facilityMaintenanceCost + ", facilityMaintenanceDetails="
			+ facilityMaintenanceDetails + ", facilityID=" + facilityID + ", facility=" + facility + ", inspection="
			+ inspection + "]";
}


}
