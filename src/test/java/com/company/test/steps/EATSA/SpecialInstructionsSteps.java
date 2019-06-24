package com.company.test.steps.EATSA;

import com.company.framework.utils.Context;
import com.company.test.pages.EATSA_iOS.SpecialInstructionsPage;
import cucumber.api.java.en.And;
import io.appium.java_client.AppiumDriver;

public class SpecialInstructionsSteps {

    private final Context context;
    private AppiumDriver driver;
    private SpecialInstructionsPage specialInstructionsPage;

    public SpecialInstructionsSteps(Context context){
        this.context = context;
        driver = (AppiumDriver) context.getValue("driver");
        specialInstructionsPage = new SpecialInstructionsPage(driver);
    }

    @And("^I enter a made for name$")
    public void iEnterAMadeForName(){
        specialInstructionsPage.enterMadeForName();
    }


    @And("^I enter special instructions$")
    public void iEnterSpecialInstructions() {
        specialInstructionsPage.enterSpecialInstructions();
    }


    @And("^I tap Submit$")
    public void iTapSubmit() {
        specialInstructionsPage.tapSubmit();
    }


    @And("^I tap Close button on Special request$")
    public void iTapCloseButtonOnSpecialRequest() {
        specialInstructionsPage.tapClose();
    }
}
