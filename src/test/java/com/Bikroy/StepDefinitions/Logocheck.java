/*package com.compass.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.compass.pages.Homepage;
import com.compass.testbase.TestContextSetup;

/*public class Logocheck {
    private TestContextSetup testContextSetup;
    private WebDriver driver;
    private Homepage homepage;
    private int wait = 3000;

    public Logocheck(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.driver = testContextSetup.driver;
        this.homepage = testContextSetup.pageObjectManager.getHomePage();
    }

    //////////// TC_1 //////////////////////////

    @When("Check That Username Option Is displayed")
    public void checkLoginButtonIsAvailable() throws InterruptedException {
        Assert.assertTrue(homepage.username().isDisplayed());

    }

    @Then("Click on Username Option")
    public void clickOnUsernameOption() throws InterruptedException {
        homepage.username().click();
    }

    @And("Input login username")
    public void inputLoginUsername() throws InterruptedException {
        homepage.username().sendKeys("jloutey");
    }

    @When("Check that Password option is displayed")
    public void checkThatPasswordOptionIsDisplayed() {
        Assert.assertTrue(homepage.password().isDisplayed());
    }

    @Then("input login password")
    public void inputLoginPassword() throws InterruptedException {
        homepage.password().click();
        homepage.password().sendKeys("Flexible123");
    }

    @When("Check That Login Button is displayed")
    public void checkThatLoginButtonIsDisplayed() {
        Assert.assertTrue(homepage.LoginButton().isDisplayed());
    }

    @Then("Click on login Button")
    public void clickOnLoginButton() throws InterruptedException {
        homepage.LoginButton().click();
        Thread.sleep(wait);
    }
//////////////////////////////////////////////////////////////////
    @Given("Check That Companies option is displayed")
    public void checkThatCompaniesOptionIsDisplayed() throws InterruptedException {
        Thread.sleep(wait);
        Assert.assertTrue(homepage.Companies().isDisplayed());
    }

    @Then("Click on the Companies Options")
    public void clickOnTheCompaniesOptions() throws InterruptedException {
        homepage.Companies().click();
        Thread.sleep(wait);
    }

    @And("Check That Company Search is displayed")
    public void checkThatCompanySearchIsDisplayed() {
        Assert.assertTrue(homepage.Company_Search().isDisplayed());
    }

    @Then("Click on Company Search Options")
    public void clickOnCompanySearchOptions() throws InterruptedException {
        homepage.Company_Search().click();
        Thread.sleep(wait);
    }

    @When("Check That Search Options is displayed")
    public void checkThatSearchOptionsIsDisplayed() {
        Assert.assertTrue(homepage.search_opt().isDisplayed());
    }

    @Then("Click on Search Options")
    public void clickOnSearchOptions() throws InterruptedException {
        homepage.search_opt().click();
        Thread.sleep(wait);
    }

    @And("input Text test")
    public void inputTextTest() throws InterruptedException {
        homepage.search_opt().sendKeys("test");

    }

    @When("check That Go button is displayed")
    public void checkThatGoButtonIsDisplayed() {
        Assert.assertTrue(homepage.GO_button().isDisplayed());
    }

    @And("Click on Go button")
    public void clickOnGoButton() throws InterruptedException {
        homepage.GO_button().click();
        Thread.sleep(wait);
        Thread.sleep(wait);
    }
}*/




