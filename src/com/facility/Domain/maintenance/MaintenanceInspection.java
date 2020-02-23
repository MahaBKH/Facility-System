package com.facility.Domain.maintenance;

import java.util.Date;


public class MaintenanceInspection {
private Date inspectionDate;
private String inspectionType;
private String inspectionReport;
private int urgency;
private String detail;
private Date requestDate;



public MaintenanceInspection(Date inspectionDate, String inspectionType, String inspectionReport, int urgency,
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
public String getInspectionReport() {
	return inspectionReport;
}
public void setInspectionReport(String inspectionReport) {
	this.inspectionReport = inspectionReport;
}
public int getUrgency() {
	return urgency;
}
public void setUrgency(int urgency) {
	this.urgency = urgency;
}
public String getDetail() {
	return detail;
}
public void setDetail(String detail) {
	this.detail = detail;
}
public Date getRequestDate() {
	return requestDate;
}
public void setRequestDate(Date requestDate) {
	this.requestDate = requestDate;
}

@Override
public String toString() {
	return "MaintenanceInspection [inspectionDate=" + inspectionDate + ", inspectionType=" + inspectionType
			+ ", inspectionReport=" + inspectionReport + ", urgency=" + urgency + ", detail=" + detail
			+ ", requestDate=" + requestDate + "]";
}



}
