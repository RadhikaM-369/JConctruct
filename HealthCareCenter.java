package com.xworkz.OOPconcepts;
import java.util.Date;

public class HealthCareCenter {
	Date Appointment;
	String PatientName;
	String NameOfCareCenter;
	int noOfsections;
	String location;
	int noOfDoctors;
	int payment;
public HealthCareCenter() {
	System.out.println("Constructor invoked");
}
public HealthCareCenter(String NameOfCareCenter,String location,String PatientName) {
	System.out.println("Constructor with parameters invoked");
	this.NameOfCareCenter=NameOfCareCenter;
	this.location=location;
	this.PatientName=PatientName;
}
public void DisplayInfo() {
	System.out.println(this.NameOfCareCenter);
	System.out.println(this.location);
	System.out.println(this.PatientName);
}
	public void form() {
		System.out.println("Fill required information about patients");	}
	
	public void consult() {
		System.out.println("consult doctors");	}
	
	public void scanning() {
		System.out.println("proper diagnose of desease or infections"); }
	
	public void yoga() {
		System.out.println("practice/ learn yoga here");	}
	
	public void pharma() {
		System.out.println("Buy medicine here...");}
	
	public void payment() {
		System.out.println("Bill paid.. collect reciepts");
		}
}
