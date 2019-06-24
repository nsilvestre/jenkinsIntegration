package com.company.test.pages.EATSA_iOS;

import com.company.framework.pageobject.MobileBasePO;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EnterYourNameAlertPage extends MobileBasePO {

    private String firstNameXpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]";
    private String lastNameXpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[2]";
    private IOSElement firstName;
    private IOSElement lastName;
    private IOSElement email;
    private String doneButtonId = "Done";
    private String name = "";
    public static String savedName;
    public static String savedEmail;
    public static String savedNumberEmail;
    public static String savedCheckEmail;
    private String firstNameFieldId = "First name";
    private String lastNameFieldId = "Last name";
    private String emailFieldId = "email@example.com";

    public EnterYourNameAlertPage(AppiumDriver driver) {
        super(driver);
    }


    public void enterFirstName() {
        firstName = (IOSElement) getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.id(firstNameFieldId)));
        firstName.clear();
        savedName = "Automation"+ EatsaUtilsPage.randomNumber();
        firstName.sendKeys(savedName);
    }


    public void enterLastName() {
        lastName = (IOSElement) getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.id(lastNameFieldId)));
        lastName.clear();
        lastName.sendKeys("Test");
     }


    public void saveChanges() {
        getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.id(doneButtonId))).click();
    }


    public void enterEmail() {
        email = (IOSElement) getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.id(emailFieldId)));
        email.clear();
        savedNumberEmail = EatsaUtilsPage.randomNumber();
        savedEmail = "test@"+savedNumberEmail+".com";
        savedCheckEmail = "t********@"+savedNumberEmail+".com";
        email.sendKeys(savedEmail);
    }
}
