package com.keerthi.orangehrm.stepdefinitions;

import org.testng.Assert;

import com.keerthi.orangehrm.components.HeaderComponent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationSteps {

	
	HeaderComponent headerComponent;
	
	public NavigationSteps(HeaderComponent headerComponent) {
		this.headerComponent = headerComponent;
	}
	
	@When("user enters a {string} name in global search")
	public void user_enters_a_name_in_global_search(String module) {
	    
		//headerComponent = new HeaderComponent(DriverFactory.getDriver());
		headerComponent.globalSearch(module);
		//Assert.assertEquals(module, headerComponent.getResultString());
		
	}

	@And("user clicks on {string}")
	public void user_clicks_on(String module) {
	    
		headerComponent.clickOnModule();
	}

	@Then("{string} page should be displayed")
	public void page_should_be_displayed(String module) {
	   
		headerComponent.getModuleName();
		Assert.assertEquals(headerComponent.getModuleName(), module);
	}
}
