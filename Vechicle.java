/**
 * * -------------
 *  LAB2 Q(7)  PART A,B
 *  -------------
 *  Assignment No: Assignment 2 
 *  Question: Lab 2, Question (a).
 *  Author:  O_RIAIN_M R00158067
 *  -------------------------------------
 * Part​ ​ a) Write​ ​ the​ ​ code​ ​ for​ ​ each​ ​ of​ ​ the​ ​ classes​ ​ in​ ​ the​ ​ above​ ​ diagrams.
 * (II.a) make DONE
 * (II.b) model DONE
 * (II.c) regNumber DONE
 * (II.d) getCostOfHire() 
 * (II.e) getMake() DONE
 * (II.f) getModel() DONE   
 * (II.g) getRegNumber() DONE   
 */
public abstract class Vechicle {

	
	
	//#(II.a,b,c) 
	protected String make, model, regNumber;
	//(II.d) abstract used to return Cost of Hire
	public abstract String getCostOfHire();
	//(II.e) used to return make
	public abstract String getMake();
	//(II.f) used to return model
	public abstract String getModel();
	//(II.g) used to return regNumber
	public abstract String getRegNumber();
	
	
}


