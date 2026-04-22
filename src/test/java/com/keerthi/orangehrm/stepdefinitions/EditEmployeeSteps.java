package com.keerthi.orangehrm.stepdefinitions;

import com.keerthi.orangehrm.pages.EditEmployeePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditEmployeeSteps {

	EditEmployeePage editEmployeePage;
	
	public EditEmployeeSteps(EditEmployeePage editEmployeePage) {
		
		this.editEmployeePage = editEmployeePage;
	}
	
	@When("user clicks on edit icon")
	public void user_clicks_on_edit_icon() {
	    
		editEmployeePage.clickEdit();
	}

	@Then("enter driver license number as {string}")
	public void enter_driver_license_number_as(String drivingLicense) {
	    
		editEmployeePage.enterDrivingLicense(drivingLicense);
	}

	@Then("select maritial status as {string}")
	public void select_maritial_status_as(String maritalStatus) {
		
		editEmployeePage.selectMaritalStatus(maritalStatus);
	   
	}

	@Then("select gender as {string}")
	public void select_gender_as(String gender) {
	   
		editEmployeePage.selectGender(gender);
	}
	
}
