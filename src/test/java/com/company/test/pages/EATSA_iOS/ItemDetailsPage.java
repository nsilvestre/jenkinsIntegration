package com.company.test.pages.EATSA_iOS;

import com.company.framework.pageobject.MobileBasePO;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ItemDetailsPage extends MobileBasePO {

    List<WebElement> itemDetailsButtons;
    private String buttonClass = "XCUIElementTypeButton";

    public ItemDetailsPage(AppiumDriver driver) {
        super(driver);
    }


    public void tapCustomize() {
        itemDetailsButtons = getWaitDriver().until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className(buttonClass)));
        itemDetailsButtons.get(2).click();
    }


    public void tapAdd() {
        itemDetailsButtons = getWaitDriver().until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className(buttonClass)));
        itemDetailsButtons.get(3).click();
    }
}
