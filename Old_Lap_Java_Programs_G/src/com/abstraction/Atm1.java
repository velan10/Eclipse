package com.abstraction;

public class Atm1 extends Bank1 {

	@Override
	public void pin() {
System.out.println("pin num is : 124563");		
	}
	public static void main(String[] args) {
		Atm1  k = new Atm1();
		
		k.ifsc(122222);
	    k.pin();
        k.branch(null);
	}

}
