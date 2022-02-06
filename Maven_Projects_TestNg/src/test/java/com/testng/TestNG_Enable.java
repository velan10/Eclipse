package com.testng;

import org.testng.annotations.Test;

public class TestNG_Enable {
	@Test(priority = 1)
	private void tv() {
System.out.println("Searching TV");
	}
	@Test(priority = 2,enabled = true)
	//enabled vandhu bhoolean methos 
	// enable ooda default is = true
	//if we give false the method is not run in testNg
	// id=f we give true is run in testNg method 
	private void brandTvSelection() {
System.out.println("Tv Brand");
	}
	@Test(priority = 3)
	private void selecttv() {
System.out.println("Tv is selectd");
	}
	@Test(priority = 4)
	private void priceOfTv() {
System.out.println("Tv Price ");
	}
	@Test(priority = 5)
	private void tvPu() {
System.out.println("Tv is Purchased");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
