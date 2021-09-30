package com.xworkz.OOPconcepts;

public class Garments {
String catagory;
int quantity;
int price;
int size;
String color;
String brand;
public Garments() {
	System.out.println("Constructor invoked");
}
public Garments(String catagory,int quantity,String color,int price) {
	System.out.println("Constructor with parameters invoked");
	this.catagory=catagory;
	this.quantity=quantity;
	this.color=color;
	this.price=price;
}
public void displayInfo() {
	System.out.println(this.catagory);
	System.out.println(this.quantity);
	System.out.println(this.color);
	System.out.println(this.price);
}
public void demand() {
	System.out.println("No of quantity required");
}
public void startdesigning() {
	System.out.println("start designing garments");
}
public void stop() {
	System.out.println("Stop designing garments");
}
public void sales() {
	System.out.println("sale the garments");
}
}
