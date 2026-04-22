package com.keerthi.orangehrm.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.keerthi.orangehrm.driver.DriverManager;

public class PersonalDetailsPage {

	protected WebDriver driver;
	protected WebDriverWait wait;

	private By txt_personalDetails = By.xpath("//h6[text()='Personal Details']");
	
	public PersonalDetailsPage(DriverManager driverManager) {
		this.driver = driverManager.getDriver();
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

	public boolean isUserInPersonalDetails() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(txt_personalDetails));
		driver.findElement(txt_personalDetails).isDisplayed();
		return driver.findElement(txt_personalDetails).isDisplayed();

	}

}
