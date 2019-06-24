package com.company.framework.utils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;

import com.company.framework.base.BaseUtil;
import cucumber.api.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;

import static org.openqa.selenium.OutputType.BYTES;

public class Utility
{
    private static final Logger LOGGER = LoggerFactory.getLogger(Utility.class);
    private static String date = BaseUtil.getDate();
    private static String OS = System.getProperty("os.name");
    private static String folderOS;

    public static void captureScreenshot(WebDriver driver, Scenario scenario)
    {
        String screenshotName = scenario.getName();
        try
        {
            Thread.sleep(2000);
            TakesScreenshot ts=(TakesScreenshot)driver;

            File source=ts.getScreenshotAs(OutputType.FILE);

            FileUtils.copyFile(source, new File(System.getProperty("user.dir") + getFolderOS() +
                    screenshotName + "_" + date + ".jpg"));

            LOGGER.info("Screenshot taken");
        }
        catch (Exception e)
        {
            LOGGER.error("Exception while taking screenshot " + e.getMessage());
        }
    }

    public static String getFolderOS() {
        if (OS.toLowerCase().contains("windows")){
            folderOS = "\\screenshots\\";
        }
        else if(OS.toLowerCase().contains("mac")){
            folderOS = "/screenshots/";
        }
        return folderOS;
    }

    public static void captureScreenshotWithScroll(WebDriver driver, Scenario scenario)
    {
        String screenshotName = scenario.getName();
        try
        {
            Thread.sleep(2000);
            // screen will be scrolled and captured
            Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100))
                    .takeScreenshot(driver);

            Path path = Paths.get(System.getProperty("user.dir") + getFolderOS() + screenshotName + "_" + date +
                    ".jpg");
            if (!Files.exists(path)) {
                 Files.createDirectories(path);
            }

            // To save the screenshot in desired location
            ImageIO.write(screenshot.getImage(), "JPG", new File(String.valueOf(path)));

            LOGGER.info("Screenshot taken");
        }
        catch (Exception e)
        {
            LOGGER.error("Exception while taking screenshot " + e.getMessage());
        }
    }

    public static void embedScreenshot(WebDriver driver, Scenario scenario) {
        try
        {
            Thread.sleep(2000);
            TakesScreenshot camera = (TakesScreenshot) driver;
            byte[] screenshot = camera.getScreenshotAs(BYTES);
            scenario.embed(screenshot, "image/png");

            LOGGER.info("Embedded screenshot");
        }
        catch (Exception e)
        {
            LOGGER.error("Exception while taking screenshot " + e.getMessage());
        }
    }
}
