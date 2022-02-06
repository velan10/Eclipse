package com.string;

public class String_Types1 {
	
	public static void main(String[] args) {
	
	//String s = "Welcome to java";
	//System.out.println(s);
	//System.out.println(System.identityHashCode(s));
	
	//String s1 = "Welcome to java";
	//System.out.println(s1);
	//System.out.println(System.identityHashCode(s1));
	
	
	StringBuffer s1= new StringBuffer("Testing");
	System.out.println(s1);
	System.out.println(System.identityHashCode(s1));
	
	StringBuffer s2 = new StringBuffer("Testing");
	System.out.println(s2);
	System.out.println(System.identityHashCode(s2));
	
	s1 = s1.append(s2);   // sysout
	System.out.println(s1);
	System.out.println(System.identityHashCode(s2));
	
	}
}
