package com.looping1;

public class Stataements3 {                  // break, continue loop
	
	public static void main(String[] args) {
		
		for (int i=1; i<=10; i++) {
			
			if (i==7) {
				//break; // break statement
				
				continue;    // continue statement
			}
			
			System.out.println(i);
		}
	}

}
