package com.company.test.pages.EATSA_iOS;

import com.company.framework.constants.EatsaCons;
import com.company.framework.pageobject.MobileBasePO;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.HashMap;
import java.util.Map;

public class PartnersPage extends MobileBasePO {

    private String rotiStage = "https://api.roti-stage.keenwawa.com";
    private String wowbaoStage = "https://api.wowbao-stage.keenwawa.com";
    private String errorButtonId = "Errors";
    private String tableClass = "XCUIElementTypeTable";

    public PartnersPage(AppiumDriver driver) {
        super(driver);
    }


    public void selectPartner() {
        getWaitDriver().until(ExpectedConditions.elementToBeClickable((By.id(rotiStage)))).click();
        getWaitDriverLong().until(ExpectedConditions.invisibilityOfElementLocated(By.id(errorButtonId)));
    }


    public void selectPartner(String partner){
        switch(partner){
            case "ROTI":
                getWaitDriverLong().until(ExpectedConditions.elementToBeClickable((By.id(EatsaCons.RotiStageURL)))).click();
                getWaitDriverLong().until(ExpectedConditions.invisibilityOfElementLocated(By.id(errorButtonId)));
            break;
            case "WOWBAO":
                getWaitDriverLong().until(ExpectedConditions.elementToBeClickable((By.id(EatsaCons.WowbaoStageURL)))).click();
                getWaitDriverLong().until(ExpectedConditions.invisibilityOfElementLocated(By.id(errorButtonId)));
            break;
            case "iOS":
                //Scroll down to make iOS visible
                IOSElement main = (IOSElement) getWaitDriver().until(ExpectedConditions.elementToBeClickable((By.className(tableClass))));

                Map<String, Object> args = new HashMap<>();
                args.put("element", main.getId());
                args.put("direction", "down");
                getDriver().executeScript("mobile: scroll", args);

                getWaitDriverLong().until(ExpectedConditions.elementToBeClickable((By.id(EatsaCons.EatsaStageURL)))).click();
                getWaitDriverLong().until(ExpectedConditions.invisibilityOfElementLocated(By.id(errorButtonId)));
            break;
        }

        EatsaCons.CURRENT_PARNER = partner;
    }
}
