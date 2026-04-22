package com.keerthi.orangehrm.components;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.keerthi.orangehrm.driver.DriverManager;

public class HeaderComponent {

	protected WebDriver driver;
	protected WebDriverWait wait;

	public HeaderComponent(DriverManager driverManager) {
		this.driver = driverManager.getDriver();
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	private By txtSearch = By.xpath("//input[@placeholder='Search']");
	private By txtSearchResult = By.xpath("//a[@class='oxd-main-menu-item']");
	private By txtModuleName = By.xpath("//span[@class='oxd-topbar-header-breadcrumb']");
	
	//private By txt_dashboard = By.xpath("//h6[text()='Dashboard']");

	public void globalSearch(String module) {

		//until(ExpectedConditions.visibilityOfElementLocated(txt_dashboard));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(txtSearch));
		driver.findElement(txtSearch).sendKeys(module);
	}

//	public String getResultString() {
//
//		wait.until(ExpectedConditions.visibilityOfElementLocated(txtModuleName));
//		String searchResult = driver.findElement(txtModuleName).getText().trim();
//		return searchResult;
//	}

	public void clickOnModule() {

		driver.findElement(txtSearchResult).click();
	}

	public String getModuleName() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(txtModuleName));
		String moduleName = driver.findElement(txtModuleName).getText();
		System.out.println(moduleName);
		return moduleName;
		
	}

}
