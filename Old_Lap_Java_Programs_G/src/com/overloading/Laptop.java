package com.overloading;

public class Laptop {
	
	public void lenovo() {
		System.out.println("best laptop");

	}
	public void lenovo(String a) {
		System.out.println("laptop color is:" +a);
		
	}
	public void lenovo(byte b) {
		System.out.println("laptop numbers is:" +b);
		
	}
	public void lenovo(int c) {
		System.out.println("laptop old rate is:" +c);
		
	}
	public void lenovo(float d) {
		System.out.println("laptop price is:" +d);
		
	}
	public void lenovo(String e, double g) {               // data tyoe order
		System.out.println("laptop model name is:" +e);
		System.out.println("laptop highest modelprice is:" +g);
		
	}
	public void lenovo(int h, int i) {
		System.out.println("laptop version is:" +h +" " +i);
	}
	public void lenovo(char j) {
		System.out.println("laptop character is:" +j);
	}
	public static void main(String[] args) {
		Laptop s = new Laptop();
		s.lenovo();
		s.lenovo("black");
		s.lenovo(118);
		s.lenovo(2344);
		s.lenovo("zebronics", 1224445);
		s.lenovo(20, 2012);
		s.lenovo('h');
		s.lenovo(1.35f);
	}

}
