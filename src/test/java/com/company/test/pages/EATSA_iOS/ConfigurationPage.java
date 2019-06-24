package com.company.test.pages.EATSA_iOS;

import com.company.framework.constants.EatsaCons;
import com.company.framework.pageobject.MobileBasePO;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConfigurationPage extends MobileBasePO {

    private String toggleXpath = "//XCUIElementTypeApplication[@name=\"Kiosk\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeSwitch";
    private String toogleClass = "XCUIElementTypeSwitch";
    WebElement payments;
    List<WebElement> tables;
    List<WebElement> selectedPayment;
    IOSElement paymentsTable;
    IOSElement creditCard;
    private String paymentSectionId = "Payment";
    private String saveButtonId = "Close";
    String paymentToggleFlag;
    IOSElement paymentToggle;

    public ConfigurationPage(AppiumDriver driver) {
        super(driver);
    }


    public void togglePayments() {
        paymentToggle = (IOSElement) getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.className(toogleClass)));
        paymentToggleFlag = paymentToggle.getAttribute("value");

        if(paymentToggleFlag.equals("0")){
            paymentToggle.click();
        }
    }

    /**
     Select Visa4 payment method
     **/
    public void selectPayment() {
        //Select Visa 4 element
        String creditCardId = "Visa 4";
        WebElement visa4 = getDriver().findElement(By.id(creditCardId));

        //If Visa 4 is not displayed, then scroll down to make it visible
        if (!visa4.isDisplayed()){
            tables = getWaitDriver().until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("XCUIElementTypeTable")));
            paymentsTable = (IOSElement) tables.get(0);

            Map<String, Object> args = new HashMap<>();
            args.put("element", paymentsTable.getId());
            args.put("direction", "down");

            getDriver().executeScript("mobile: scroll", args);
        }

        //Select Visa 4
        getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.id(creditCardId))).click();
    }


    public void saveChanges() {
        getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.id(saveButtonId))).click();
    }


    public void selectPaymentSection() {
        getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.id(paymentSectionId))).click();
    }
}
