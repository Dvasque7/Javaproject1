package com.diegosoft.program;
import java.io.IOException;

public class UsingException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
    	throw new ExceptionA();
     }
     catch (Exception exception) {
    	System.out.println(exception.toString());
     }
     try {
    	 throw new ExceptionB();
     }
     catch (Exception exception) {
    	 System.out.println(exception.toString());
     }
     try {
    	 throw new NullPointerException();
     }
     catch (Exception exception){
    	 System.out.println(exception.toString());
     }
     try {
    	 throw new IOException();
     }
     catch (Exception exception) {
    	 System.out.println(exception.toString());
     }
   }  
}

class ExceptionA extends Exception {
	
     }

class ExceptionB extends ExceptionA {
	
      }

