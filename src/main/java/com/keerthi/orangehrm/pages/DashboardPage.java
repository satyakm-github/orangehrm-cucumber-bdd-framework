package com.keerthi.orangehrm.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.keerthi.orangehrm.driver.DriverManager;

public class DashboardPage {

	protected WebDriver driver;
	protected WebDriverWait wait;

	private By txt_dashboard = By.xpath("//h6[text()='Dashboard']");


	public DashboardPage(DriverManager driverManager) {
		this.driver = driverManager.getDriver();
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

	public boolean validateDashboardViewIsDisplayed() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(txt_dashboard));
		return driver.findElement(txt_dashboard).isDisplayed();
	}
	
}
