package com.diegosoft.program;

import java.util.Scanner;

public class Comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	Scanner input = new Scanner(System.in);
      
      System.out.print("enter first integer: ");
      int number1 = input.nextInt();
      
      System.out.print("enter second integer: ");
      int number2 = input.nextInt();
      
      if (number1 == number2) {
    	  System.out.printf("%d == %d%n", number1, number2);
	  }
      
      if (number1 != number2) {
    	  System.out.printf("%d != %d%n", number1, number2);
      }
      
      if (number1 < number2) {
    	  System.out.printf("%d < %d%n" , number1, number2);
      }
      
      if (number1 > number2) {
    	  System.out.printf("%d > %d%n", number1, number2);
      }
    	  
	}

}
