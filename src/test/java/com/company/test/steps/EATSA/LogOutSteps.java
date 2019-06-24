package com.company.test.steps.EATSA;

import com.company.framework.utils.Context;
import com.company.test.pages.EATSA_iOS.LogOutAlertPage;
import cucumber.api.java.en.And;
import io.appium.java_client.AppiumDriver;

public class LogOutSteps {

    private final Context context;
    private AppiumDriver driver;
    private LogOutAlertPage logOutAlertPage;

    public LogOutSteps(Context context){
        this.context = context;
        driver = (AppiumDriver) context.getValue("driver");
        logOutAlertPage = new LogOutAlertPage(driver);
    }

    @And("^I tap Cancel$")
    public void tapNameField() {
        logOutAlertPage.tapCancel();
    }


    @And("^I tap Log out$")
    public void iTapLogOut() {
        logOutAlertPage.tapLogOut();
    }
}
