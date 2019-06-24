package com.company.test.steps.EATSA;

import com.company.framework.utils.Context;
import com.company.test.pages.EATSA_iOS.AlertsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import org.junit.Assert;

public class AlertsSteps {

    private final Context context;
    private AppiumDriver driver;
    private AlertsPage alertsPage;

    public AlertsSteps(Context context){
        this.context = context;
        driver = (AppiumDriver) context.getValue("driver");
        alertsPage = new AlertsPage(driver);
    }

    @Then("^'complete all sections' alert is shown$")
    public void completeAllSectionAlertShown() {
        Assert.assertTrue(alertsPage.isShown("ForceCustomizeValidation"));
        alertsPage.tapOkay();
    }

    @And("^I tap remove from Cart Item alert$")
    public void iTapRemoveFromCartItemAlert() {
        alertsPage.removeFromCart();
    }


    @Then("^Email Error alert is shown$")
    public void emailErrorAlertIsShown() {
        alertsPage.validateEmailErrorAlertIsShown();
    }


    @And("^I tap Done$")
    public void iTapDone() {
        alertsPage.tapDone();
    }


    @And("^I enter an email from alert$")
    public void iEnterAnEmailFromAlert() {
        alertsPage.enterEmail();
    }


    @Then("^Nutrition Details alert is shown$")
    public void nutrionalDetailsAlertIsShown() {
        Assert.assertTrue(alertsPage.isNutritionDetailsShown());
    }


    @And("^I tap Close alert button$")
    public void iTapCloseAlertButton() {
        alertsPage.tapClose();
    }


    @Then("^Out of Stock alert is shown$")
    public void outOfStockAlertIsShown() {
        Assert.assertTrue(alertsPage.isOOSshown());
    }


    @And("^I tap Yes$")
    public void iTapYes() {
        alertsPage.tapYes();
    }


    @And("^I tap Okay$")
    public void iTapOkay() {
        alertsPage.tapOkay();
    }


    @Then("^alert is shown indicating that ([^\"]*) is OOS$")
    public void alertIsShownIndicatingThatItemIsOOS(String item) {
        Assert.assertTrue(alertsPage.isOOSshown(item));
    }
}
