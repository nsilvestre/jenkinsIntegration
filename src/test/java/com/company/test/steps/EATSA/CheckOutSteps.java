package com.company.test.steps.EATSA;

import com.company.framework.utils.Context;
import com.company.test.pages.EATSA_iOS.CheckOutPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import org.junit.Assert;

public class CheckOutSteps {

    private final Context context;
    private AppiumDriver driver;
    private CheckOutPage checkOutPage;

    public CheckOutSteps(Context context){
        this.context = context;
        driver = (AppiumDriver) context.getValue("driver");
        checkOutPage = new CheckOutPage(driver);
    }

    @And("I pay the order$")
    public void iPayOrder(){
        checkOutPage.payOrder();
    }


    @And("^I tap the email from Checkout screen$")
    public void iTapTheEmailFromCheckoutScreen() {
        checkOutPage.tapEmail();
    }


    @Then("^the email is shown$")
    public void theEmailIsShown() {
        Assert.assertTrue(checkOutPage.validateEmailIsSaved());
    }

}
