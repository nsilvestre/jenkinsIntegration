package com.company.test.steps.EATSA;

import com.company.framework.utils.Context;
import com.company.test.pages.EATSA_iOS.ItemListPage;
import cucumber.api.java.en.And;
import io.appium.java_client.AppiumDriver;

public class ItemListSteps {

    private final Context context;
    private AppiumDriver driver;
    private ItemListPage itemListPage;

    public ItemListSteps(Context context){
        this.context = context;
        driver = (AppiumDriver) context.getValue("driver");
        itemListPage = new ItemListPage(driver);
    }

    @And("^I select ([^\"]*) item$")
    public void iSelectItem(String item){
        itemListPage.selectItem(item);
    }
}
