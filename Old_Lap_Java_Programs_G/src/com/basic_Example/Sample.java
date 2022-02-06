package com.basic_Example;
                                              // class 2
public class Sample {
	
	private void biriyani() {
		
		System.out.println("chicken biriyani");
		System.out.println("mutton briyani");
		System.out.println("prawn briyani");
	}
	private void gravy() {
		
		System.out.println("egg gravy");
		System.out.println("panner gravy");
		System.out.println("mutton gravy");
		}
	
	private void parotta() {
		
		System.out.println("salna");	
	}
	
	public static void main(String[] args) {
		// classname refname = new classname();
		
		Sample b = new Sample();        // new----keyword
				b.biriyani();
		        b.gravy();
		        b.parotta();
	}

}
