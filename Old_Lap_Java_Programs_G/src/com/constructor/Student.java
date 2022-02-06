package com.constructor;

public class Student {
public Student() {
	System.out.println("D.G. VAISHNAV COLLEGE ");
}
public Student(String a) {
   
	System.out.println("Student name  :"+a);
}
public Student(char c) {

	System.out.println("Student initial :"+" "+c);
}

public Student(int d,int e,int f ) {
	
System.out.println("Date of birth  :"+d +":"+e +":"+f);	
}
public Student(String g,long h) {

	System.out.println("Email Id :"+" "+g);
System.out.println("Mobilew number  :" +" "+h);
}
public Student(int b) {
	System.out.println("Roll Number  :"+b);	
}

public static void main(String[] args) throws Throwable {
Student m =new Student(123654);
m.finalize();

	
}

}
