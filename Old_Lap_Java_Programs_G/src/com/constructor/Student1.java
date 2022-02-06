package com.constructor;

public class Student1 {
	public Student1() {
		System.out.println("D.G. VAISHNAV COLLEGE ");
	}
	public Student1(String a) {
	   
		System.out.println("Student name    :"+a);
	}
	public Student1(char c) {
		System.out.println("Student initial :"+" "+c);
	}

	public Student1(int d,int e,int f ) 
	{
	System.out.println("Date of birth   :"+d +":"+e +":"+f);	
	}
	public Student1(String g,long h) {
		System.out.println("Email Id        :"+" "+g);
	System.out.println("Mobilew number  :" +" "+h);
	}
	public Student1(int b) {
		System.out.println("Roll Number     :"+b);	
	}

	public static void main(String[] args) throws Throwable {
	Student1 a1 = new Student1();
	a1.finalize();
	Student1 b1 = new Student1("Vellivelan");
	b1.finalize();
	Student1 c1 = new Student1('A');
	c1.finalize();
	Student1 d1 = new Student1(10,03,1995);
	d1.finalize();
	Student1 e1 = new Student1("velan@gmail.com",984050970);
	e1.finalize();
	Student1 f1 = new Student1(124563);
	f1.finalize();	
	}

	}


