package com.facility.Domain.maintenance;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;


import com.facility.Domain.facility.Facility;
import  com.facility.Domain.facility.FacilityImp;

import com.facility.Domain.maintenance.MaintenanceInspectionImp;

public class MaintenanceImp implements Maintenance {
	private Integer facilityMaintenanceCost;
	


	private Facility facility;
	private MaintenanceInspectionImp inspection;

	//CONTAINS ALL NEEDED MAINTENANCE, WHETHER IT BE LOW URGENCY OR HIGH URGENCY
	private static ArrayList<MaintenanceImp> maintList = new ArrayList<MaintenanceImp>();
	
	//CONTAINS ALL SCHEDULED MAINTENANCE
	private static ArrayList<MaintenanceInspectionImp> scheduledMaint = new ArrayList<MaintenanceInspectionImp>();

	//CONTAINS ALL PROBLEMS FOR FACILITY
	HashMap<FacilityImp, ArrayList<String>> facilityProblems = new HashMap<>();
	
	//CONTAINS ALL OF THE REQUESTS THAT ARE CURRENTLY IN PROGRESS FOR MAINTENANCE
	HashMap<FacilityImp, ArrayList<Object>> requestList = new HashMap<>();

public MaintenanceImp() {
	
}


public MaintenanceImp(Integer facilityMaintenanceCost, MaintenanceInspectionImp inspection, FacilityImp facility) {
	this.facilityMaintenanceCost = facilityMaintenanceCost;
	this.facility = facility;
	this.inspection = inspection;
	maintList.add(this);
}

public Integer getFacilityMaintenanceCost() {
	return facilityMaintenanceCost;
}

public void setFacilityMaintenanceCost(Integer facilityMaintenanceCost) {
	this.facilityMaintenanceCost = facilityMaintenanceCost;
}

//Returns the maintenance inspection details
public MaintenanceInspectionImp getFacilityMaintenanceDetails() {
	return inspection;
}

public void setFacilityMaintenanceDetails(MaintenanceInspectionImp inspection) {
	this.inspection = inspection;
}	

public Facility getFacility() {
	return facility;
}

public void setFacility(FacilityImp facility) {
	this.facility = facility;
}
 

//Allows facilities to report any problems that they may have
public void reportProblemForFacility(FacilityImp facility, String problem) {
	if(facilityProblems.containsKey(facility)) {
		facilityProblems.get(facility).add(problem);
	}else {
		ArrayList<String> prob = new ArrayList<String>();
		prob.add(problem);
		facilityProblems.put(facility, prob);
	}
}

// Lists all of the problems for the facility, if there are not problems reported, then a null value will be returned.
public ArrayList<String> listFacilityProblems(FacilityImp facility){
	if(!(facilityProblems.containsKey(facility))) {
		System.out.println("This facility currently does not have any problems reported.");
		return null;
	}
	return facilityProblems.get(facility);
}

// Calculates the problem rate for the facility
public Integer calcProblemRateForFacility(FacilityImp facility) {
	Integer n = 0;
	
		if(!(facilityProblems.containsKey(facility))) {
			System.out.println("This facility currently does not have any problems reported.");
			return n;
		}
		
		return (Integer)facilityProblems.get(facility).size();
	}

//Adds new maintenance request
public MaintenanceInspectionImp makeFacilityMaintRequest (FacilityImp facility, MaintenanceInspectionImp m, Integer facilityMaintenanceCost) {
	
	if (!(requestList.containsKey(facility))) {
		ArrayList<Object> values = new ArrayList<>();
		values.add(m);
		values.add(facilityMaintenanceCost);
		
		requestList.put(facility, values);
		
	}
	requestList.get(facility).add(m);	
	requestList.get(facility).add(facilityMaintenanceCost);	
	return m;	
}


//Adds maintenance request to the schedule
public MaintenanceInspectionImp scheduleMaintenance(Date inspectionDate, String inspectionType, String inspectionReport, String urgency) {
	MaintenanceInspectionImp inspect = new MaintenanceInspectionImp();
	inspect.setInspectionDate(inspectionDate);
	inspect.setInspectionReport(inspectionReport);
	inspect.setUrgency(urgency);
	inspect.setInspectionType(inspectionType);
	
	scheduledMaint.add(inspect);
	return inspect;
}

//List all available Maintenance
public ArrayList<MaintenanceImp> listMaintenance(){
	return maintList;
}

//List Maintenance Requests for a facility
public ArrayList<Object> listMaintRequests(FacilityImp facility){
	if (!(requestList.containsKey(facility))) {
		System.out.println("This facility has not made any maintenance reuqests yet!");
		return null;
	}
	
	ArrayList<Object> results = requestList.get(facility);
	ArrayList<Object> ans = new ArrayList<Object>();
	
	for (int i = 0; i<results.size(); i++) {
		if (results.get(i) instanceof MaintenanceInspectionImp) {
			ans.add(results.get(i));
		}
	}
	return ans;
}


//Calculates the total Maintenance cost for the facility
public Integer calcMaintenanceCostForFacility(FacilityImp facility) {
	int n = 0;
	if (!(requestList.containsKey(facility))) {
		System.out.println("This facility has not made any maintenance requests yet!");
		return (Integer)n;
	}
	ArrayList<Object> results = requestList.get(facility);
	
	for (int i = 0; i<results.size(); i++) {
		if (results.get(i) instanceof Integer) {
			n = n + (int)results.get(i);
		}
	}
	return (Integer)n;
}
	

public long getDateDiff(Date date1, Date date2) {
    long diffInMillies = date2.getTime() - date1.getTime();

    return TimeUnit.MILLISECONDS.toDays(diffInMillies);

}


//Calculates facility downtime in hours by finding the furthest date for a scheduled inspection for the selected facility
public Long calcDownTimeForFacility(FacilityImp facility) {
	Long n = null;
	if (!(requestList.containsKey(facility))) {
		System.out.println("This facility has no maintenance problems");
		return n;
	}
	
	ArrayList<Object> results = requestList.get(facility);
	Date now = new Date();
	Date d = new Date();
	for (int i = 0; i<results.size(); i++) {
		if (results.get(i) instanceof MaintenanceInspectionImp) {
			
			MaintenanceInspectionImp ins = (MaintenanceInspectionImp) results.get(i);
//			System.out.println(ins.getInspectionDate());
			if (ins.getInspectionDate().after(d)) {
				d = ins.getInspectionDate();
			}else {
				continue;}
			
			
			
			n =  getDateDiff(now, d);
		}
}
	return n;
}


@Override
public String toString() {
	return "MaintenanceImp [facilityMaintenanceCost=" 
			 + ", facility=" + facility + ", inspection="
			+ inspection + "]";
}




}
