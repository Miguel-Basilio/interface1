
public abstract class Automibile implements Drive{
 
private int gear;
private int gearNumber;
private int operatingCycle;
private double currentSpeed;
private int year;
private double millage;
private String color;
private String model;
private String make;
private String name;

public Automibile(int gearNumber, int year,String make, String color, String model) {

this.year=year;
this.color=color;
this.model=model;
this.make= make;
this.gearNumber=gearNumber;

}

public void setYear(int year){
	this.year= year;	
}
public void setOperatingCycle(int operatingCycle){
	this.operatingCycle=operatingCycle;
}
public void setCurrentSpeed(double speed){
	currentSpeed=speed;	
}
public void setColor(String color){
	this.color=color;
}
public void setModel(String model){
	this.model=model;
}
public void setGearNumber(int gearNumber){
	this.gearNumber=gearNumber;
}
public void setMake(String make){
	this.make=make;
}
public void setName(String name){
	this.name=name;
}
public void increaseGear(){
	gear++;
}
public void setGear(int g){
	gear = g;
}
public void getMillage(double m){
	millage= millage +m;
}
public int getGear(){
	return gear;
}
public double getCurrentSpeed(){
	return currentSpeed;
}
public double getMillage(){
	return millage;
}
public int getOperatingCycle(){
	return operatingCycle;
}
public int getGearNumber(){
	return gearNumber;
}
public String getName(){
	return name;
}



public String toString()
{
	return String.format("\nYear: %d, Make: %s, Color: %s, Gear Number: %d, Operating Cycle: %d, "
			+ " Currernt Gear: %d, Current Speed: %.0f,  Millage: %.2f",
			year, make, color,gearNumber,operatingCycle,gear,currentSpeed,millage);
			 }

}