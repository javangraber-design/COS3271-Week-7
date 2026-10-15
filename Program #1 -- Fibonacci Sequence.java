//Programmer: Javan Graber
//Date: 10/13/26

package javanproject;

import java.util.Scanner;

public class MyProject {   
    static Scanner userinput = new Scanner(System.in); 
    public static void main(String[] args) {
    	
    	//Get the extent of the Fibonacci sequence from the user
    	System.out.print("Please enter how many numbers you want to see of the Fibonacci sequence: ");
    	int numbers = userinput.nextInt();
    	userinput.nextLine();
    	
    	//Because the Fibonacci sequence always must start with 0 and 1, initialize the first two values of the sequence with 0 and 1
    	int [] fibSequence = new int[numbers];
    	fibSequence [0] = 0;
    	fibSequence [1] = 1;
    	
    	//Create the variables that will stand for the previous two numbers in the sequence
    	int behindNum1 = fibSequence [0];
    	int behindNum2 = fibSequence [1];
    	
    	for (int i = 2; i < numbers; i++) {
    		
    		//Add the previous two numbers to create the new number in the sequence
    		fibSequence[i] = behindNum1 + behindNum2;
    		
    		//Adjust the previous numbers one place over to find the next number in the sequence
    		behindNum1 = behindNum2;
    		behindNum2 = fibSequence[i];
    	}
    	
    	//Display the Fibonacci sequence
    	System.out.println("Here is the Fibonacci sequence:");
    	for (int i = 0; i < numbers; i++)
    		System.out.print(" " + fibSequence[i]);
  
    		
    	}
    	
    }
