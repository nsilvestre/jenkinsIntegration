package com.company.test.pages.ContactsApp;

import com.company.framework.pageobject.NewMobileBasePO;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NewContactPage extends NewMobileBasePO {


    public void enterFirstName() {
        waitDriver.until(ExpectedConditions.elementToBeClickable(By.id("First name"))).sendKeys("Nicolas");
    }

    public void enterLastName() {
        waitDriver.until(ExpectedConditions.elementToBeClickable(By.id("Last name"))).sendKeys("Silvestre");
    }

    public void enterCompany() {
        waitDriver.until(ExpectedConditions.elementToBeClickable(By.id("Company"))).sendKeys("Belatrix");
    }

    public void tapDone() {
        waitDriver.until(ExpectedConditions.elementToBeClickable(By.id("Done"))).click();
    }
}
