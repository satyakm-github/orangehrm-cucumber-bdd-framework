package com.keerthi.orangehrm.stepdefinitions;

import org.testng.Assert;
import com.keerthi.orangehrm.pages.AddEmployeePage;
import com.keerthi.orangehrm.pages.PersonalDetailsPage;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeSteps {

	AddEmployeePage addEmployeePage;
	PersonalDetailsPage personalDetailsPage;
	TestContext testContext;
	
	public AddEmployeeSteps(TestContext testContext, AddEmployeePage addEmployeePage, PersonalDetailsPage personalDetailsPage){
		
		this.testContext = testContext;
		this.addEmployeePage = addEmployeePage;
		this.personalDetailsPage = personalDetailsPage;
		
	}

	@Given("user navigates to {string} module")
	public void user_navigates_to_module(String module) {

		//addEmployeePage = new AddEmployeePage(DriverManager.getDriver());
		addEmployeePage.navigateToEmployeeList(module);
	}

	@When("user clicks on Add button")
	public void user_clicks_on_add_button() {

		addEmployeePage.clickAdd();
	}

	@And("user enters firstName {string} and lastName {string}")
	public void user_enters_first_name_and_last_name(String firstName, String lastName) {

		addEmployeePage.addEmployee(firstName, lastName);
		testContext.setEmployeeName(firstName + " " + lastName);
		testContext.setEmployeeFirstName(firstName);
		testContext.setEmployeeLastName(lastName);
		//testContext.setEmployeeId(employeeId);
	}

	@And("user clicks on Save button")
	public void user_clicks_on_save_button() {

		addEmployeePage.clickSave();
	}

	@Then("user navigated to personal details view")
	public void user_navigated_to_personal_details_view() {

		//personalDetailsPage = new PersonalDetailsPage(DriverFactory.getDriver());
		personalDetailsPage.isUserInPersonalDetails();
		Assert.assertTrue(personalDetailsPage.isUserInPersonalDetails(), "User not in personal details page");

	}

}
