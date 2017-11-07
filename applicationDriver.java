/**
 * * -------------
 *  LAB2 PART B
 *  -------------
 *  Assignment No: Assignment 2 
 *  Question: Lab 3, Question (B).
 *  Author:  O_RIAIN_M R00158067
 *  -------------------------------------
 * Part​ ​ b) You​ ​ are​ ​ also​ ​ required​ ​ to​ ​ write​ ​ the​ ​ code​ ​ for​ ​ the​ ​ application​ ​ class.​ ​ The​ ​ application​ ​ class​ ​ should
 * present​ ​ the​ ​ user​ ​ with​ ​ a ​ ​ console​ ​ interface​ ​ that​ ​ is​ ​ menu​ ​ driven.​ ​ The​ ​ menu​ ​ should​ ​ appear​ ​ as
 *  User is presented with a menu by printing the mainmenu(), int entered by user is returned from main menu method and used in switch statement to control
 *  what happens. exception handling is used to catch exceptions that I have generated from inputting the wrong choice or wrong type (not int) for menu selection
 *  The outer loop controls the main menu as long as the user doent enter 6 the loop will continue,
 *  The submenu uses the same proccess as the main menu, it displays sub menu for the user to select a vechicle type to add to the list, CAR or Truck,
 *  the returned int fro the method is passed to the switch statement and handled there as long as the user doesnt choose option 3 the loop will continue.
 *  if user chooses option 3 then the inner loop breaks, do while loop exits and the main menu loop will display.
 */



import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
//import number format to format number.
// input missmatch to handle exceptions
// Scanner to create new scanner (reader var)


// create class
public class applicationDriver {
	
// imported scanner, used in main
	static Scanner reader = new Scanner(System.in);

