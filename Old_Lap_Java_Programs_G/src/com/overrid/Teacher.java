package com.overrid;

public class Teacher extends Student {
@Override
	public void percentage(float c) {
	System.out.println("podaaa");
		super.percentage(c);
	}
@Override
	public void mark1(int a) {
	super.mark1(a);
	System.out.println("eavan fail");
	super.mark1(a);	
	}
@Override
public void subject1(String b) {
	System.out.println("subject name is: ");
	super.subject1(b);
}
public static void main(String[] args) {
	Teacher s = new Teacher();
	s.percentage(52.00f);
	s.mark1(90);
	s.subject1("science");
}
}
