package com.constructor;

public class Purchasing {
	public  Purchasing() {
		System.out.println("Bike Purchasing");
	}
	public Purchasing(String a) {
		this();
		System.out.println("Bike name:" +a);
			}
    public Purchasing(int b) {
    	this("Royal");
    	System.out.println("Bike model:" +b);
    }
        public Purchasing(char c, float d) {
    this(35);
        	System.out.println("Bike grade:" +c +" , "+"Bike version :" +d);
    }
    public Purchasing(double e) {
     this('D',5.0f);
    	System.out.println("Bike price:" +e);   
    }
    public Purchasing(String f,String g) {
    this(250000.0);
    	System.out.println("Bike colour:" +f);
        System.out.println("Bike branch:" +g);    
    }
    public static void main(String[] args) throws Throwable {
    	Purchasing z = new Purchasing();
    	Purchasing x = new Purchasing(35);
    	Purchasing y = new Purchasing("royal");
    	Purchasing t = new Purchasing('D', 5.0F);
    	Purchasing u = new Purchasing(250000);
    	Purchasing O = new Purchasing("BLUE", "PORUR");
    z.finalize();
    x.finalize();
    y.finalize();
    t.finalize();
    u.finalize();
   O.finalize();
    }
    
}


