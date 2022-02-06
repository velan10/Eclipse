package com.testng;

import org.testng.annotations.Test;

public class TestNg_Dependencys {
@Test
	private void bikeKey() {
System.out.println("First put the key on bike");
	}
@Test(dependsOnMethods = "bikeKey")
private void turnONBike() {
System.out.println("Turn On The bike");
}
@Test(dependsOnMethods = "turnONBike",enabled = true)
private void startTheBike() {
System.out.println("Pres the Self Start Button");
}
@Test(dependsOnMethods = "startTheBike")
private void Accelerate() {
System.out.println("Screw thw Assye cable");
}



}

