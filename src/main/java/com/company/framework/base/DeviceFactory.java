package com.company.framework.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.service.local.AppiumDriverLocalService;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by aeparra on 5/06/17.
 */
public class DeviceFactory {

    private static AppiumDriverLocalService appiumService;
    private static AppiumServiceBuilder builder;
    private static AppiumDriver driver;

    public static AppiumDriverLocalService startMacAppiumServer(String address, int port){
        String path = System.getProperty("user.home");
        builder = new AppiumServiceBuilder();

        String OS = System.getProperty("os.name");

        if (OS.toLowerCase().contains("mac")){
            builder.usingDriverExecutable(new File(BaseUtil.getAppiumDriverExecutable()));
            //builder.withAppiumJS(new File(path+BaseUtil.getAppiumJS()));
            builder.withAppiumJS(new File(BaseUtil.getAppiumJS()));
        }
        else{
            builder.usingDriverExecutable(new File(BaseUtil.getAppiumDriverExecutable()));
            builder.withAppiumJS(new File(BaseUtil.getAppiumJS()));
        }


        builder.withIPAddress(address);
        builder.usingPort(port);
        appiumService = builder.build();
        appiumService.start();
        return appiumService;
    }

    public static AppiumDriverLocalService stopAppiumServer(){
        appiumService.stop();
        return appiumService;
    }

    public static AppiumDriver getDevice(String device, String url,DesiredCapabilities capabilities) throws MalformedURLException {
        switch (device){
            case "iOS":
                driver = new IOSDriver(new URL(url),capabilities);
                break;
            case "Android":
                driver = new AndroidDriver(new URL(url),capabilities);
                break;
        }
        return driver;
    }
}