package com.abstraction;     // class 6

public abstract class Bank {    // class level     // abstract --- keyword
	
	public void accnum(int a) {
		System.out.println("acc num is : " +a);
	}
	
	public void branch(String b) {              
		System.out.println("branch is :"+b);
	}
	public abstract void pin();    // method level
	
	// we cant create an object for abstract class because there is no implementation part
	

}
