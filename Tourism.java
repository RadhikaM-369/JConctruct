package com.xworkz.OOPconcepts;

public class Tourism {
	String Place;
	int priceOfPackage;
	int noOfpeople;
	String nameOfPerson;
	long mobileNo;
	String address;
	public Tourism() {
		System.out.println("Constructor invoked");
	}
	public Tourism(String Place,int priceOfPackage,	int noOfpeople,	String nameOfPerson, String address,long mobileNo) {
		System.out.println("Constructor with parametersinvoked");
		this.Place=Place;
		this.priceOfPackage=priceOfPackage;
		this.noOfpeople=noOfpeople;
		this.nameOfPerson=nameOfPerson;
		this.address=address;
		this.mobileNo=mobileNo;
	}
	public void DisplayInfo() {
		System.out.println(this.Place);
		System.out.println(this.priceOfPackage);
		System.out.println(this.noOfpeople);
		System.out.println(this.nameOfPerson);
		System.out.println(this.address);
		System.out.println(this.mobileNo);
	}
	public void publish() {
		System.out.println("Publish advertisements here: if any offers avaible??");
	}
	public void startBooking() {
		System.out.println("Booking starts from today... ");
	}
	public void stopBooking() {
		System.out.println("Sorry Booking closed....!!");
	}
	public void cancelBooking() {
		System.out.println("Booking cancelled..!!");	
	}
	
}
