package com.company.test.steps.EATSA;

import com.company.framework.utils.Context;
import com.company.test.pages.EATSA_iOS.ForceCustomizePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;

public class ForceCustomizeSteps {

    private final Context context;
    private AppiumDriver driver;
    private ForceCustomizePage forceCustomizePage;

    public ForceCustomizeSteps(Context context){
        this.context = context;
        driver = (AppiumDriver) context.getValue("driver");
        forceCustomizePage = new ForceCustomizePage(driver);
    }

    @And("^I tap add from Force Customize screen$")
    public void iTapAddFromForceCustomizeScreen(){
        forceCustomizePage.tapAdd();
    }


    @Then("^I complete the required sections for ([^\"]*) item$")
    public void iCompleteTheRequiredSectionsForItemItem(String item) {
        forceCustomizePage.selectRequiredModifiers(item);
    }
}
