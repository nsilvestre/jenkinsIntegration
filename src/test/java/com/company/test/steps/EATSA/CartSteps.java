package com.company.test.steps.EATSA;

import com.company.framework.utils.Context;
import com.company.test.pages.EATSA_iOS.CartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import org.junit.Assert;

public class CartSteps {

    private final Context context;
    private AppiumDriver driver;
    private CartPage cartPage;

    public CartSteps(Context context){
        this.context = context;
        driver = (AppiumDriver) context.getValue("driver");
        cartPage = new CartPage(driver);
    }


    @And("^I validate that ([^\"]*) is in the cart$")
    public void iValidateItemIsInTheCart(String item){
        Assert.assertEquals(1, cartPage.itemsInCart(item));
    }


    @And("^I tap ([^\"]*) checkout type$")
    public void iTapCheckoutType(String checkOutType) {
        cartPage.selectCheckOutType(checkOutType);
    }


    @And("^I select an item from the cart$")
    public void iSelectAnItemFromTheCart() {
        cartPage.selectFirstItem();
    }


    @Then("^the number of items in the cart is (\\d+)$")
    public void numberOfItemsInTheCartIs(int expectedItems) {
        Assert.assertEquals(expectedItems, cartPage.itemsInCartCount());
    }


    @And("^I tap 'Add name or Special request'$")
    public void iTapAddNameOrSpecialRequest() {
        cartPage.tapNameOrSpecialRequest();
    }
}
