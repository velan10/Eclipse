package com.looping;

public class Alpha {
	
	public static void main(String[] args) {
		
		for (int i=1; i<=10; i++) {     //  nested for loop
			
			for (int j=1; j<=i; j++) {     
			
			
			System.out.print(j +" ");     // 1 2 3 (j) // 1 1 1 (i)
			
			// println ---- print
		}
		System.out.println();
		
	}

	}                   
}


//  first= to print i ( i +" ")
// second=  to print j (j + " ")
// third -  to put j<=i to print 