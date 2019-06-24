package com.company.test.pages.EATSA_iOS;

import com.company.framework.pageobject.MobileBasePO;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainMenuPage extends MobileBasePO {

    private String wheelButtonId = "Settings";
    String orderHistoryId = "Order History";

    public MainMenuPage(AppiumDriver driver) {
        super(driver);
    }


    public void navigateToUserInformationScreen() {
        getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.id(wheelButtonId))).click();
    }


    public void selectCategory(String category) {
        getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.id(category))).click();
    }


    public void selectSubcategory(String subcategory) {
        getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.id(subcategory))).click();
    }


    public void selectOrderHistory() {
        getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.id(orderHistoryId)));
    }
}
