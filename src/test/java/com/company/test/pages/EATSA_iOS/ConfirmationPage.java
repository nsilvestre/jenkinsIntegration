package com.company.test.pages.EATSA_iOS;

import com.company.framework.pageobject.MobileBasePO;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ConfirmationPage extends MobileBasePO {

    String confirmationButtonId = "Got it!";

    public ConfirmationPage(AppiumDriver driver) {
        super(driver);
    }


    public boolean orderCreated() {
        return getWaitDriver().until(ExpectedConditions.elementToBeSelected(By.id(confirmationButtonId)));
    }


    public void tapConfirmationButton() {
        getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.id(confirmationButtonId))).click();
    }
}
