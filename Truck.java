
/**
 * * -------------
 *  LAB2   PART A
 *  -------------
 *  Assignment No: Assignment 2 
 *  Question: Lab 2, Question (a).
 *  Author:  O_RIAIN_M R00158067
 *  -------------------------------------
 * Part​ ​ a) Write​ ​ the​ ​ code​ ​ for​ ​ each​ ​ of​ ​ the​ ​ classes​ ​ in​ ​ the​ ​ above​ ​ diagrams.
 * (II.a) Car() DONE
 * (II.b) -seatingCapacity DONE
 * (II.c) Car(String,String,String,int) DONE 
 */

// Truck is a Vechicle
public class Truck extends Vechicle {

// loadCapacity is double as per assignment 
	private double loadCapacity;
	@Override
	// method calculates cost by multiplying loadcapacity by 25
	public  String getCostOfHire() {
		
		// calculation stored in var cost of type Double
		double cost = (this.loadCapacity * 25);
		//System.out.println(cost);
		// double var is cast to a String 
		String strcost = String.valueOf(cost);
		// String var is returned with calulation
		return strcost;
	}

	@Override
	// gets make
	public String getMake() {
		// TODO Auto-generated method stub
		return this.make;
	}
//gets model
	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return this.model;
	}
// gets RegNumber
	@Override
	public String getRegNumber() {
		// TODO Auto-generated method stub
		return this.regNumber;
	}
	
	// Truck classis a Vechicle
	public Truck(){
		
	}
// Truck constructer
	// parameters passed to method used to construct Object
	public Truck(String make, String model, String regNumber, double loadCap){
		this.make = make;
		this.model = model;
		this.regNumber = regNumber;
		this.loadCapacity = loadCap;
		
	}
	// returns make model regnumber and cost for this Truck
	public String toString(){
       		
		
		String Result = ("Make: " + getMake() + "\nModel: " + getModel() );
		Result += ("\nReg Number: " + getRegNumber() + "\nCost: " + getCostOfHire() );
	
	    
		return Result;
	}
}


