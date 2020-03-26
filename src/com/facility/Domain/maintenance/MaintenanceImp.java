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
private static ArrayList<MaintenanceImp> maintList = new ArrayList<MaintenanceImp>();
private static ArrayList<MaintenanceImp> maintReqList = new ArrayList<MaintenanceImp>();

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
 

/* dont they all have to be ( Maintenance maintenance)? */
/* TODO: ADD TO METHODS TO INTERFACE AS WELL 
public MaintenanceInspectionImp makeFacilityMaintRequest(Facility facility, MaintenanceInspectionImp facilityMaintenanceDetails, String facilityID, int facilityMaintenanceCost) {
	
}

public Integer calcMaintenanceCostForFacility(Facility facility) {}
public String calcProblemRateForFacility(Facility facility) {}
public Integer calcDownTimeForFacility(Facility facility) {}

public Maintenance scheduleMaintenance(Maintenance maint) {} */


//TODO
/* I changed it from "public ArrayList<Maintenance> listMaintRequests(Facility facility)" to */
public ArrayList<Maintenance> listMaintRequests(MaintenanceInspectionImp maint){
	try {
		System.out.println("List Maintenane Request");
		for (int i= 0; i < maintReqList.size();i++) {
			System.out.println(maintReqList.get(i).getFacilityMaintenanceDetails()); 
		}
		}catch (Exception e) {
			System.err.println("Cannot retrieve all Maintenance Request.");	
		}
	return maint.getFacilityMaintenanceDetail();
}

//TODO List all Maintenance 
public ArrayList<Maintenance> listMaintenance(Facility facility){
	try {
		System.out.println("List Maintenane");
		for (int i= 0; i < maintList.size();i++) {
			System.out.println(maintList.get(i).getFacilityID()); 
		}
		}catch (Exception e) {
			System.err.println("Cannot retrieve all Maintenance.");	
		}
	return maintList;
}

public ArrayList<Maintenance> listFacilityProblems(Facility facility){}

@Override
public String toString() {
	return "MaintenanceImp [facilityMaintenanceCost=" + facilityMaintenanceCost + ", facilityMaintenanceDetails="
			+ facilityMaintenanceDetails + ", facilityID=" + facilityID + ", facility=" + facility + ", inspection="
			+ inspection + "]";
}


}
