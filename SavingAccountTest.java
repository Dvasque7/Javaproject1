package com.diegosoft.program;

import java.text.NumberFormat;

public class SavingAccountTest {

	//Format the double into a currency friendly string
    private static NumberFormat formatter = NumberFormat.getCurrencyInstance();
	
	public static void main(String[] args) {

		//set annual interest rate 4%
		SavingsAccount.modifyInterestRate(0.04);
		
		//create two account objects and set new balance
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		
		//calculate monthly balance with monthly interest rate and print out first year (12 months)
		for (int month = 1; month <=12; month++) {

			System.out.println("The balance for month " + month + " for account saver1 = " + formatter.format(saver1.calculateMonthlyInterest()));
			System.out.println("The balance for month " + month + " for account saver2 = " + formatter.format(saver2.calculateMonthlyInterest()));
		}
		
		//set new annual interest rate 5%
		SavingsAccount.modifyInterestRate(0.05);
		
		//calculate monthly balance with monthly interest rate and print out 13 month
		System.out.println("The balance for month 13 for account saver1 = " + formatter.format(saver1.calculateMonthlyInterest()));
		System.out.println("The balance for month 13 for account saver2 = " + formatter.format(saver2.calculateMonthlyInterest()));
	} 
	
}
