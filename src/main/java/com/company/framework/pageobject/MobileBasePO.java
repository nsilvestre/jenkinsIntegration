package com.company.framework.pageobject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Set;

import static io.appium.java_client.touch.offset.ElementOption.element;

/**
 * Created by aeparra on 7/06/17.
 */
public class MobileBasePO {
    private AppiumDriver driver;
    private static JavascriptExecutor js;
    private static HashMap<String,Object>params;
    private static WebDriverWait waitDriver;
    private static WebDriverWait waitDriverLong;
    private static WebDriverWait waitDriverShort;

    public MobileBasePO(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
        waitDriver = new WebDriverWait(driver, 15);
        waitDriverLong = new WebDriverWait(driver, 70);
        waitDriverShort = new WebDriverWait(driver, 2);
    }

    public AppiumDriver getDriver(){
        return driver;
    }

    public static WebDriverWait getWaitDriver() {
        return waitDriver;
    }

    public static WebDriverWait getWaitDriverLong(){
        return waitDriverLong;
    }

    public static WebDriverWait getWaitDriverShort(){
        return waitDriverShort;
    }

    public void swipeJS(String direction, IOSElement element){
        js = driver;
        params = new HashMap<>();
        params.put("direction",direction);
        params.put("element",element.getId());
        js.executeScript("mobile: swipe",params);
    }

    public void switchDriverContext(String context){
        Set<String> driverContext = getDriver().getContextHandles();
        switch (context){
            case "web":
                for(String localContext : driverContext){
                    if(localContext.contains("WEBVIEW")){
                        getDriver().context(localContext);
                    }
                }
                break;
            case "native":
                for(String localContext : driverContext){
                    if(localContext.contains("NATIVE")){
                        getDriver().context(localContext);
                    }
                }
                break;
        }
    }

    public void iOSElementTap(IOSElement iosElement){
        TouchAction tap = new TouchAction(getDriver()).tap(TapOptions.tapOptions().withElement(element(iosElement)).withTapsCount(1));
        tap.perform();
    }

    public void iOSElementSwipe(IOSElement iosElement, String direction){
        int height = getDriver().manage().window().getSize().getHeight();
        int width = getDriver().manage().window().getSize().getWidth();

        int elementCenterX = iosElement.getCenter().getX();
        int elementCenterY = iosElement.getCenter().getY();

        TouchAction swipe = new TouchAction(getDriver()).press(PointOption.point(elementCenterX,elementCenterY));

        switch (direction){
            case "up":
                swipe.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(elementCenterX,0)).release();
                break;
            case "down":
                swipe.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(elementCenterX,height)).release();
                break;
            case "right":
                swipe.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(width,elementCenterY)).release();
                break;
            case "left":
                swipe.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(0,elementCenterY)).release();
                break;
        }
        swipe.perform();
    }

    public void iOSSwipe(String direction){
        int height = getDriver().manage().window().getSize().getHeight();
        int width = getDriver().manage().window().getSize().getWidth();

        TouchAction swipe = new TouchAction(getDriver()).press(PointOption.point(width/2,height/2));

        switch (direction){
            case "up":
                swipe.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(width/2,0)).release();
                break;
            case "down":
                swipe.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(width/2,height)).release();
                break;
            case "right":
                swipe.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(width,height/2)).release();
                break;
            case "left":
                swipe.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(0,height/2)).release();
                break;
        }
        swipe.perform();
    }
}
