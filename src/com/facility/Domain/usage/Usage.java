package com.facility.Domain.usage;

import java.util.ArrayList;

import com.facility.Domain.facility.FacilityImp;

public interface Usage {
	
	public void setFacilityUseStart(Integer facilityUseStart);
	public Integer getFacilityUseStart();
	
	public void setFacilityUseEnd(Integer facilityUseEnd);
	public Integer getFacilityUseEnd();
	
	public void setFacilityActualUsage(Integer facilityActualUsage);
	public Integer getFacilityActualUsage();
	
	public String getFacilityInspectionType();
	public void setFacilityInspectionType(String inspectionType);
	public FacilityImp getFacilityForUse();
	public void setFacilityForUse(FacilityImp facility);
	
	public ArrayList<Integer> listActualUsage();
	public ArrayList<String> listInspection();
	public Integer calcUsageRate();
	public FacilityImp assignFacilityToUse(FacilityImp facility);
	public FacilityImp vacateFacility(FacilityImp facility);
	public Integer isInUseDuringInterval();
	
	public String toString();

}
