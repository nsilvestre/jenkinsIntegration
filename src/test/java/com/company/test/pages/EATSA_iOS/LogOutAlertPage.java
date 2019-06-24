package com.company.test.pages.EATSA_iOS;

import com.company.framework.pageobject.MobileBasePO;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogOutAlertPage extends MobileBasePO {

    String cancelId = "Cancel";
    String logOutId = "Log out";

    public LogOutAlertPage(AppiumDriver driver){
        super(driver);
    }


    public void tapCancel() {
        getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.id(cancelId))).click();
    }


    public void tapLogOut() {
        getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.id(logOutId))).click();
    }
}
