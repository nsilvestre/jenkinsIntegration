package com.company.test.steps.EATSA;

import com.company.framework.utils.Context;
import com.company.test.pages.EATSA_iOS.EatsaUtilsPage;
import cucumber.api.java.en.And;
import io.appium.java_client.AppiumDriver;

public class EatsaUtilsSteps {

    private AppiumDriver driver;
    private final Context context;
    private EatsaUtilsPage eatsaUtilsPage;

    public EatsaUtilsSteps(Context context){
        this.context = context;
        driver = (AppiumDriver) context.getValue("driver");
        eatsaUtilsPage = new EatsaUtilsPage(driver);
    }

    public static String randomNumber() {
        int randomNumber = (int) (Math.random() * 9000) + 1000;
        return String.valueOf(randomNumber);
    }


    @And("^I go back$")
    public void iGoBack(){
        eatsaUtilsPage.goBack();
    }


    @And("^I navigate to the cart$")
    public void iNavigateToTheCart() {
        eatsaUtilsPage.navigateToCart();
    }
}
