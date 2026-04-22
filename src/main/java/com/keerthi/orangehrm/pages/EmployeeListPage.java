package com.keerthi.orangehrm.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.keerthi.orangehrm.driver.DriverManager;


public class EmployeeListPage {
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	
	public EmployeeListPage(DriverManager driverManager) {
		
		this.driver = driverManager.getDriver();
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	}
	
	/** Employee Search page locators */
	private By txt_inputEmpName = By.xpath("(//input[@placeholder='Type for hints...'])[1]");
	private By txt_selectEmpName = By.xpath("//div[@role='listbox']");
	private By btn_search = By.xpath("//button[@type='submit']");
	private By txt_getFirstNameFromResult = By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']//div[3]");
	
	
	private By txt_pimModule = By.xpath("//span[text()='PIM']");
	
	public void navigateToEmployeeList(String module) {

		driver.findElement(txt_pimModule).click();
	}	
	
	/** Employee Search page **/
	public void enterEmpName(String empName) {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(txt_inputEmpName));
		driver.findElement(txt_inputEmpName).sendKeys(empName);
	}
	
	public void selectEmpName() {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(txt_selectEmpName));
		driver.findElement(txt_selectEmpName).click();
	}
	
	public void clickSearch() {
		
		driver.findElement(btn_search).click();
	}
	
	public String getEmpFirstName()
	{
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(txt_getFirstNameFromResult));
		String empFirstName= driver.findElement(txt_getFirstNameFromResult).getText();
		return empFirstName;
	}


}
