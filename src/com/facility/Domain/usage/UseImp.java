package com.facility.Domain.usage;

public class UseImp implements Usage {
	private int FacilityUseStart;
	private int FacilityUseEnd;
	private int FacilityActualUsage;
	public int getFacilityUseStart() {
		return FacilityUseStart;
	}
	public void setFacilityUseStart(int facilityUseStart) {
		FacilityUseStart = facilityUseStart;
	}
	public int getFacilityUseEnd() {
		return FacilityUseEnd;
	}
	public void setFacilityUseEnd(int facilityUseEnd) {
		FacilityUseEnd = facilityUseEnd;
	}
	public int getFacilityActualUsage() {
		return FacilityActualUsage;
	}
	public void setFacilityActualUsage(int facilityActualUsage) {
		FacilityActualUsage = facilityActualUsage;
	}
	
	public String toString() {
		return "UseImp [FacilityUseStart=" + FacilityUseStart + ", FacilityUseEnd=" + FacilityUseEnd
				+ ", FacilityActualUsage=" + FacilityActualUsage + "]";
	}
	@Override
	public int FacilityUseStart() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int FacilityUseEnd() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int FacilityActualUsage() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void facilityHoursOfOperation(int hoursOfOperation) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void facilityAssignHoursOfOperation(int assignHoursOfOperation) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void vacateFacility() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void facilityList() {
		// TODO Auto-generated method stub
		
	}


}
