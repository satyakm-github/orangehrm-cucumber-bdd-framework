package com.keerthi.orangehrm.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features", 
		glue = { 
				"com.keerthi.orangehrm.stepdefinitions",
				"com.keerthi.orangehrm.hooks"
		},
		monochrome = true,
				plugin = {"pretty", "html:target/htmlreports/report.html",
						  "pretty", "html:target/jsonreports/report.json"}
		)
public class TestRunner extends AbstractTestNGCucumberTests {

}
