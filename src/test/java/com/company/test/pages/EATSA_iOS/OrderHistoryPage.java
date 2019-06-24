package com.company.test.pages.EATSA_iOS;

import com.company.framework.pageobject.MobileBasePO;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class OrderHistoryPage extends MobileBasePO {

    List<WebElement> reorderItems;
    String reorderItemsPredicate = "name LIKE '*Reorder |*'";

    public OrderHistoryPage(AppiumDriver driver) {
        super(driver);
    }


    public void reorderItem() {
        reorderItems = getWaitDriver().until(ExpectedConditions.presenceOfAllElementsLocatedBy(MobileBy.iOSNsPredicateString(reorderItemsPredicate)));
        reorderItems.get(0).click();
    }


    public void goToItemDetails(String item) {
        String itemsPredicate = "name LIKE '*"+item+"*'";
        reorderItems = getWaitDriver().until(ExpectedConditions.presenceOfAllElementsLocatedBy(MobileBy.iOSNsPredicateString(itemsPredicate)));
        reorderItems.get(0).click();
    }
}
