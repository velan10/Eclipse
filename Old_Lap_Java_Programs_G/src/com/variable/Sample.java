package com.variable;

public class Sample {
	
	//static int d;  // static  variable -default value 0 printed
	
    static int b = 40;
	
	int c = 30;      //  default value printed -- class variable
	//int c;       //  class variable 
	
	
	public static void main(String[] args) {
		
		int a = 20;  
		int e =35;
		//  local variable
		System.out.println(a);
		// Sample s = new Sample();
		System.out.println(b);
		System.out.println(e);
	}

}
