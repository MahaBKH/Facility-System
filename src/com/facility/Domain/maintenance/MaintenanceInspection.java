package com.facility.Domain.maintenance;

import java.util.Date;

public interface MaintenanceInspection {
	public Date getInspectionDate();
	public void setInspectionDate(Date inspectionDate);
	
	public String getInspectionType();
	public void setInspectionType(String inspectionType);
	
	public String getUrgency();
	public void setUrgency(String urgency);
	
	public void setInspectionReport(String report);
	public String getInspectionReport();
	public void setRequestDate(Date now);
	public Date getRequestDate();
	
	public String toString();

	
}
