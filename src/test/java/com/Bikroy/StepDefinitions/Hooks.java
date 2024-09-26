package com.compass.stepdefinitions;

import java.io.IOException;

import com.compass.testbase.TestContextSetup;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    private TestContextSetup context;

    public Hooks(TestContextSetup testContextSetup) {
        this.context = testContextSetup;
    }

    @Before
    public void BeforeScenario(Scenario scenario) throws IOException, InterruptedException {
        if (scenario.getSourceTagNames().contains("@SAJIM")) {
            // Run on Selenium Grid (192.168.0.11:4444)
            context.testBase.RemoteDriver("http://localhost:4444/wd/hub");

        } else if(scenario.getSourceTagNames().contains("@RAZIB")){
            // Run on another driver (192.168.0.0.22)
            context.testBase.RemoteDriver("http://192.168.0.109:4444/wd/hub");

        }
        System.out.println("Initializing WebDriver with IP: " + context.testBase.DIp);
        context.initializeDriver();
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
