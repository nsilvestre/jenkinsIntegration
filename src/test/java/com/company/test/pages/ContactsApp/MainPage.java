package com.company.test.pages.ContactsApp;

import com.company.framework.pageobject.NewMobileBasePO;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends NewMobileBasePO {

    public void tapPlusButton() {
        waitDriver.until(ExpectedConditions.elementToBeClickable(By.id("Add"))).click();
    }
}
