package com.company.test.pages.EATSA_iOS;

import com.company.framework.pageobject.MobileBasePO;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ForceCustomizePage extends MobileBasePO {

    List<WebElement> requiredModifiers;
    String addButtonsPredicate = "name LIKE '*add button*'";
    WebElement addButton;
    int i;

    public ForceCustomizePage(AppiumDriver driver) {
        super(driver);
    }


    public void tapAdd() {
        EatsaUtilsPage.tapAdd();
    }


    public void selectRequiredModifiers(String item) {
        switch (item){
            case "6-Pack Bao":
                for(i = 1; i < 7; i++) {
                    requiredModifiers = getWaitDriver().until(ExpectedConditions.presenceOfAllElementsLocatedBy(MobileBy.iOSNsPredicateString(addButtonsPredicate)));
                    requiredModifiers.get(0).click();
                }
        }
    }

}
