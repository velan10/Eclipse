package com.basic_Example;  //  access specifier class 2

public class Clothes {

	private void cotton() {    // private inside the class
		
		System.out.println("cotton shirt");
	}
	
	private void linen( ) {     // private inside the class 
		// you can create more private inside the class only
		
		
		System.out.println("linen shirt");
	}
	
	public static void main(String[] args) {   // main method
		
		// ClassName refName =  new ClassName();    // object
		
		Clothes c = new Clothes();       // new - keyword
		
		c.cotton();
		c.linen();
	}
}

