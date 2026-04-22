package com.keerthi.orangehrm.hooks;

import com.keerthi.orangehrm.driver.DriverManager;
import com.keerthi.orangehrm.pages.LoginPage;
import com.keerthi.orangehrm.utils.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    private final DriverManager driverManager;
    private final LoginPage loginPage;

    
    public Hooks(DriverManager driverManager, LoginPage loginPage) {
        this.driverManager = driverManager;
        this.loginPage = loginPage;
    }

    @Before(order = 0)
    public void setUp() {
        driverManager.getDriver()
                .get(ConfigReader.getProperty("baseUrl"));
    }

    @Before(value = "@RequiresLogin", order = 1)
    public void loginBeforeScenario() {
        loginPage.validLogin(
                ConfigReader.getProperty("username"),
                ConfigReader.getProperty("password")
        );
    }

    @After
    public void tearDown() {
        driverManager.quitDriver();
    }
}