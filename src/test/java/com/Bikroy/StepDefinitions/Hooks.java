package com.compass.stepdefinitions;

import java.io.IOException;

import com.compass.testbase.TestContextSetup;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    private TestContextSetup context;

    public Hooks(TestContextSetup testContextSetup) {
        this.context = testContextSetup;
    }

    @Before
    public void BeforeScenario() throws IOException, InterruptedException {
        // Initialize a new driver before each scenario
       // testContextSetup.testBase.WebDriverManager();
    	context.testBase.navigateToUrl();
    }
    ///////////////////
    @Before("@login")
    public void login() throws IOException, InterruptedException {
        String Username = context.testBase.prop.getProperty("Username");
        String Password = context.testBase.prop.getProperty("Password");
//        context.getLoginPage().login(Username,Password);
    }
    //////////////////

    @After
    public void AfterScenario() throws IOException, InterruptedException {
        // Close the driver after each scenario
        context.testBase.CloseDriver();
    }
}
