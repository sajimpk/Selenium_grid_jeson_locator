package com.compass.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
    features = "src/test/resources/features", 
    glue = "com.compass.stepdefinitions",
        tags = "@Release",
    plugin = { "pretty", "html:reports/cucumber-reports.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
            "rerun:target/failed_scenarios.txt" },


    monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

    // To run scenarios in parallel
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}




