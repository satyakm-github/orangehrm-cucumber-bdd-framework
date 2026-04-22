package com.keerthi.orangehrm.stepdefinitions;

import org.testng.Assert;

import com.keerthi.orangehrm.pages.EmployeeListPage;

import context.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeListSteps {

	private final TestContext testContext;
	private final EmployeeListPage employeeListPage;
	
	public EmployeeListSteps(TestContext testContext, EmployeeListPage employeeListPage) {
		
		this.testContext = testContext;
		this.employeeListPage = employeeListPage;
		
	}
	
	@When("user clicks on {string} module")
	public void user_clicks_on_module(String module) {
	    
		employeeListPage.navigateToEmployeeList(module);
	   
	}
		
	@When("user enters {string}")
	public void user_enters(String string) {
		
	    employeeListPage.enterEmpName(testContext.getEmployeeName());
	}

	@When("user selects the newly created employee using autocomplete")
	public void user_selects_the_newly_created_employee_using_autocomplete() {
	   
		employeeListPage.selectEmpName();
	}

	@Then("user clicks on Search button")
	public void user_clicks_on_search_button() {
	   
		employeeListPage.clickSearch();
	}

	@Then("newly created employee should be listed in records")
	public void newly_created_employee_should_be_listed_in_records() {
	 
		employeeListPage.getEmpFirstName();
		Assert.assertEquals(employeeListPage.getEmpFirstName(), testContext.getEmployeeFirstName());
		
	}


}