	/**
	 * @param args
	 */

	
	public static void main(String[] args) {

		// create a new Vechicle List called Vch from VechileList class.
		
    	VechicleList Vch = new VechicleList();
		
    	// add Vechicle type to superclass Vch. pass values to constructor.
	    Vch.add(new Car("Toyota","Corrolla","02D10894",5));
		Vch.add(new Truck("Scania","6x6","10D22234",5.3));
		Vch.add(new Truck("Mercedes-Benz","Actros","17KE10894",5.2));
		Vch.add(new Car("Toy","Corrolla","02KE10894",5));
		
		
	// try code to catch exceptions
    try{
    	// userChoice is assigned an int type
	 int userChoice;
	 //creates a reader; 
     Scanner reader = new Scanner(System.in);

     //*********************************************************/
     // do following until while statement is met, the loop continues until 6 is selected. outer loop exits
     do{
    	 
    	 
    	 
     // the userChoice is the int value returned from the menu() class.	 
     userChoice = menu();
  
     
     //switch statement is used on the int userChoice to control flow. 

     switch(userChoice){
     // in case 1 was selected
     case 1: 
    	 
    	 // while do loop, when 3 is selected the innerloop breaks and the outter loop continues.
    	 do{
    		 //user subMenu is displayed and the int entered is scanned by the reader var and returned to the UserChoice var
    	 userChoice = subMenu();
    	
    	 // switch tests the int value for match
    	 switch(userChoice){
    	 // is user selects int 1
    	 case 1:
    		 // user is asked for input and its stored in vars.
    		 System.out.print("\nNEW CAR:\nEnter make:");
    		 String make = reader.nextLine();
    		 
    		 System.out.print("Enter model:");
    		 String model = reader.nextLine();
    		 
    		 System.out.print("Enter regNumber:");
    		 String regNumber = reader.nextLine();
    		 
    		 //try is used to catch user input error
    		 try{
    			 
    		 System.out.print("Enter seating Capacity:");
    		 int n = reader.nextInt();
    		 
    		 // user input vars are passed as parrameters to create a new vechicle. Car
    		 Vch.add(new Car(make,model,regNumber,n));
    		 } 
    		 // the error is caugth and handled by the InputMismatchException stored as var e
    		 catch (InputMismatchException e ){
    			 // error message printed to user
    			     System.err.println("Input Missmatch Exception\nseating Capacity must be a integer value:\n" + e.getMessage()); 
    		 }

    		
    		   
    		 
    		//once finished  
    		 reader.nextLine();
    	
    		 
    		
            
    		 break;
    	 
    	 case 2: 
    		 // if user selects int 2.
    		 System.out.print("\n---------------------------\n\t[NEW TRUCK]\n---------------------------\nEnter make:");
    		 String tMake = reader.nextLine();
    		 
    		 System.out.print("Enter model:");
    		 String tModel = reader.nextLine();
    		 
    		 System.out.print("Enter regNumber:");
    		 String tRegNumber = reader.nextLine();
    		 
    		 System.out.print("Enter Load Capacity:");
    		 
    		 try{
    		 double tN = reader.nextDouble();
    		//once finished  
   		     reader.nextLine();
    		 // all vars containing user input is passed to the Vechile List.add ( new Vechicle type(arg, arg, arg,double)
             Vch.add(new Truck(tMake,tModel,tRegNumber,tN)); 
    	 	 } 
    		 // handles input missmatch exception and prints error msg
    		 catch (InputMismatchException e ){
			 
		     System.err.println("Input Missmatch Exception\nLoad Capacity must be a double value:\n" + e.getMessage()); 
	         }
    		 
    		 //break from loop
    		 break;
    		 
    	 case 3:
    		 // breaks out of loop and while do condition is met !=3, the innerloop breaks however outerloop continues(Main menu)
    		 System.out.println("Back to main menu");
             break;
             
             // default will display message for any other int value outside case 1 to case 3
         default :
        	 System.out.println("[Enter a valid selection no]");
        	 break;
    	 } }while ( userChoice != 3);
    	
    	 
    	 
    	 
    	 break;
     
     case 2:
     
    	 // displays text, amount of vechicles in Vechilce list by calling Vch.isFull method.
     System.out.println("\n[Remove a vecicle]");
     Vch.isFull();
     // prints prompt
     System.out.println("\nchoose the number of the vechicle you would like to remove:");
     
    // try following code
     try{
    	 // int type var = next int picked up by scanner.
     int vec = reader.nextInt();
     // int var value is passed as parameter to method to remove a vechicle from the list.
     Vch.remove(vec);
     
     
     }
     // picks up illegal statement exception passed to method
     catch (IllegalStateException e ){
		 // prints error msg
	     System.err.println("Illegal State Exception\nYou must select a valid int value for the vechicles location in the list:\n" + e.getMessage()); 
         }catch (IndexOutOfBoundsException e){
        	 System.err.println("Index out of bounds Exception\nYou must select a valid int value for the vechicles location in the list:\n" + e.getMessage()); 
         }
     break;
     
     
     case 3:
    	 
        System.out.println(Vch.isEmpty());
    	   
       //else{
    	   // or else if false(only true or false for boolean) print msg.
    	 //  System.out.print("[List Contains Vechicles]");
      // }
      
       
         break;
     case 4:
    	 
    	 // prints msg
    	 System.out.println("Is List Full?");
    	 // its an array list so i return the size of the array
    	 System.out.println(Vch.isFull());
    		 
    	 
    	    	
    	 break;
     case 5:
    	 // create new NumberFormat, get currency Instance 
    	 NumberFormat fmt = NumberFormat.getCurrencyInstance();
    	 // print msg
    	 System.out.println("Option5");
    	 // print message format the Vch.getTotal method.
    	 System.out.println("Total Cost: " + fmt.format(Vch.getTotal()));
         break;		    
     case 6:
    	 // print msg quit
    	 System.out.println("[You Choose Quit, Goodbye!!]");
    	 break;
     
     default:
    	 // if user entered a int ranged outside valid choice case 1 to case 6 default will 
    	 System.out.println("[Enter a valid selection no]");
    	 break;
     } }while ( userChoice != 6);
    // loop will continue until user enters an int value 6.
     
    }
    // catches input missmatch any input not of type int.
     catch (InputMismatchException e ){
		 
	     System.err.println("Input Missmatch Exception\nMenu selection must be an integer value:\n" + e.getMessage()); 
 }
// closes reader(Scanner )
     reader.close();
     
     
     
     }

     
     
// Displays Main menu to console and user input of next int is returned from method to be used in switch statement above Outter loop
	private static int menu() {

		// TODO Auto-generated method stub
		int selection;
	   // Scanner reader = new Scanner(System.in);

	    /***************************************************/
        String h1 = ("\n-------------------------\n");
	    String t1 = ("\t[MAIN MENU]\n");
	    String bp = ("\u2022 ");
	    String l1 = ("\n"+bp+" 1 - Add Vechicle\n"+bp+" 2 - Remove Vechicle\n"+bp+" 3 - Is List Empty\n"+bp+" 4 - Is List Full\n"+bp+" 5 - Cal Total Cost\n"+bp+" 6 - Quit\n");
	    String mainMenu = ( h1 + t1+h1+l1);
	    System.out.println(mainMenu);
	    selection = reader.nextInt();
	    
	 
	    return selection;    
	  
		}
	// Displays Main menu to console and user input of next int is returned from method to be used in switch statement above Inner Loop
	private static int subMenu() {

		// TODO Auto-generated method stub
		int selection;
	    
		//Scanner reader = new Scanner(System.in);

	    /***************************************************/
	    String h1 = ("\n-------------------------------\n");
	    String t1 = ("\t[ADD VECHICLE MENU]\n");
	    String bp = ("\n\u2022 ");
	    String l1 = ("\n" + bp +" 1 - Add Car\n" + bp+ " 2 - Add Truck\n"+bp+ " 3 - [MAIN MENU]\n");
	    String subMenu = ( h1 + t1+ h1+l1);
	    System.out.println(subMenu);
	    
	    selection = reader.nextInt();
	   
	    return selection;    
	    
	    
		}
	

	
	
	
}
