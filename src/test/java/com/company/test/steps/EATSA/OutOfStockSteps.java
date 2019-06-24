package com.company.test.steps.EATSA;

import com.company.framework.utils.APIUtils;
import com.company.framework.utils.Context;
import cucumber.api.java.en.And;
import io.appium.java_client.AppiumDriver;
import org.junit.Assert;

public class OutOfStockSteps {

    private AppiumDriver driver;
    private final Context context;

    public OutOfStockSteps(Context context){
        this.context = context;
        driver = (AppiumDriver) context.getValue("driver");
    }

    @And("^I mark ([^\"]*) item as out of stock$")
    public void iMarkItemAsOutOfStock(String item){
        Assert.assertEquals("API response code", 200, APIUtils.markItemAsOOS(item));
    }

    @And("^I mark ([^\"]*) item as in stock$")
    public void iMarkItemAsInStock(String item) {
        Assert.assertEquals("API response code", 200, APIUtils.markItemAsInStock(item));
    }

    @And("^I mark ([^\"]*) modifier as out of stock$")
    public void iMarkModifierModifierAsOutOfStock(String modifier) {
        Assert.assertEquals("API response code", 200, APIUtils.markModifierAsOOS(modifier));
    }

    @And("^I mark ([^\"]*) modifier as in stock$")
    public void iMarkModifierModifierAsInStock(String modifier) {
        Assert.assertEquals("API response code", 200, APIUtils.markModifierAsInStock(modifier));
    }
}
