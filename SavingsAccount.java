package com.diegosoft.program;

public class SavingsAccount {
    
	//create static variable
	private static double annualInterestRate = 0.0;
	
	//create private instance variable
    private double savingsBalance = 0.0;
    
    //set constructor
    public SavingsAccount(double savingsBalance) {
    	this.savingsBalance = savingsBalance;
    }
    
    //calculate monthly interest
    public double calculateMonthlyInterest() {
    	savingsBalance += (savingsBalance * annualInterestRate) /12;
    	return savingsBalance;
    }
    
    //create static method to set new interest rate value 
    public static void modifyInterestRate(double newAnnualInterestRate) {
    	annualInterestRate = newAnnualInterestRate;
    }
}
