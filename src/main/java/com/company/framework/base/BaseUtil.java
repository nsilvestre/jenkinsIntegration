package com.company.framework.base;

import com.company.framework.constants.*;

import net.jodah.failsafe.RetryPolicy;
import org.joda.time.DateTime;
import org.openqa.selenium.*;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Web Driver Initializer
 */
public class BaseUtil {

    //private static String url;

    private static String logPath;
    private static String date;
    private static File targetFolder;
    private static String mailList;
    private static String appiumServerAddress;
    private static String appiumServerPort;
    private static String linuxChromePath;
    private static String linuxFirePath;
    private static String macChromePath;
    private static String macFirePath;
    private static String winChromePath;
    private static String winIePath;
    private static String win32firePath;
    private static String win64firePath;
    private static String appiumDriverExecutable;
    private static String appiumJS;
    private static RetryPolicy retryPolicy;
    private static String webdriverConfigPath;
    private static String appiumConfigPath;
    private static String gridServerUrl;
    private static String restConfigPath;
    private static String dbConfigPath;
    private static String dbNonSqlConfigPath;
    private static String soapConfigPath;


    static {
        try (FileInputStream input = new FileInputStream("properties/.properties")) {
            Properties props = new Properties();
            retryPolicy = new RetryPolicy().retryOn(NoSuchSessionException.class).withDelay(1,TimeUnit.SECONDS).withMaxRetries(3);

            props.load(input);
            date = getDate();
            //targetFolder = new File("./log/"+date);
            //targetFolder.mkdir();
//          logPath = targetFolder.getPath();
            
            //url = props.getProperty(Constants.PROPS_URL);

            mailList = props.getProperty(Constants.PROPS_MAIL_LIST);
            appiumServerAddress = props.getProperty(Constants.PROPS_APPIUM_SERVER_ADDRESS);
            appiumServerPort = props.getProperty(Constants.PROPS_APPIUM_SERVER_PORT);
            appiumServerAddress = props.getProperty(Constants.PROPS_APPIUM_SERVER_ADDRESS);
            appiumServerPort = props.getProperty(Constants.PROPS_APPIUM_SERVER_PORT);
            linuxChromePath = props.getProperty(Constants.PROPS_LINUX_CHROME_PATH);
            linuxFirePath = props.getProperty(Constants.PROPS_LINUX_FIREFOX_PATH);
            macChromePath = props.getProperty(Constants.PROPS_MAC_CHROME_PATH);
            macFirePath = props.getProperty(Constants.PROPS_MAC_FIREFOX_PATH);
            winChromePath = props.getProperty(Constants.PROPS_WIN_CHROME_PATH);
            winIePath = props.getProperty(Constants.PROPS_WIN_IE_PATH);
            win32firePath = props.getProperty(Constants.PROPS_WIN_FIREFOX32_PATH);
            win64firePath = props.getProperty(Constants.PROPS_WIN_FIREFOX64_PATH);
            webdriverConfigPath = props.getProperty(Constants.PROPS_WEBDRIVER_CONFIG);
            appiumConfigPath = props.getProperty(Constants.PROPS_APPIUM_CONFIG);
            gridServerUrl = props.getProperty(Constants.PROPS_GRID_SERVER);
            restConfigPath = props.getProperty(Constants.PROPS_REST_CONFIG);
            dbConfigPath = props.getProperty(Constants.PROPS_DB_CONFIG);
            dbNonSqlConfigPath = props.getProperty(Constants.PROPS_DBNONSQL_CONFIG);
            soapConfigPath = props.getProperty(Constants.PROPS_SOAP_CONFIG);


            String OS = System.getProperty("os.name");

            if(OS.toLowerCase().contains("mac")) {
                appiumDriverExecutable = props.getProperty(Constants.PROPS_APPIUM_DRIVER_EXECUTABLE);
                appiumJS = props.getProperty(Constants.PROPS_APPIUM_JS);
            }
            else{
                appiumDriverExecutable = props.getProperty(Constants.PROPS_WIN_APPIUM_DRIVER_EXECUTABLE);
                appiumJS = props.getProperty(Constants.PROPS_WIN_APPIUM_JS);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getLogPath(){ return logPath; }

    public static String getMailList(){ return mailList; }

    public static String getLinuxChromePath() {
        return linuxChromePath;
    }

    public static String getLinuxFirePath() {
        return linuxFirePath;
    }

    public static String getMacChromePath() {
        return macChromePath;
    }

    public static String getMacFirePath() {
        return macFirePath;
    }

    public static String getWinChromePath() {
        return winChromePath;
    }

    public static String getWinIePath() {
        return winIePath;
    }

    public static String getWin32firePath() {
        return win32firePath;
    }

    public static String getWin64firePath() { return win32firePath; }

    public static String getAppiumDriverExecutable(){
        return appiumDriverExecutable;
    }

    public static String getAppiumJS() {
        return appiumJS;
    }

    public static RetryPolicy getRetryPolicy(){
        return retryPolicy;
    }

    public static String getWebdriverConfigPath() {
        return webdriverConfigPath;
    }

    public static String getAppiumConfigPath() {
        return appiumConfigPath;
    }

    public static String getGridServerUrl() {
        return gridServerUrl;
    }

    public static String getDate(){
        String date="";

        DateTime dateTime = new DateTime();
        date = date + dateTime.year().getAsString()+"_";
        date = date + dateTime.monthOfYear().getAsString()+"_";
        date = date + dateTime.dayOfMonth().getAsString()+"_";
        date = date + dateTime.hourOfDay().getAsString()+"_";
        date = date + dateTime.minuteOfHour().getAsString()+"_";
        date = date + dateTime.secondOfMinute().getAsString()+"_";
        date = date + dateTime.millisOfSecond().getAsString();

        return date;
    }

    public static String getTargetFolder(){
        return targetFolder.getName();
    }

    public static String getAppiumServerAddress() {
        return appiumServerAddress;
    }

    public static String getAppiumServerPort() {
        return appiumServerPort;
    }

    public static String getRestConfigPath() {
        return restConfigPath;
    }

    public static String getDbConfigPath() {
        return dbConfigPath;
    }

    public static String getDbNonSqlConfigPath() {
        return dbNonSqlConfigPath;
    }

    public static String getSoapConfigPath() {
        return soapConfigPath;
    }
}