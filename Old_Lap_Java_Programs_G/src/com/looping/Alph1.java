package com.looping;

public class Alph1 {
	
public static void main(String[] args) {
		
		for (int i=3; i>=1; i--) {     //  nested for loop
			
			for (int j=1; j<=i; j++) {     
			
			//System.out.print("*" +" ");     // 1 2 3 (j) // 1 1 1 (i)
			System.out.print(j +" ");
			}
		System.out.println();
		}
	}

}


