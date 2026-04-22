package com.keerthi.orangehrm.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.keerthi.orangehrm.driver.DriverManager;

public class EditEmployeePage {

	protected WebDriver driver;
	protected WebDriverWait wait;

	public EditEmployeePage(DriverManager driverManager) {

		this.driver = driverManager.getDriver();
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	private By btn_edit = By.xpath("//i[@class='oxd-icon bi-pencil-fill']");
	private By txt_drivingLicense = By.xpath("//label[text()=\"Driver's License Number\"]/following::input[contains(@class,'oxd-input oxd-input--active')][1]");
	private By dropDown_maritalStatus = By.xpath(
			"//label[text()='Marital Status']/following::div[contains(@class,'oxd-select-text-input')][1]");
	private By radioBtn_gender = By.xpath("//label[normalize-space()='Female']");
	private By save_btn = By.xpath("//p[normalize-space()=\"* Required\"]/following::button[@type=\"submit\"][1]");
			
			
	public void clickEdit() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(btn_edit));
		driver.findElement(btn_edit).click();
	}

	public void enterDrivingLicense(String drivingLicense) {

		wait.until(ExpectedConditions.visibilityOfElementLocated(txt_drivingLicense));
		driver.findElement(txt_drivingLicense).sendKeys(drivingLicense);
	}

	public void selectMaritalStatus(String maritalStatus) {
	
		 wait.until(ExpectedConditions.elementToBeClickable(dropDown_maritalStatus)).click();
		 driver.findElement(dropDown_maritalStatus).click();	
		 
	}
	
	public void selectGender(String gender) {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(radioBtn_gender));
		wait.until(ExpectedConditions.elementToBeClickable(radioBtn_gender)).click();
	}
	
	public void clickSave() {
		
		driver.findElement(save_btn).click();
	}
	
}
