package com.facility.DAO.service;

import java.util.ArrayList;

import com.facility.DAL.Usage.UsageDAO;
import com.facility.Domain.usage.Usage;

public class UsageService {
	private UsageDAO useDAO = new UsageDAO();
	
	public ArrayList<Usage> listActualUsage(){
	try {
		return useDAO.listActualUsage();
	} catch (Exception e) {
		System.err.println("Cannot retrieve all Usages.");
	}
	return null;
}
	public ArrayList <Usage>listInspection(){
	try {
		return useDAO.listInspection();
	} catch (Exception e) {
		System.err.println("Cannot retrieve all inspections.");
	}
	return null;
}
	public Integer calcUsageRate (Usage usage) {
	try {
		Integer n = useDAO.calcUsageRate(usage);
	System.out.println("Price of usage Rate has been calculated.");
	return n;
	}catch (Exception e) {
		System.err.println("Could not calculate price of usage.");
	}
	return 0;
}
	public Usage assignFacilityToUse(Usage usage) {
	try {
		useDAO.assignFacilityToUse(usage);
		System.out.println("Facility has been assigned to use.");
		return usage;
	}catch (Exception e) {
		System.err.println("Facility could not be assigned,");
	}
	return null;
}
	public Usage vacateFacility(Usage usage) {
		try{
			useDAO.vacateFacility(usage);
			System.out.println("Facility have been void.");
			return usage;
		}catch (Exception e) {
			System.err.println("failed to be voided");	
		}
		return null;
	}
		public Usage isInUseDuringInterval(Usage usage) {
			try {
				useDAO.isInUseDuringInterval(usage);
				System.out.println(" Facility is in use during interval.");
				return usage;
			}catch(Exception e) {
				System.err.println("Fsvility is not in use.");
			}
			return null;
		}
	}

