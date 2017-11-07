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


//#(II.a) Car is a Vechicle
public class Car extends Vechicle {

	
    // int used for seating capacity var.
	private int seatingCapacity;
	@Override
	// method used to return the cost accumilated for this car ( seating caopacity multiplied by 100)
	public  String getCostOfHire() {
		// TODO Auto-generated method stub
		// calculation stored in var cost
		int cost = this.seatingCapacity * 100;
		// cal cast to String
		String strcost = String.valueOf(cost);
		// String returned
		return strcost;
	}

	@Override
	// returns this.make of Vechicle object Car
	public String getMake() {
		// TODO Auto-generated method stub
		return this.make;
	}

	@Override
	// returns the car model
	public String getModel() {
		// TODO Auto-generated method stub
		return this.model;
	}

	@Override
	// returns regNumber
	public String getRegNumber() {
		// TODO Auto-generated method stub
		return this.regNumber;
	}
	
	public Car(){
		
	}
// constructer
	// patrameters passed to methos are assigned to this. instanvce of a Car is a Vechicle
	public Car(String make, String model, String regNumber, int seatCap){
		this.make = make;
		this.model = model;
		this.regNumber = regNumber;
		
		// (#II.b) int for car double for Truck
		this.seatingCapacity = seatCap;
		
	}
	//(#II.c)
	// returns make model reg no and cost of each individual car.
	public  String toString(){
		    String Result =("Make: " + getMake() + "\nModel: " + getModel() + "\nReg Number: " + getRegNumber() + "\nCost:"+ getCostOfHire()  );
		    return Result;
	}
}
