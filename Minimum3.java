//This program finds the minimum value of three floating numbers
package com.diegosoft.program;

import java.util.Scanner;


public class Minimum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input = new Scanner(System.in);  //Create scanner for input from console
       
       System.out.printf("Enter three floating point numbers: %n");
       double number1 = input.nextDouble();  //Read first double
       double number2 = input.nextDouble();  //Read second double
       double number3 = input.nextDouble();  //Read third double
       
       double result = minimum(number1, number2, number3);  //determine minimum value
       
       System.out.println("Minimum number is " + result);  //display minimum value
       
       input.close();
	}
       
    public static double minimum(double x, double y, double z) {  //returns minimum of its three double parameters 
    	   return Math.min(x, Math.min(y, z));
       }
}

