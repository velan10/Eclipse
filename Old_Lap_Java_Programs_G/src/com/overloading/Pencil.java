package com.overloading;      // class 4

public class Pencil {               // in the class, methods name same but arguments are diff

	public void absara() {      // non parameterized
		System.out.println("best pencil");
		}
	public void absara(float a) {    // datatype
		System.out.println("pencil inch is :" +a);   // concatenation
		
	}
	public void absara(String b) {
		System.out.println("pencil color is : " +b);
	
	}
	public void absara(int c, int d) {    // datatype count
		System.out.println("pencil count is : " +c +" " +d);
	
	}
	public void absara(char e, int f) {    // data type order
		System.out.println("pencil grade is : " +e);
		System.out.println("pencil length is : " +f);
	
	
	}
    public static void main(String[] args) {
    	Pencil p = new Pencil();
    	p.absara();
    	p.absara(1.4f);
    	p.absara("black");
    	p.absara('A', 2);
    	p.absara(34, 45);
	
}
	
	
	}
