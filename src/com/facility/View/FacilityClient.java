package com.facility.View;

import com.facility.Domain.facility.FacilityImp;
import com.facility.Domain.maintenance.MaintenanceImp;
import com.facility.Domain.maintenance.MaintenanceInspection;
import com.facility.Domain.service.FacilityService;
import com.facility.Domain.service.MaintenanceService;

import java.util.Date;

import com.facility.Domain.facility.FacilityAddress;
import  com.facility.Domain.facility.FacilityDetails;

public class FacilityClient {
	public static void main (String args[]) throws Exception {
		
		//new facility
		FacilityImp facility = new FacilityImp();
		facility.setFacilityId("1111");
		facility.setName("Peet's Coffee");
		
		FacilityDetails details = new FacilityDetails();
		FacilityAddress address = new FacilityAddress();
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
		MaintenanceInspection inspection = new MaintenanceInspection();
		maint.setFacility(facility);
		maint.setFacilityID(facility.getFacilityId());
		maint.setFacilityMaintenanceCost(150);
		
		Date date = new Date(2020, 03, 20, 0, 0);
		Date now = new Date();
		inspection.setInspectionDate(date);
		
		inspection.setInspectionReport("SCHEDULED");
		inspection.setInspectionType("SEMI-ANNUAL");
		inspection.setRequestDate(now);
		inspection.setUrgency("LOW");
		
		maint.setFacilityMaintenanceDetails(inspection);
		
		//facility service
		FacilityService management = new FacilityService();
		management.addNewFacility(facility);
		management.addFacilityDetail(details);
		management.listFacilities();
		management.requestAvailableCapacity(facility);
		management.getFacilityInformation(facility);
		management.removeFacility(facility);
		
		//maintenance service 
		MaintenanceService m = new MaintenanceService();
	
		m.calcMaintenanceCostForFacility(facility);
		m.scheduleMaintenance(maint);
		m.makeFacilityMaintRequest(facility, inspection, facility.getFacilityId(), maint.getFacilityMaintenanceCost());
		m.listMaintRequests(facility);
		m.listMaintenance(facility);
		
		
		m.listFacilityProblems(facility);
		
		m.calcProblemRateForFacility(facility);
		
		
		m.calcDownTimeForFacility(facility);
		
	}

}
