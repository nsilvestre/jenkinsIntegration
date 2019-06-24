package com.company.test.pages.EATSA_iOS;

import com.company.framework.pageobject.MobileBasePO;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SpecialInstructionsPage extends MobileBasePO {

    private IOSElement madeForElement;
    private String madeForId = "Enter your name";
    private String madeForText = "MadeForAutomatedName";
    private IOSElement specialInstructionsElement;
    private String specialInstructionsText = "Automated Special instructions";
    private String submitId = "Submit";
    private String closeId = "Return";
    private String specialInstructionClass = "XCUIElementTypeTextView";

    public SpecialInstructionsPage(AppiumDriver driver) {
        super(driver);
    }


    public void enterMadeForName() {
        madeForElement = (IOSElement) getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.id(madeForId)));
        madeForElement.sendKeys(madeForText+EatsaUtilsPage.randomNumber());
    }


    public void enterSpecialInstructions() {
        specialInstructionsElement = (IOSElement) getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.className(specialInstructionClass)));
        specialInstructionsElement.sendKeys(specialInstructionsText+EatsaUtilsPage.randomNumber());
    }


    public void tapSubmit() {
        getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.id(submitId))).click();
    }


    public void tapClose() {
        getWaitDriver().until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(closeId))).click();
    }
}
