package com.company.test.pages.EATSA_iOS;

import com.company.framework.pageobject.MobileBasePO;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static io.appium.java_client.touch.offset.PointOption.point;

public class LoginPage extends MobileBasePO {

    private final WebDriverWait waitDriver;
    public String hiddenButton_xPath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]";
    WebDriverWait waitShort = new WebDriverWait(getDriver(), 1);
    private String cornerXpath = "//XCUIElementTypeApplication[@name=\"Kiosk\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]";

    public LoginPage(AppiumDriver driver) {
        super(driver);
        waitDriver  = getWaitDriver();
    }


    public void goToConfigurationScreen() {
        MobileElement corner = (MobileElement) getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.xpath(cornerXpath)));

        while(getDriver().findElements(By.id("Payment")).isEmpty()){
            corner.click();
            corner.click();
            corner.click();
        }

    }


    public void swipeToLogin(){
        IOSElement hiddenButton = (IOSElement) waitDriver.until(ExpectedConditions.elementToBeClickable(By.xpath(hiddenButton_xPath)));

        TouchAction login = new TouchAction(getDriver());
        login.tap(point(1000, 384));
        login.perform();
    }


    public boolean isConfigShown(){
        Assert.assertTrue(waitShort.until(ExpectedConditions.invisibilityOfElementLocated(By.id("Payment"))));
        return waitShort.until(ExpectedConditions.invisibilityOfElementLocated(By.id("Payment")));
    }


    public void iAmAt() {
        //THIS METHOD NEEDS TO BE IMPLEMENTED
    }
}
