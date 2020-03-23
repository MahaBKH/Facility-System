package com.facility.Domain.facility;

public class FacilityAddressImp implements FacilityAddress{
public String street;
public String state;
public String country;
public int zip;

public FacilityAddressImp(String street, String state, String country, int zip) {
	
	this.street = street;
	this.state = state;
	this.country = country;
	this.zip = zip;
}


public FacilityAddressImp() {
	
}


public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public int getZip() {
	return zip;
}
public void setZip(int zip) {
	this.zip = zip;
}


@Override
public String toString() {
	return "FacilityAddress [street=" + street + ", state=" + state + ", country=" + country + ", zip=" + zip + "]";
}


}
