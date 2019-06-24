package com.company.test.steps.EATSA;

import com.company.framework.utils.Context;
import com.company.test.pages.EATSA_iOS.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;

public class LoginSteps {

    private AppiumDriver driver;
    private final Context context;
    private LoginPage loginPage;

    public LoginSteps(Context context){
        this.context = context;
        driver = (AppiumDriver) context.getValue("driver");
        loginPage = new LoginPage(driver);
    }

    @And("^I swipe to login$")
    public void swipeToLogin() {
        loginPage.swipeToLogin();
    }


    @And("^environment is selected$")
    public void environmentIsSelected() {
    }


    @And("^store is selected$")
    public void storeIsSelected() {
    }


    @And("^payment is selected$")
    public void paymentIsSelected() {
    }


    @And("^changes are saved$")
    public void changesAreSaved() {
    }


    @Then("^The main menu screen is shown$")
    public void theMainMenuScreenIsShown() {
        System.out.println("test");
    }


    @And("^I navigate to the Configuration screen$")
    public void navigateToTheConfigurationScreen() {
        loginPage.goToConfigurationScreen();
    }


    @Then("^Login screen is shown$")
    public void loginScreenIsShown() {
        loginPage.iAmAt();
    }
}
