package com.company.test.steps.EATSA;

import com.company.framework.utils.Context;
import com.company.test.pages.EATSA_iOS.ConfigurationPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;

public class ConfigurationSteps {
    private final Context context;
    private AppiumDriver driver;
    private ConfigurationPage configurationPage;

    public ConfigurationSteps(Context context){
        this.context = context;
        driver = (AppiumDriver) context.getValue("driver");
        configurationPage = new ConfigurationPage(driver);
    }

    @When("^I toggle Payments$")
    public void selectPartner(){
        configurationPage.togglePayments();
    }


    @And("^I select a Payment$")
    public void selectAPayment() {
        configurationPage.selectPayment();
    }


    @And("^I close the Configuration screen$")
    public void closeTheConfigurationScreen() {
        configurationPage.saveChanges();
    }


    @And("^I select the Payment section$")
    public void selectThePaymentSection() {
        configurationPage.selectPaymentSection();
    }
}
