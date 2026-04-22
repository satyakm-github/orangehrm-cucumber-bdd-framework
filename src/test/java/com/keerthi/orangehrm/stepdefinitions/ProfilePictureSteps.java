package com.keerthi.orangehrm.stepdefinitions;

import com.keerthi.orangehrm.pages.ProfilePicturePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfilePictureSteps {
	
	ProfilePicturePage profilePicturePage;
	
	public ProfilePictureSteps(ProfilePicturePage profilePicturePage) {
		
		this.profilePicturePage = profilePicturePage;
		
	}

	@When("user opens change profile picture section")
	public void user_opens_change_profile_picture_section() {
		
		profilePicturePage.clickProfileIcon();


	}

	@When("user uploads profile picture {string}")
	public void user_uploads_profile_picture(String filePath) {
		
		profilePicturePage.clickPlusIcon(filePath);

	}

	@When("user saves the profile picture")
	public void user_saves_the_profile_picture() {
		
		profilePicturePage.clickSave();

	}

	@Then("profile picture should be updated successfully")
	public void profile_picture_should_be_updated_successfully() {
		
		
	}

}
