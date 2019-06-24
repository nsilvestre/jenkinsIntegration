package com.company.test.pages.EATSA_iOS;

import com.company.framework.pageobject.MobileBasePO;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckOutPage extends MobileBasePO {

    String payNowId = "Pay now";
    String emailPredicate = "name LIKE '*Email:*'";

    public CheckOutPage(AppiumDriver driver) {
        super(driver);
    }


    public void payOrder() {
        getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.id(payNowId))).click();
    }


    public void tapEmail() {
        getWaitDriver().until(ExpectedConditions.elementToBeClickable(MobileBy.iOSNsPredicateString(emailPredicate))).click();
    }


    public boolean validateEmailIsSaved() {
        IOSElement email = (IOSElement) getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.id(AlertsPage.savedCheckEmail)));
        return email.isDisplayed();
    }
}
