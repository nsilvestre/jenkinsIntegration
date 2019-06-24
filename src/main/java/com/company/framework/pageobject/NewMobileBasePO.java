package com.company.framework.pageobject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewMobileBasePO {

    protected static AppiumDriver driver;
    protected static WebDriverWait waitDriver;
    protected static AndroidDriver androidDriver;

    public void setDriver(AppiumDriver driver){
        this.driver = driver;
        waitDriver = new WebDriverWait(driver, 15);
        androidDriver = (AndroidDriver) driver;
    }

}
