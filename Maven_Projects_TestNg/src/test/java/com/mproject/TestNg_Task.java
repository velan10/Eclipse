package com.mproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class TestNg_Task {
	WebDriver driver;
	@Test
	private void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Maven_Projects_TestNg\\Driver\\chromedriver.exe");	
		ChromeOptions ve = new ChromeOptions();
		ve.addArguments("incognito");
		driver = new ChromeDriver(ve);
		driver.manage().window().maximize();
	}
	
@Test(invocationCount = 3)
private void openfacebookpage() {
	driver.get("https://www.facebook.com/");

}
	@Test(dependsOnMethods = "openfacebookpage")
private void quitbrowser() {
		driver.quit();
	}
    }


