package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestNG_Browser {

//	@Test
//	private void opengoogle() {
//long millis = System.currentTimeMillis();
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Admin\\eclipse-workspace\\MavenProject\\Driver\\chromedriver.exe");
//		ChromeOptions ve = new ChromeOptions();
//		ve.addArguments("incognito");
//		WebDriver driver = new ChromeDriver(ve);
//		driver.manage().window().maximize();
//driver.get("https://www.amazon.in/");	
//driver.quit();
//long endtime = System.currentTimeMillis();
//long totaltime = endtime-millis;
//System.out.println(totaltime);
//	}
	
	@Test
	private void openamazon() {
long millis = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\MavenProject\\Driver\\chromedriver.exe");
		ChromeOptions ve = new ChromeOptions();
		ve.addArguments("incognito");
		WebDriver driver = new ChromeDriver(ve);
		driver.manage().window().maximize();
driver.get("https://www.amazon.in/");	
	}
	
	@Test
	private void openflipkart() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\MavenProject\\Driver\\chromedriver.exe");
		ChromeOptions ve = new ChromeOptions();
		ve.addArguments("incognito");
		WebDriver driver = new ChromeDriver(ve);
		driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");	
	}

}
