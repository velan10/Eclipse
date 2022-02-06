package com.abstraction;

public class Customer_Details extends Bank_Details {

	@Override
	public void atmpin() {
		System.out.println("1236");
	}

	@Override
	public void bankname() {
		System.out.println("Kotak Mahindra Bank");
	}

	public static void main(String[] args) {

		Bank_Details c = new Customer_Details();
		c.name();
		c.bankname();
		c.atmpin();
	}

	@Override
	public void name() {
System.out.println("Anbazhagan");		
	}

}
