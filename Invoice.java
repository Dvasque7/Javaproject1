// Invoice class that a hardware store might use to represent 
// an invoice for an item sold at the store

package com.diegosoft.program;

public class Invoice {
	private String partNumber; //instance variable
	private String description; //instance variable
	private int quantity; //instance variable
	private double price; //instance variable
	
	// Invoice constructor
	public Invoice(String partNumber, String description, int quantity, double price) {
		
		this.partNumber = partNumber;  //assign partNumber to instance variable partNumber
		this.description = description; //assign description to instance variable description
	}
	
    
	// Method setters and getters
	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) { //validate quantity is greater than 0.0, if not set default value to 0.0
		if(quantity > 0) {
		this.quantity = quantity;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) { //validate price is greater than 0.0, if not set default value to 0.0
		if (price > 0.0) {
		this.price = price;
		}
	}
		
	public double getInvoiceAmount() {
		return quantity * price;
	}	
}
