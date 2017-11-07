import java.util.ArrayList;
//#import ArrayList List, I use an ArrayList class to perform the functionality required in the Assingment.
import java.util.InputMismatchException;


/**
 * * -------------
 *  LAB2  PART A
 *  -------------
 *  Assignment No: Assignment 2 
 *  Question: Lab 2, Question (a).
 *  Author:  O_RIAIN_M R00158067
 *  -------------------------------------
 * Part​ ​ a) Write​ ​ the​ ​ code​ ​ for​ ​ each​ ​ of​ ​ the​ ​ classes​ ​ in​ ​ the​ ​ above​ ​ diagrams.
 * (I.a) VechicleList class. DONE
 * (I.b) Collection DONE
 * (I.c) total DONE
 * (I.d) add(Vechicle v) DONE
 * (I.e) isEmpty() DONE   
 * (I.f) isFull() DONE   
 * (I.g) remove(int i) DONE
 * (I.h) getVechicle(int i) DONE
 * (I.i) getTotal() DONE
 * 
 * Reference to others works, sourced this information as ArrayList class adjusts its own capacity by shrinking and growing as neccessary
 * So I used a method found below to set a value (count=6) test the size of the list against this value. if I wanted to resrict the capacity
 * of the list completly I could remove the else statement.
 * http://stackoverflow.com/questions/15162600/java-arraylist-default-initial-vallues
 * @param args
 */



 
	 //#(I)
public class VechicleList{



	// used to define ArrayList  of object type <Vechicle>
	// the var for the ArrayList is collection
    private ArrayList<Vechicle> collection ; // #(I.b)
    
    
    
	// var assigned will be used later to return the total cost of vechicles in the list.
    private double total = 0;	//(I.c)
    
    // used to constrict the  vechicles being added  restricted to 6 initially, test used below to validate
    private int count = 6;
	
    // Array List class {VechileList()}.. used to instantiate a new ArrayList of object type Vechicle.
	public VechicleList (){
	
		collection = new ArrayList<Vechicle>(); // #(I.b)
	}
	
	
	
	//#(I.d)
	// Method add( takes Object v) as parameter in
	public  void add( Vechicle v){

		
		// if the no of elements in the VechicleList(collection.size()) is less that this.count(restricted int 6)
	    if (collection.size() < this.count ) { 
	    	// vec is added to arraylist using single method invocation .add(Object);
	                collection.add(v);
	                // message printed
	                System.out.print("[Vechicle Added to List]");
	            } else{ this.count =( this.count + 5); 
	            collection.add(v);}
	            // or else test is false(collection size more than 6) add 5 to count restrictor.)
	            // add vechicle anyway.... could be removed to limit input to set size only with no expansion
	 
	}
	
	//#(I.e)
	public boolean isEmpty(){
	 
		// print query message
		System.out.println("Is List Empty?");
		// if the size of array is equal to 0, return true and print msg
		if ( collection.size() == 0){
		
		System.out.println("/n[The Vechicle List  is empty]\n");
	    return true;
	}else{
		return false;
	}// if list is not zero false is returned.
		
	}// end isEmpty method
	
	
	//#(I.f)
	public boolean isFull(){
		
		
   	// if the no of elements in the list is the same as the int value fro restricting the size of the list
    if (  collection.size() == this.count){
    	// print msg and return true
    	System.out.println("\n[The current capacity for vechicles is set to["+count+"]\nThe List contains ["+collection.size() +"] vechicles]");
        return true;
    }else{
    	return false;
    }// else return false
    
	}
	
	//#(I.g) the method takes one parameter as an input i which is of type int.
	public void remove(int i){
	// i is used to select the location of the element in the list to be removed
	// if the value of i is more than the no of elements in the list, the location i is outside the list so throe is used to print error	
	try{
		if ( i > collection.size()){
		// throws new execption and error msg with no os elements in list and number inserted by user
		throw new IllegalStateException("\n[There is only: [" + collection.size()+ "] Vechicles in the List\nYou chose vechicle no: "+i+"]"); 
			  	    
	}	}catch (InputMismatchException e ){
		 // try block  used to catch  and handle user input exception
	     System.err.println("Input Missmatch Exception\nLoad Capacity must be a int value:\n" + e.getMessage()); 
        }
	System.out.println("\n[The following Vechicle was chosen and will be removed]\n\n"+ collection.get(i).toString());
	collection.remove(i);

	//System.out.println("\nThe following Vechicle has been put in its place\n\n"+ collection.get(i).toString());
	
	}
	
	//#(I.h) method takes one parameter of type int, i is used to get element at i(location in list)
	public String getVechicle(int i){

    // test if i is more than the no of elements in the list throws execption 		
	if ( i > collection.size()){
	  throw new IllegalStateException("\nThere is only: " + collection.size()+ " Vechicles in the List\nYou chose vechicle no: "+i); 
    } else{return collection.get(i).toString(); }
	// else return the element located at i using .get(i).toString() to print Vechicle details
	}
	
	//#(I.i)
	public  double getTotal(){

	//System.out.println(collection.get(i).getCostOfHire());
	
	//System.out.println(collection.get(i).getCostOfHire());
	//return this.total;
    // create a new Arraylist() class of type Double and call it sum
	ArrayList <Double> sum = new ArrayList<Double>();
	
	// for ( initilise int i to zero; as long as i is less than total no of elements in the list continue for loop
	// ; increment i each time plus 1
	for( int i = 0; i < collection.size(); i++){
		// Store String returned from ({collection}VechicleList.{get(i)} element location in list from 0 up to last element in list.(call method for this element(object/car/Truck) in the list)
		String Found = (collection.get(i).getCostOfHire());
		// cast the value stored in the String Found to Double and add it to the location i in new ArrayList sum)
		sum.add(i,Double.valueOf(Found));
		   
		}
		 // testing selecting elementsSystem.out.println(sum.get(1));
	    // for each element (d )of type Double in the ArrayList sum
		for(Double d : sum){
			// add them to this.total
		    this.total += d;}
		// return the resulting sum of all elements in the list.
		return this.total;
		

	
	}
	

	

	
	
	}	
	


