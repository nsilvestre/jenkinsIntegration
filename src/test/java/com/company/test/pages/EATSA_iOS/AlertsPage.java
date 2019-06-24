package com.company.test.pages.EATSA_iOS;

import com.company.framework.pageobject.MobileBasePO;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class AlertsPage extends MobileBasePO {

    String forceCustomizeValidationId = "Please complete all sections before proceeding.";
    String okayButtonId = "Okay";
    public Boolean response;
    private String removeButtonId = "Remove";
    private String emailErrorId = "Error";
    private String donePredicate = "name LIKE '*Done*'";
    private String doneId = "Done";
    private IOSElement email;
    public static String savedEmail;
    public static String savedNumberEmail;
    public static String savedCheckEmail;
    private String emailId = "email@example.com";
    private String nutritionTitleId = "NUTRITION DETAILS";
    private String closeID = "Close";
    private String oosTitleId = "Something’s out of stock";
    private String yesID = "Yes";

    public AlertsPage(AppiumDriver driver) {
        super(driver);
    }

    public boolean isShown(String validation) {
        switch (validation){
            case "ForceCustomizeValidation":
                response = getWaitDriver().until(ExpectedConditions.textToBePresentInElementLocated(By.id(forceCustomizeValidationId), forceCustomizeValidationId));
                break;
        }
        return response;
    }

    public void tapOkay() {
        getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.id(okayButtonId))).click();
    }

    public void removeFromCart() {
        getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.id(removeButtonId))).click();
    }

    public void validateEmailErrorAlertIsShown() {
        getWaitDriver().until(ExpectedConditions.visibilityOfElementLocated(By.id(emailErrorId)));
        getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.id(okayButtonId))).click();
    }

    public void tapDone() {
        /***
         For some reason sometimes the Done button is pressed but the action is not triggered
         my guess is that it is loaded but not rendered. To avoid this behavior I added a condition
         that check if the button is displayed, if so then tap it again
        ***/

        IOSElement doneButton = (IOSElement) getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.id(doneId)));

        while(doneButton.isDisplayed()){
            doneButton.click();
        }
    }

    public void enterEmail() {
        email = (IOSElement) getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.id(emailId)));
        email.clear();
        savedNumberEmail = EatsaUtilsPage.randomNumber();
        savedEmail = "test@"+savedNumberEmail+".com";
        savedCheckEmail = "Email: t********@"+savedNumberEmail+".com";
        email.sendKeys(savedEmail);
    }
    public boolean isNutritionDetailsShown() {
        WebElement nutritionDetailsTittle = getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.id(nutritionTitleId)));
        return nutritionDetailsTittle.isDisplayed();
    }

    public void tapClose() {
        getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.id(closeID))).click();
    }

    public boolean isOOSshown() {
        WebElement oosTitle = getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.id(oosTitleId)));
        return oosTitle.isDisplayed();
    }


    public void tapYes() {
        getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.id(yesID))).click();
    }

    public boolean isOOSshown(String item) {
        String OOSmessage = "Unfortunately, the following items are now out of stock: "+item+". Please remove them from your order and try again.";
        WebElement oosTitle = getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.id(OOSmessage)));
        return oosTitle.isDisplayed();
    }
}
