package com.facility.View;

import com.facility.Domain.facility.FacilityImp;
import com.facility.Domain.maintenance.MaintenanceImp;
import com.facility.Domain.maintenance.MaintenanceInspection;
import com.facility.Domain.maintenance.MaintenanceInspectionImp;
import com.facility.Domain.service.FacilityService;
import com.facility.Domain.service.MaintenanceService;
import com.facility.Domain.service.UsageService;
import com.facility.Domain.usage.Usage;
import com.facility.Domain.usage.UseImp;

import java.util.Date;

import com.facility.Domain.facility.FacilityAddressImp;
import  com.facility.Domain.facility.FacilityDetailsImp;

public class FacilitySystemClient {
	public static void main (String args[]) throws Exception {
		
		//new facility
		
	
		
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
		
		facility.addNewFacility(facility);
		facility.addFacilityDetail(details);
		facility.listFacilities();
		facility.requestAvailableCapacity(facility);
		facility.getFacilityInformation(facility);
		facility.removeFacility(facility);
		
		
		//maintenance service 
		MaintenanceInspection m = new MaintenanceInspection();
	
		maint.calcMaintenanceCostForFacility(facility);
		m.scheduleMaintenance(maint);
		maint.makeFacilityMaintRequest(facility, inspection, facility.getFacilityId(), maint.getFacilityMaintenanceCost());
		maint.listMaintRequests(facility);
		
		maint.getAllMaintenance();
		maint.listFacilityProblems(maint);
		
		maint.calcProblemRateForFacility(facility);
		maint.calcDownTimeForFacility(facility);
		
			//Usage Service
		UseImp use = new UseImp();
		use.listActualUsage();
		use.listInspection();
		
	}

}
