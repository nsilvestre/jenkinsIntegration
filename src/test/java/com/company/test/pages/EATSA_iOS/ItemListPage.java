package com.company.test.pages.EATSA_iOS;

import com.company.framework.pageobject.MobileBasePO;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ItemListPage extends MobileBasePO {

    public ItemListPage(AppiumDriver driver) {
        super(driver);
    }


    public void selectItem(String item) {
        getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.id(item))).click();
    }
}
