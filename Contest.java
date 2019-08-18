package com.diegosoft.program;
// Determines a winner of a sales contest

import java.util.Scanner;  //class uses class Scanner

public class Contest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);  //create Scanner to obtain input from user
        
        //initialize variables
        int number = 0;
        int largest = 0;
        int personCounter = 1;
        
        //process 10 sales sold units
        while (personCounter <= 10) {  //loop 10 times
        	System.out.print("Enter number of sold units: ");
        	int unit = input.nextInt(); //input sold unit
        	if (unit>=0) {  //conditional to make sure program doesn't count negative integers
        		number = unit;
        		if (number>largest) {  //assign the biggest number to largest
        			largest = number;
        		}	
        	}
            personCounter += 1;	//add one to the counter
        }
    //Display the largest amount
    System.out.printf("%nThe sales person who win the contest sold %d units", largest);    
    input.close();    
	}
}
