//Programmer: Javan Graber
//Date: 10/13/26

package javanproject;

import java.util.Arrays;
import java.util.Scanner;

public class MyProject {   
    static Scanner userinput = new Scanner(System.in); 
    public static void main(String[] args) {
    	
    	//Ask for the number of numbers 
    	System.out.print("How many numbers do you want to give (up to 20)? ");
    	int numbers = userinput.nextInt();
    	
    	//Initialize the sequence with the required memory
    	int arraySequence [];
    	arraySequence = new int [numbers];
    	
    	//Initialize the cont variable as false (or 0)
    	int cont = 0;
    	
    	//Ask for the numbers
    	System.out.println("Please enter the numbers (as integers) that you want in the array below: ");
    	System.out.println();
    	
    	//Use a loop to iterate however many times the user asked for
    	for (int i = 0; i < numbers; i++) {
    		System.out.println("Number #" + (i + 1));
	    	arraySequence [i] = userinput.nextInt();
	        userinput.nextLine(); 	

    	}
    	
    	System.out.println("Here is the current array: " + Arrays.toString(arraySequence));
    	System.out.println();
    	
    	//Immediately start the loop, but at the end ensure that the value is tested
    	do{
    		//Display the current array and get the number that should be changed with its replacement
    		System.out.print("(Making sure) Would you like to edit any of the numbers? (1 for yes or 0 for no) --> ");
        	int edit = userinput.nextInt();
        	userinput.nextLine();
        	if (edit == 1) {
	    		System.out.println("Here is the current array: " + Arrays.toString(arraySequence));
	    		
	    		System.out.print("Enter the number to change: ");
	    		int changeNum = userinput.nextInt();
	    		
	    		System.out.print("Enter the new number: ");
	    		int newNum = userinput.nextInt();
	    		
	    		
	    		//Find the original number's place and replace it
	    		int placement = Arrays.binarySearch(arraySequence, changeNum);
	    		System.out.println(placement);
	    		arraySequence [placement] = newNum;
	    		
	    		//Display the array and ask if they want to go again
	    		System.out.println("Here is the current array: " + Arrays.toString(arraySequence));
	    		
	    		System.out.print("Again? (1 or 0) --> ");
	        	cont = userinput.nextInt();
        	}
    	} while (cont == 1);
    	
    	//Finally, sort it and display it
    	System.out.println("Here is the final sequence sorted from smallest to largest: " + Arrays.toString(arraySequence));
    	Arrays.sort(arraySequence, 0, numbers);
    	
    	System.out.println("Here is the final sequence sorted from smallest to largest: " + Arrays.toString(arraySequence));
    	}
    	
    }
