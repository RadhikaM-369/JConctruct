package com.xworkz.OOPconcepts;

public class SimCard {
	int price;
	String nameOfTheNetwork;
	int No_of_subscribers;
	int NoOfSimCardsAvaible;
	String typeOfSimcard;
	String plans;
	int validity;
	String nameOfSubscriber;
	long adharNo;
public SimCard() {
	System.out.println("Constructor invoked");
	
}
public SimCard(long adharNo,String nameOfTheNetwork,int price,String nameOfSubscriber) {
	System.out.println("Constructor with parameters invoked");
	this.adharNo=adharNo;
	this.nameOfTheNetwork=nameOfTheNetwork;
	this.price=price;
	this.nameOfSubscriber=nameOfSubscriber;}

public void displayInfo() {
	System.out.println(this.adharNo);
	System.out.println(this.nameOfTheNetwork);
	System.out.println(this.price);
	System.out.println(this.nameOfSubscriber);	
}
	public void purchage() {
		System.out.println("start subscription ");
	}
	public void changePlan() {
		System.out.println("Change current plan");
	}
	public void port() {
		System.out.println("Change to another network ");
	}
	
}
