package com.xworkz.OOPconcepts;
import java.util.Date;

public class Satellite {
	Date launchDate;
	int durationDesign;
	int speed;
	int weight;
	String powerSource;
	String camera;
	String scientificSensors;
	String orbitPath;
public Satellite() {
	System.out.println("Constructor Satellite ivoked");	
	}
public Satellite(int durationDesign, int speed,int weight) {
	System.out.println("Costructor with few parameters ivoked");
	this.durationDesign=durationDesign;
	this.speed=speed;
	this.weight=weight;
}
public void displayInfo() {
	System.out.println(this.durationDesign);
	System.out.println(this.speed);
	System.out.println(this.weight);
}

public void info() {
	System.out.println("collect data from solar system and universe");
}
public void BEV() {
	System.out.println("Bird-eye-view: see large area of earth at on time");
}
public void telephones() {
	System.out.println("Satellite provide in-flight phone communications on airoplanes);");
}
public void television() {
	System.out.println("Satellite send television signals directly to homes but they also are backbone of cable and network TV");
}
public void navigation() {
	System.out.println("GPS based systems are used by civilians & the military for navigation on land, sea and air");
}
public void weather() {
	System.out.println("Satellite provide meteorologists with the ability to see weather on global scale");
}
public void climate() {
	System.out.println("satellites are best source of data for climate change research, determine long term patterns of rainfall & emissions of greenhouse gases");
}
}
