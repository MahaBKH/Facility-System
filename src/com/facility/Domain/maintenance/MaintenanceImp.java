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
		FacilityImp facility, MaintenanceInspectionImp inspection, int downTimeForFacility,int problemRateForFacility) {
	this.facilityMaintenanceCost = facilityMaintenanceCost;
	this.facilityMaintenanceDetails = facilityMaintenanceDetails;
	this.facilityID = facilityID;
	this.facility = facility;
	this.downTimeForFacility = downTimeForFacility;
	this.problemRateForFacility = problemRateForFacility;
	maintList.add(this);	

}
	//public MaintenanceImp(int downTimeForFacility,int problemRateForFacility) {
	//constructors
	//this.downTimeForFacility = downTimeForFacility;
	//this.problemRateForFacility = problemRateForFacility;
 
//}
 
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
public ArrayList<MaintenanceImp> listMaintRequests(MaintenanceImp maint){
	return maintReqList;
}


//List Facility Problems 
public ArrayList<MaintenanceImp> listFacilityProblems(MaintenanceImp maint){
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


public Integer calcMaintenanceCostForFacility(FacilityImp facility) {
	Integer n = 0;
	try {
		System.out.println("The Cost For Maintenance: ");
		
		for (int i = 0; i < maintList.size(); i++){
			n = n + maintList. get(i).getFacilityMaintenanceCost();
		}
		
	}catch (Exception e) {
		System.err.println("Cost for Maintenance could not be calculated.");
		}
	return n;
	}
	

public Integer calcProblemRateForFacility(FacilityImp facility) {
	Integer n = 0;
	try {
		System.out.println("The problem Rate for facility: ");
		
		for (int i = 0; i < maintList.size(); i++){
			n = n + maintList. get(i).getProblemRateForFacility();
		}
	}catch (Exception e) {
		System.err.println("Problem rate for facility could not be calculated.");
		}
		return n;
	}
	

public Integer calcDownTimeForFacility(FacilityImp facility) {
	Integer n = 0;
	try {
		System.out.println("The down time for facility is: ");
		
		for (int i = 0; i < maintList.size(); i++){
			n = n + maintList. get(i).downTimeForFacility;
		}
	}catch (Exception e) {
		System.err.println("The down time for facility could not be calculated.");
		}
		return n;
}




@Override
public String toString() {
	return "MaintenanceImp [facilityMaintenanceCost=" + facilityMaintenanceCost + ", facilityMaintenanceDetails="
			+ facilityMaintenanceDetails + ", facilityID=" + facilityID + ", facility=" + facility + ", inspection="
			+ inspection + "]";
}



}
