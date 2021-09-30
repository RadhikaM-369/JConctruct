package com.xworkz.OOPconcepts;

public class Database {
	String name;
	String address;
	long mobile_no;
	long adhar_no;

public Database() {
	System.out.println("Conctructor Invoked");
}
public Database(String name, String address,long mobile_no,long adhar_no) {
	System.out.println("Conctructor with parameter Invoked");
	this.name=name;
	this.address=address;
	this.mobile_no=mobile_no;
	this.adhar_no=adhar_no;
}
public void displayInfo() {
	System.out.println(this.name);
	System.out.println(this.address);
	System.out.println(this.mobile_no);
	System.out.println(this.adhar_no);
}
	
 public void addData() {
	 System.out.println("Add information");}
 
 public void deleteData() {
	 System.out.println("Delete the information");}
 
 public void editData() {
	 System.out.println(" Edit the information");
	
	}

}
