package com.facility.Domain.maintenance;

import java.util.Date;


public class MaintenanceInspectionImp {
private Date inspectionDate;
private Date requestDate;
private String inspectionType;
private String inspectionReport;
private String urgency;


public MaintenanceInspectionImp() {
	
}

public MaintenanceInspectionImp(Date inspectionDate, String inspectionType, String inspectionReport, String urgency,
		String detail, Date requestDate) {
	this.inspectionDate = inspectionDate;
	this.inspectionType = inspectionType;
	this.inspectionReport = inspectionReport;
	this.urgency = urgency;
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



public void setInspectionReport(String report) {
	this.inspectionReport = report;
	
}

public String getInspectionReport() {
	return inspectionReport;
	
}

public void setRequestDate(Date request) {
	this.requestDate = request;
}

public Date getRequestDate() {
	return requestDate;
}

@Override
public String toString() {
	return "MaintenanceInspection [inspectionDate=" + inspectionDate + ", inspectionType=" + inspectionType
			+ ", inspectionReport=" + inspectionReport + ", urgency=" + urgency +  "]";
}







}
