package com.facility.Domain.usage;

public interface Usage {
	
	public int FacilityUseStart();
	public int FacilityUseEnd();
	public int FacilityActualUsage();
	public void facilityHoursOfOperation(int hoursOfOperation);
	public void facilityAssignHoursOfOperation(int assignHoursOfOperation);
	public void vacateFacility();
	
	public void facilityList();
	
	public String toString();

}
