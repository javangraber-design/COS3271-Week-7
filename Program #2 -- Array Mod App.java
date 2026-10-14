//Programmer: Javan Graber
//Date: 10/14/26

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
    	
    	//Use a loop to get each number
    	for (int i = 0; i < numbers; i++) {
    		System.out.println("Number #" + (i + 1));
	    	arraySequence [i] = userinput.nextInt();
	        userinput.nextLine(); 	
    	}
    	
    	//Display the current array
    	System.out.println("Here is the current array: " + Arrays.toString(arraySequence));
    	System.out.println();
    	
    	//Immediately start the loop, but at the end ensure that the value is tested
    	do{
    		//Ask the user if they want to edit the array
    		System.out.print("(Making sure) Would you like to edit any of the numbers? (1 for yes or 0 for no) --> ");
        	int edit = userinput.nextInt();
        	userinput.nextLine();
        	
        	System.out.println();
        	
        	if (edit == 1) {
        		//If they do want to edit, display the current array and get the number that should be changed and its replacement
	    		System.out.println("Here is the current array: " + Arrays.toString(arraySequence));
	    		System.out.println();
	    		
	    		System.out.print("Enter the number to change: ");
	    		int changeNum = userinput.nextInt();
	    		System.out.println();
	    		
	    		System.out.print("Enter the new number: ");
	    		int newNum = userinput.nextInt();
	    		System.out.println();
	    		
	    		//For clarity, contrast the initial sequence without any changes with the one that will follow
	    		System.out.println("Here is the initial sequence before any change: " + Arrays.toString(arraySequence));
	    		System.out.println();
	    		
	    		//Sort before the search to make sure the binary search has the right ascending order
	    		Arrays.sort(arraySequence, 0, numbers);
	    		
	    		//Find the original number's place and replace it
	    		int placement = Arrays.binarySearch(arraySequence, changeNum);
	    		arraySequence [placement] = newNum;
	    		
	    		//Display the array with the new number and in a sorted order, and ask if they want to go again
	    		Arrays.sort(arraySequence, 0, numbers);
	    		System.out.println("Here is the current array with " + changeNum + " swapped with " + newNum + " and sorted: " + Arrays.toString(arraySequence));
	    		System.out.println();
	    		
	    		System.out.print("Again? (1 or 0) --> ");
	        	cont = userinput.nextInt();
	        	System.out.println();
        	}
        //Test the condition
    	} while (cont == 1);
    	
    	//Finally, display the final sentence
    	System.out.println("Here is the final sequence: " + Arrays.toString(arraySequence));
    	}
    	
    }
