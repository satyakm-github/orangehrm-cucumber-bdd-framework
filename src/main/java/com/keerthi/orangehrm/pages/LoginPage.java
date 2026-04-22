package com.keerthi.orangehrm.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.keerthi.orangehrm.driver.DriverManager;

public class LoginPage {

	protected WebDriver driver;
	protected WebDriverWait wait;

	public LoginPage(DriverManager driverManager) {
		this.driver = driverManager.getDriver();
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

	private By txt_username = By.name("username");
	private By txt_password = By.name("password");
	private By btn_logon = By.xpath("//button[@type='submit']");
	private By txt_errorMsgLoginPage = By.xpath("//p[text()='Invalid credentials']");
	private By txt_fieldErrMsg = By.xpath("//span[text()='Required']");

	public void waitForLoginPageToLoad() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(txt_username));
	}

	public void enterUsername(String userName) {

		waitForLoginPageToLoad();
		driver.findElement(txt_username).sendKeys(userName);
	}

	public void enterPassword(String password) {

		driver.findElement(txt_password).sendKeys(password);
	}

	public void clickLoginBtn() {

		driver.findElement(btn_logon).click();
	}

	public void validLogin(String userName, String password) {

		enterUsername(userName);
		enterPassword(password);
		clickLoginBtn();

	}

	public String getErrMsg() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(txt_errorMsgLoginPage));
		String errorMessage = driver.findElement(txt_errorMsgLoginPage).getText().trim();
		return errorMessage;

	}

	public String getFieldErrMessage() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(txt_fieldErrMsg));
		String fieldErrMsg = driver.findElement(txt_fieldErrMsg).getText().trim();
		return fieldErrMsg;

	}

}
