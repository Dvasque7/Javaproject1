//Odd or even program
//Determines whether a number is odd or even

package com.diegosoft.program;
import java.util.Scanner; //program uses Scanner

public class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input = new Scanner(System.in);
       
       System.out.print("Enter number: ");  //prompt for input
       int number = input.nextInt();  // read integer
       
       if (number % 2 == 0) {
    	   System.out.print("Number is even");
       }
       
       if (number % 2 != 0) {
    	   System.out.print("Number is Odd");
       }
              
	}  //end method main

}  //end class OddorEven
