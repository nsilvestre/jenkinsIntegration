package com.company.framework.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.company.framework.base.BaseUtil;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class BasePO {
    private WebDriver driver;

    public BasePO(WebDriver driver){
        this.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
        PageFactory.initElements(factory, this);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void scrollUntilVisible(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
}