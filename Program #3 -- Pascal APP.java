//Programmer: Javan Graber
//Date: 10/13/26

package javanproject;

import java.util.Scanner;

public class MyProject {   
    static Scanner userinput = new Scanner(System.in); 
    public static void main(String[] args) {
    	
    	//Initialize the sequence with the required memory
    	int [][] triangle = new int [11] [11];
    	int size = triangle.length;
    	
    	//Create the loop that makes the triangle and its letters based on specific conditions
    	for (int i = 0; i < size; i++) {
    		for (int j = 0; j < size; j++) {
    			//Make sure that if the letter is in the top row and not at the beginning,
    			//Display a zero
    			if ((i == 0) && (j != 0)){
    				System.out.print("0" + " ");
    			}
    			
    			//Make sure that if the number is at far left, it is a 1
    			if (j == 0) {
    				triangle [i][j] = 1;
    				System.out.format(" " + triangle[i][j] + " ");
    			}
    			
    			//If it is not on the edge and not in the first row, perform the calculation
    			if ((j > 0) && (i > 0)) {
    				
    				//Make this space the sum of the number above and the number above and to the left
    				triangle [i][j] = triangle [i-1][j] + triangle [i-1][j-1];
    				System.out.print(triangle [i][j] + " ");
    			}
    			
    		}
    		System.out.println();
    	}
    	
    	}
    	
    }
