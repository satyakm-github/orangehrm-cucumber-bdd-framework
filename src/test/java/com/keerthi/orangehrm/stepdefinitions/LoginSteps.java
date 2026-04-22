package com.keerthi.orangehrm.stepdefinitions;

import org.testng.Assert;
import com.keerthi.orangehrm.pages.DashboardPage;
import com.keerthi.orangehrm.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	LoginPage loginPage;
	DashboardPage dashboardPage;
	
	 public LoginSteps(LoginPage loginPage, DashboardPage dashboardPage) {
	        this.loginPage = loginPage;
	        this.dashboardPage = dashboardPage;
	    }

	@Given("user is on login page")
	public void user_is_on_login_page() {

		//loginPage = new LoginPage(DriverFactory.getDriver());
		loginPage.waitForLoginPageToLoad();

	}

	@When("user enters username {string} and password {string}")
	public void user_enters_username_and_password(String userName, String password) {

		loginPage.enterUsername(userName);
		loginPage.enterPassword(password);
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {

		loginPage.clickLoginBtn();
	}

	@Then("user is navigated to dashboard page")
	public void user_is_navigated_to_dashboard_page() {

		//DashboardPage dp = new DashboardPage(DriverFactory.getDriver());
		Assert.assertTrue(dashboardPage.validateDashboardViewIsDisplayed(), "User is not in Dashboard page");

	}

	@Then("error message {string} should be displayed")
	public void error_message_should_be_displayed(String expected) {

		if (expected.equalsIgnoreCase("Invalid credentials")) {
			Assert.assertEquals(loginPage.getErrMsg(), expected);
		} else if (expected.equalsIgnoreCase("Required")) {
			Assert.assertEquals(loginPage.getFieldErrMessage(), expected);
		} else {
			Assert.fail("Unexpected error is returned : " + expected);
		}
	}

}
