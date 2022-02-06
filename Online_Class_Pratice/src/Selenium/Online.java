package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Online {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com/");
	driver.get("http://testleaf.herokuapp.com/pages/Button.html");
	WebElement position = driver.findElement(By.id("position"));
	 Point location = position.getLocation();
	 int x = location.getX();
	 int y = location.getY();
	 System.out.println("The X value is =" +x +"The y value is ="+y);
	 
	}
}
