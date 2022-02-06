package com.apartment;

public class Friend {
	public void velan() {
		System.out.println("apartment");
	}
	public void velan(int a) {
		System.out.println("apartment bl" +a);
		
	}
	public void velan(float h) {
		System.out.println("apartment decimal" +h);
	}
	public void velan(double j) {
		System.out.println("apartment double" +j);
	}public void velan(String b) {
    	System.out.println("apartment name:" +b);
    			
	}
    public void velan(long c) {
    	System.out.println("apartment value:" +c);
		
	}
    public void velan(int d, int e) {
    	System.out.println("apartment floor:" +d +","+ "apartment block:" +e);
		
	}
    public void velan(String f, char g) {
    	System.out.println("apartment name:" +f + ","+ "apartment block:" +g);
		
	}
    public void velan(byte k) {
		System.out.println("apartment hjk" +k);
    }
    public static void main(String[] args) {
		Friend q = new Friend();
		q.velan();
		q.velan("VELAN");
		q.velan(25, 5);
		q.velan("velan", 'a');
		q.velan(12.00f);
q.velan(125.00);		
q.velan(12);
q.velan(1234561);
q.velan(5);
q.velan(23);

    }
}
