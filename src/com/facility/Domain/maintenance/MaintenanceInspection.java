package com.facility.Domain.maintenance;

import java.util.Date;


public class MaintenanceInspection {
private Date inspectionDate;
private String inspectionType;
private String inspectionReport;
private String urgency;
private String detail;
private Date requestDate;

public MaintenanceInspection() {
	// TODO Auto-generated constructor stub
}

public MaintenanceInspection(Date inspectionDate, String inspectionType, String inspectionReport, String urgency,
		String detail, Date requestDate) {
	this.inspectionDate = inspectionDate;
	this.inspectionType = inspectionType;
	this.inspectionReport = inspectionReport;
	this.urgency = urgency;
	this.detail = detail;
	this.requestDate = requestDate;
}



public Date getInspectionDate() {
	return inspectionDate;
}
public void setInspectionDate(Date inspectionDate) {
	this.inspectionDate = inspectionDate;
}
public String getInspectionType() {
	return inspectionType;
}
public void setInspectionType(String inspectionType) {
	this.inspectionType = inspectionType;
}

public String getUrgency() {
	return urgency;
}
public void setUrgency(String urgency) {
	this.urgency = urgency;
}

@Override
public String toString() {
	return "MaintenanceInspection [inspectionDate=" + inspectionDate + ", inspectionType=" + inspectionType
			+ ", inspectionReport=" + inspectionReport + ", urgency=" + urgency + ", detail=" + detail
			+ ", requestDate=" + requestDate + "]";
}
public void setRequestDate(Date now) {
	// TODO Auto-generated method stub
	
}

public void setInspectionReport(String string) {
	// TODO Auto-generated method stub
	
}



}
