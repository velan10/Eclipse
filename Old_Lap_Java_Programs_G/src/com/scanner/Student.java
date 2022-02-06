package com.scanner;        // class 8

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);   // scanner syntax
		// refname s-denotes is variable
		
		System.out.println("enter your name:");
		
		String c = s.nextLine();  
		String a = s.nextLine();   
		// s.nextline() first // second- ctrl+2- assign local variable 
		String b = s.nextLine();
		
		System.out.println("enter your age:");
		
		int age = s.nextInt();
		int m = s.nextInt();
		int n = s.nextInt();
		
		System.out.println("enter your marks");
		
		float marks= s.nextFloat();
		float l = s.nextFloat();
		float k = s.nextFloat();
		
		
	}
}
