package com.company.test.steps.EATSA;

import com.company.framework.utils.Context;
import com.company.test.pages.EATSA_iOS.PartnersPage;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;

public class PartnersSteps {

    private final Context context;
    private AppiumDriver driver;
    private PartnersPage partnersPage;

    public PartnersSteps(Context context){
        this.context = context;
        driver = (AppiumDriver) context.getValue("driver");
        partnersPage = new PartnersPage(driver);
    }

    @When("^I select the Partner$")
    public void selectPartner(){
        partnersPage.selectPartner();
    }


    @When("^I select ([^\"]*)$ partner")
    public void iSelectThePartner(String partner) {
        partnersPage.selectPartner(partner);
    }


    @When("^I select ([^\"]*) partner$")
    public void iSelectPartnerPartner(String partner) {
        partnersPage.selectPartner(partner);
    }
}
