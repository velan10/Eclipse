package com.abstraction;

public class Constructor {

	public Constructor() {
System.out.println("Default Constructor");
	}
	
	public Constructor(int id) {
		System.out.println("The int : 100");
			}
	public Constructor(String name) {
		System.out.println(" The name is : VELAN");
			}
	public void constructor(String name2) {
		System.out.println("The void Constructor is : "+name2);
	}
		public static void main(String[] args) {
			
			Constructor cc = new Constructor("VELAN");
			cc.constructor("VICkY");
		}	
			
}
