package com.facility.View;

import com.facility.Domain.facility.FacilityImp;
import com.facility.Domain.maintenance.MaintenanceImp;
import com.facility.Domain.maintenance.MaintenanceInspection;
import com.facility.Domain.maintenance.MaintenanceInspectionImp;

import com.facility.Domain.usage.Usage;
import com.facility.Domain.usage.UseImp;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.facility.Domain.facility.FacilityAddressImp;
import  com.facility.Domain.facility.FacilityDetailsImp;

public class FacilitySystemClient {
	public static void main (String args[]) throws Exception {
		
		//new facility
		SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	
		
		FacilityDetailsImp details = new FacilityDetailsImp();
		FacilityAddressImp address = new FacilityAddressImp();
		
		
		FacilityImp facility = new FacilityImp("Peet's Coffee", "23453", details);

		address.setCountry("USA");
		address.setState("IL");
		address.setStreet("1110 Sherdian");
		address.setZip(33303);
		details.setAddress(address);
		details.setCapacity(100);
		details.setPhone("6305552323");
		facility.setDetails(details);
		
		System.out.println(details.toString());
		System.out.println(facility.toString());
		
		
		
		//new maintenance
		MaintenanceImp maint = new MaintenanceImp();
		MaintenanceInspectionImp inspection = new MaintenanceInspectionImp();
		MaintenanceInspectionImp ins = new MaintenanceInspectionImp();
		maint.setFacility(facility);
		maint.setFacilityMaintenanceCost(150);
		String mThree = "03/03/2020 17:00:00";
		String mT = "05/19/2020 12:00:00";
		
		Date date = sd.parse(mThree);
		
		Date soon = sd.parse(mT);
		inspection.setInspectionDate(date);
		
		inspection.setInspectionReport("SCHEDULED");
		ins.setInspectionReport("REPORTED");
		ins.setInspectionDate(soon);
		inspection.setInspectionType("SEMI-ANNUAL");
		ins.setInspectionType("ANNUAL");
		ins.setUrgency("LOW");
		inspection.setUrgency("LOW");
		
		maint.setFacilityMaintenanceDetails(inspection);
		
		//facility service
		
		facility.addNewFacility(facility);
		facility.addFacilityDetail(details);
		facility.listFacilities();
		facility.requestAvailableCapacity(facility);
		facility.getFacilityInformation(facility);
		facility.removeFacility(facility);
		
		//maintenance service 
		//Integer facilityMaintenanceCost, MaintenanceInspectionImp facilityMaintenanceDetails, String facilityID,
		//FacilityImp facility, MaintenanceInspectionImp inspection, Integer downTimeForFacility, Integer problemRateForFacility
		MaintenanceImp m = new MaintenanceImp(100, ins, facility);

//		Date(int year, int month, int date)
		Date inspectionDate = new Date(20, 07, 23);
//		maint.scheduleMaintenance(inspectionDate, "roof inspection", "tiles sliding", "LOW");
		
		//FacilityImp facility, MaintenanceInspectionImp inspection, Integer facilityMaintenanceCost
		maint.makeFacilityMaintRequest(facility, ins, maint.getFacilityMaintenanceCost());
		
		
		
		maint.makeFacilityMaintRequest(facility, inspection, 200);

		System.out.println("CURRENT LIST OF MAINTENANCE REQUESTS PUT IN PLACE: " + maint.listMaintRequests(facility)+ '\n');
		
		System.out.println("CURRENT LIST OF MAINT:" + maint.listMaintenance() + '\n');
		
		maint.reportProblemForFacility(facility, "Leaky roof");
		maint.reportProblemForFacility(facility, "electricity outage");
		maint.reportProblemForFacility(facility, "plumbing issue");
		System.out.println("This current facility has " + maint.calcProblemRateForFacility(facility) + " problems."+ '\n');
		System.out.println("The facility problems are: " + maint.listFacilityProblems(facility)+ '\n');
		System.out.println("Current Downtime for facility: " + (maint.calcDownTimeForFacility(facility)) + " Days."+ '\n');
		System.out.println("CURRENT MAINT COST: " +  maint.calcMaintenanceCostForFacility(facility)+ '\n');
		maint.scheduleMaintenance(inspectionDate, "ANNUAL", "SCHEDULED", "LOW");

			//Usage Service
		UseImp use = new UseImp();
		use.listActualUsage();
		use.listInspection();
		
	}

}
