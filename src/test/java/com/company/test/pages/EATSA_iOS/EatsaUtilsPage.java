package com.company.test.pages.EATSA_iOS;

import com.company.framework.pageobject.MobileBasePO;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.HashMap;
import java.util.Map;

import static io.appium.java_client.touch.offset.PointOption.point;

public class EatsaUtilsPage extends MobileBasePO {

    String cartIconId = "cart_icon";

    public EatsaUtilsPage(AppiumDriver driver) {
        super(driver);
    }

    //Generate a 4 digit random number
    public static String randomNumber() {
        int randomNumber = (int) (Math.random() * 9000) + 1000;
        return String.valueOf(randomNumber);
    }

    //Go back tapping the right left back arrow.
    public void goBack() {
        Map<String, Object> args = new HashMap();
        args.put("x", 45);
        args.put("y", 45);

        getDriver().executeScript("mobile: tap", args);
    }

    public void navigateToCart() {
        TouchAction goToCart = new TouchAction(getDriver());
        goToCart.tap(point(940, 40));
        goToCart.perform();

        while(getDriver().findElements(By.id("Your order")).isEmpty()){
            TouchAction goToCart2 = new TouchAction(getDriver());
            goToCart2.tap(point(940, 40));
            goToCart2.perform();
        }
    }


    public static void tapAdd(){
        String addButtonPredicate = "name LIKE '*Add |*'";

        getWaitDriver().until(ExpectedConditions.elementToBeClickable(MobileBy.iOSNsPredicateString(addButtonPredicate))).click();
    }


    public static void tapAddToCart(){
        String addButtonPredicate = "name LIKE '*Add to cart*'";

        getWaitDriver().until(ExpectedConditions.elementToBeClickable(MobileBy.iOSNsPredicateString(addButtonPredicate))).click();
    }

}
