package com.diegosoft.program;

import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {

		//create Scanner to obtain input
		Scanner input = new Scanner(System.in);
		
		Invoice invoice1 = new Invoice("", "", 0, 0.0);
		
		System.out.print("Enter part number: ");
		String partNumber = input.nextLine();
		invoice1.setPartNumber(partNumber);
		
		System.out.print("Enter description: ");
		String description = input.nextLine();
		invoice1.setDescription(description);
		
		System.out.print("Enter quantity: ");
		int quantity = input.nextInt();
		invoice1.setQuantity(quantity);
		
		System.out.print("Enter price: ");
		double price = input.nextDouble();
		invoice1.setPrice(price);
		
		//display invoice information
		System.out.printf("Part %s | %s | Quantity: %d | Unit Price:$%.2f%n", invoice1.getPartNumber(),
				invoice1.getDescription(), invoice1.getQuantity(), invoice1.getPrice());
		
		System.out.printf("Total invoice is $%.2f%n", invoice1.getInvoiceAmount());
		
		input.close();
	}
}
