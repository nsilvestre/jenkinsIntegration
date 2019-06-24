package com.company.test.pages.EATSA_iOS;

import com.company.framework.pageobject.MobileBasePO;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSElement;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Collections;
import java.util.List;

public class UserInformationPage extends MobileBasePO {

    public String logOutButtonId = "Log out - Cancel order";

    List<WebElement> editButtons = getWaitDriver().until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("Edit")));
    private String closeButtonId = "Close";

    public UserInformationPage(AppiumDriver driver) {
        super(driver);
    }


    public boolean isScreenShown(){
        return getWaitDriver().until(ExpectedConditions.textToBePresentInElementLocated(By.id("Log out - Cancel order"), "Log out - Cancel order"));
    }


    /**
     Since there are two edit buttons in the screen, one for Name and other for Email fields
     they are both searched by id "Edit" and store in the "editButtons" list
     the first element of that list corresponds to the edit name
     and the second to the edit email
     **/
    public void tapNameField() {
        editButtons.get(0).click();
    }
    public void tapEmailField() {
        editButtons.get(1).click();
    }


    public boolean validateNameIsSaved() {
        return getWaitDriver().until(ExpectedConditions.textToBePresentInElementLocated(By.id(EnterYourNameAlertPage.savedName + " T"), EnterYourNameAlertPage.savedName + " T"));
    }


    public boolean validateEmailIsSaved() {
        return getWaitDriver().until(ExpectedConditions.textToBePresentInElementLocated(By.id(EnterYourNameAlertPage.savedCheckEmail), EnterYourNameAlertPage.savedCheckEmail));
    }


    public void tapLogOut() {
        getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.id(logOutButtonId))).click();
    }


    public boolean isLogOutAlertShown() {
        return getWaitDriver().until(ExpectedConditions.textToBePresentInElementLocated(By.id("Log out"), "Log out"));
    }


    public void tapClose() {
        getWaitDriver().until(ExpectedConditions.elementToBeClickable(By.id(closeButtonId))).click();
    }
}
