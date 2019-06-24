package com.company.test.steps.EATSA;

import com.company.framework.utils.Context;
import com.company.test.pages.EATSA_iOS.ItemDetailsPage;
import cucumber.api.java.en.And;
import io.appium.java_client.AppiumDriver;

public class ItemDetailsSteps {

    private final Context context;
    private AppiumDriver driver;
    private ItemDetailsPage itemDetailsPage;

    public ItemDetailsSteps(Context context){
        this.context = context;
        driver = (AppiumDriver) context.getValue("driver");
        itemDetailsPage= new ItemDetailsPage(driver);
    }

    @And("^I tap customize from Item Details screen")
    public void iTapCustomizeFromItemDetailsScreen(){
        itemDetailsPage.tapCustomize();
    }


    @And("^I tap add from Item Details screen")
    public void iTapAddFromItemDetailsScreen(){
        itemDetailsPage.tapAdd();
    }
}
