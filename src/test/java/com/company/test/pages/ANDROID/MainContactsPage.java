package com.company.test.pages.ANDROID;

import com.company.framework.pageobject.MobileBasePO;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainContactsPage extends MobileBasePO {

    private String addButtonId = "Create new contact";
    private String contactId = "Nicolas Silvestre";
    private String moreOptionsId = "More options";
    private String deleteXpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView";
    private String deleteAlertId = "android:id/button1";


    public MainContactsPage(AppiumDriver driver) {
        super(driver);
    }

    public void tapAdd() {
        getWaitDriver().until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(addButtonId))).click();
    }

    public void selectContact() {
        getWaitDriver().until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(contactId))).click();
    }

    public void tapMoreOptions() {
        getWaitDriver().until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(moreOptionsId))).click();
    }

    public void tapDelete() {
        getWaitDriver().until(ExpectedConditions.elementToBeClickable(MobileBy.xpath(deleteXpath))).click();
    }

    public void tapDeleteFromAlert() {
        getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.id(deleteAlertId))).click();
    }
}
