package com.Maven_Projects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pojo_Class {

	@FindBy(xpath = "//a[@class='login']")
	private WebElement Sigin;

	public WebElement getSigin() {
		return Sigin;
	}
	
}
