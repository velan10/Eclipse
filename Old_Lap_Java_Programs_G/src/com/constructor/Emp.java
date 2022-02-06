package com.constructor;         // class 9

public class Emp {          // support overloading
	
	public Emp() {   // default constructor or non parameterized
		System.out.println("default constructor");	
	}
public Emp(String a) {
	this();    // this---keyword it denotes current class
	System.out.println("Employee name is :"+a);
}
public Emp(int b) {
	this("ganesh");
	System.out.println("age is :"+b);
}
public Emp(char c,double d) {
	this(26);
	System.out.println("gender is :"+c +"," +"salary is :"+d);
}
public static void main(String[] args)throws Throwable{
	Emp e = new Emp();
	
   Emp f = new Emp("ganesh");
    Emp g = new Emp(26);                       //  waste memory create pannum
	Emp h = new Emp('M',2500);
	
e.finalize();
f.finalize();
g.finalize();    // finalize---- it clears memory space
 }
}