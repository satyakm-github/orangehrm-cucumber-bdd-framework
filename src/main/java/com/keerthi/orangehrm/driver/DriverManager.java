package com.keerthi.orangehrm.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
	
	private WebDriver driver;

	
	public WebDriver getDriver() {
		if(driver == null) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}
	
	public void quitDriver() {
		
		if(driver!= null) {
			driver.quit();
			driver = null;
		}
	}

}
