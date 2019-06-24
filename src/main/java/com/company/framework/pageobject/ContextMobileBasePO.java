package com.company.framework.pageobject;

import com.company.framework.utils.Context;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContextMobileBasePO {

    private final Context context;
    protected static AppiumDriver driver;
    protected static WebDriverWait waitDriver;
    protected static AndroidDriver androidDriver;

    public ContextMobileBasePO(Context context){
        this.context = context;
        driver = (AppiumDriver) context.getValue("driver");
        waitDriver = new WebDriverWait(driver, 15);
        androidDriver = (AndroidDriver) driver;
    }

}
