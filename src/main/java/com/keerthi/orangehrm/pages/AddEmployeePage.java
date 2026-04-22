package com.keerthi.orangehrm.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.keerthi.orangehrm.driver.DriverManager;

public class AddEmployeePage {

	protected WebDriver driver;
	protected WebDriverWait wait;

	public AddEmployeePage(DriverManager driverManager) {

		this.driver = driverManager.getDriver();
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	private By btn_add = By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]");
	private By txt_firstName = By.xpath("//input[@name='firstName']");
	private By txt_lastName = By.xpath("//input[@name='lastName']");
	//private By txt_employeeId = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	private By btn_save = By.xpath("//button[@type='submit']");
	
	private By txt_dashboard = By.xpath("//h6[text()='Dashboard']");
	private By txt_pimModule = By.xpath("//span[text()='PIM']");
	
	
	
	
	
	public void navigateToEmployeeList(String module) {

		wait.until(ExpectedConditions.visibilityOfElementLocated(txt_dashboard));
		driver.findElement(txt_pimModule).click();
	}
	
	public void clickAdd() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(btn_add));
		driver.findElement(btn_add).click();
	}

	public void enterFirstName(String firstName) {

		wait.until(ExpectedConditions.visibilityOfElementLocated(txt_firstName));
		driver.findElement(txt_firstName).sendKeys(firstName);
	}

	public void enterLastName(String lastName) {
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(txt_lastName));
		driver.findElement(txt_lastName).sendKeys(lastName);
	}
	
//	public void enterEmployeeId(String employeeId) {
//		
//		driver.findElement(txt_employeeId).clear();
//		driver.findElement(txt_employeeId).sendKeys(employeeId);
//	}
	

	public void clickSave() {

		//wait.until(ExpectedConditions.visibilityOfElementLocated(btn_save));
		driver.findElement(btn_save).click();
	}

	public void addEmployee(String firstName, String lastName) {

		enterFirstName(firstName);
		enterLastName(lastName);
		//enterEmployeeId(employeeId);
		clickSave();

	}

}
