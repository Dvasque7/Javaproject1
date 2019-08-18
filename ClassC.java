package com.diegosoft.program;

public class ClassC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] bestScores = {100, 99, 98, 97, 90};
      
      System.out.printf("%s%10s%n", "Index", "Value");
      
      for (int counter=0; counter < bestScores.length; counter++) {
    	  System.out.printf("%d%13d%n", counter, bestScores[counter]);
      }
      
	}

}
