package com.company.test.steps.EATSA;

import com.company.framework.utils.Context;
import com.company.test.pages.EATSA_iOS.OrderHistoryPage;
import cucumber.api.java.en.And;
import io.appium.java_client.AppiumDriver;

public class OrderHistorySteps {

    private final Context context;
    private AppiumDriver driver;
    private OrderHistoryPage orderHistoryPage;

    public OrderHistorySteps(Context context){
        this.context = context;
        driver = (AppiumDriver) context.getValue("driver");
        orderHistoryPage = new OrderHistoryPage(driver);
    }

    @And("^I reorder an item$")
    public void iReorderAnItem(){
        orderHistoryPage.reorderItem();
    }


    @And("^I tap the ([^\"]*) from Re-order screen$")
    public void iTapTheItemFromReOrderScreen(String item) {
        orderHistoryPage.goToItemDetails(item);
    }
}
