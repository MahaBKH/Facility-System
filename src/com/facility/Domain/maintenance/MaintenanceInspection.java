package com.facility.Domain.maintenance;

import java.util.Date;
import  com.facility.Domain.facility.FacilityImp;

public class MaintenanceInspection {
private Date inspectionDate;
private String inspectionType;
private String inspectionReport;
private int urgency;
private String detail;
private Date requestDate;



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

public String toString() {
	String result = "Maintenance Type:" + this.getInspectionType();
	return result;
}

}
