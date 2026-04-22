package com.keerthi.orangehrm.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.keerthi.orangehrm.driver.DriverManager;

public class ProfilePicturePage {
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	
	public ProfilePicturePage(DriverManager driverManager) {
		
		this.driver = driverManager.getDriver();
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	
	private By link_img = By.xpath("//img[@class='employee-image']");
	private By btn_plusIcon = By.xpath("//i[@class='oxd-icon bi-plus']");
	private By btn_save = By.xpath("//button[@type=\"submit\"]");
	
	
	public void clickProfileIcon() {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(link_img));
		driver.findElement(link_img).click();
	}
	
	public void clickPlusIcon(String filePath) {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(btn_plusIcon));
		driver.findElement(btn_plusIcon).click();
	}
	
	public void clickSave() {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(btn_save));
		driver.findElement(btn_save).click();
	}
	

}
