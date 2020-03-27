package com.facility.Domain.maintenance;

import java.util.ArrayList;

import com.facility.Domain.facility.Facility;
import  com.facility.Domain.facility.FacilityImp;

import com.facility.Domain.maintenance.MaintenanceInspectionImp;

public class MaintenanceImp implements Maintenance {

	private int facilityMaintenanceCost;
	private int downTimeForFacility;
	private int problemRateForFacility;
	private String facilityID;
	private Facility facility;
	private MaintenanceInspectionImp inspection;
	private MaintenanceInspectionImp facilityMaintenanceDetails;
	

	private static ArrayList<MaintenanceImp> maintList = new ArrayList<MaintenanceImp>();
	private static ArrayList<MaintenanceImp> maintReqList = new ArrayList<MaintenanceImp>();
	private ArrayList<MaintenanceImp> facilityProbList = new ArrayList<MaintenanceImp>();



public MaintenanceImp(int facilityMaintenanceCost, MaintenanceInspectionImp facilityMaintenanceDetails, String facilityID,
		FacilityImp facility, MaintenanceInspectionImp inspection) {
	this.facilityMaintenanceCost = facilityMaintenanceCost;
	this.facilityMaintenanceDetails = facilityMaintenanceDetails;
	this.facilityID = facilityID;
	this.facility = facility;
	maintList.add(this);	

}
	public MaintenanceImp(int downTimeForFacility,int problemRateForFacility) {
	//constructors
	this.downTimeForFacility = downTimeForFacility;
	this.problemRateForFacility = problemRateForFacility;
 
}
 
//Get Facility Maintenance Cost
public Integer getFacilityMaintenanceCost() {
	return facilityMaintenanceCost;
}
//Updates Facility Maintenance Cost
public void setFacilityMaintenanceCost(int facilityMaintenanceCost) {
	this.facilityMaintenanceCost = facilityMaintenanceCost;
}
//Gets Down Time For Facility
public Integer getDownTimeForFacility() {
	return downTimeForFacility;
}
//Updates Down Time For Facility
public void setDownTimeForFacility(int downTimeForFacility) {
	this.downTimeForFacility = downTimeForFacility;
}
//Gets problem Rate For Facility
public Integer getProblemRateForFacility() {
	return problemRateForFacility;
}
//Updates problem Rate For Facility
public void setProblemRateForFacility(int problemRateForFacility) {
	this.problemRateForFacility = problemRateForFacility;
}
// Gets Facility Maintenance Details
public MaintenanceInspectionImp getFacilityMaintenanceDetails() {
	return inspection;
}
// Updates Facility Maintenance Details
public void setFacilityMaintenanceDetails(MaintenanceInspectionImp inspection) {
	this.inspection = inspection;
}
//GETS FACILITY ID
public String getFacilityID() {
	return facilityID;
}
//UPDATES FACILITY ID
public void setFacilityID(String facilityID) {
	this.facilityID = facilityID;
}
//Gets Facility
public Facility getFacility() {
	return facility;
}
//Update Facility
public void setFacility(FacilityImp facility) {
	this.facility = facility;
}
 


/* TODO: ADD TO METHODS TO INTERFACE AS WELL */
public MaintenanceInspectionImp makeFacilityMaintRequest (Facility facility, MaintenanceInspectionImp facilityMaintenanceDetails, 
String facilityID, int facilityMaintenanceCost) {
	this.facility = facility;
	this.facilityID = facilityID;
	this.facilityMaintenanceCost = facilityMaintenanceCost;
	this.facilityMaintenanceDetails = facilityMaintenanceDetails;
	maintReqList.add(this);
	return facilityMaintenanceDetails;	
}

//List all Maintenance
public ArrayList<MaintenanceImp> getAllMaintenance(){
	return maintList;
}

//List Maintenance Requests 
public ArrayList<MaintenanceImp> listMaintRequests(Maintenance maint){
	return maintReqList;
}


//List Facility Problems 
public ArrayList<MaintenanceImp> listFacilityProblems(Maintenance maint){
	try { 
		System.out.println("List Facility Problems");
		for (int i= 0; i <facilityProbList.size();i++) {
			System.out.println(facilityProbList.get(i).getFacilityMaintenanceDetails()); 
		}
		}catch (Exception e) {
			System.err.println("Cannot retrieve all Facility Problems.");	
		}
	return facilityProbList;
	}


public Integer calcMaintenanceCostForFacility(Facility facility) {
	try {
		System.out.println("The Cost For Maintenance: ");
		Integer n = 0;
		for (int i = 0; i < maintList.size(); i++){
			n = n + maintList. get(i).getFacilityMaintenanceCost();
		}
		return n;
	}catch (Exception e) {
		System.err.println("Cost for Maintenance could not be calculated.");
		}
		return 0;
	}
	

public Integer calcProblemRateForFacility(Facility facility) {
	try {
		System.out.println("The problem Rate for facility: ");
		Integer n = 0;
		for (int i = 0; i < maintList.size(); i++){
			n = n + maintList. get(i).getProblemRateForFacility();
		}
		return n;
	}catch (Exception e) {
		System.err.println("Problem rate for facility could not be calculated.");
		}
		return 0;
	}
	

public Integer calcDownTimeForFacility(Facility facility) {
	try {
		System.out.println("The down time for facility is: ");
		Integer n = 0;
		for (int i = 0; i < maintList.size(); i++){
			n = n + maintList. get(i).downTimeForFacility;
		}
		return n;
	}catch (Exception e) {
		System.err.println("The down time for facility could not be calculated.");
		}
		return 0;
}

//public Maintenance scheduleMaintenance(Maintenance maint) {} 



@Override
public String toString() {
	return "MaintenanceImp [facilityMaintenanceCost=" + facilityMaintenanceCost + ", facilityMaintenanceDetails="
			+ facilityMaintenanceDetails + ", facilityID=" + facilityID + ", facility=" + facility + ", inspection="
			+ inspection + "]";
}


}
