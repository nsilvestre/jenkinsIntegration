package com.company.test.steps.common;

import com.company.framework.base.BaseUtil;
import com.company.framework.pageobject.NewMobileBasePO;
import com.company.framework.utils.Context;
import com.company.framework.utils.Utility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import net.jodah.failsafe.Failsafe;
import org.junit.AssumptionViolatedException;

import java.util.Collection;

import static com.company.framework.base.Framework.setup_appium_driver;
import static com.company.framework.base.Framework.stop_appium_server;

public class MobileSteps {
    private final Context context;
    private AppiumDriver driver;

    public MobileSteps(Context context){
        this.context = context;
        driver = null;
    }


    @Before
    public void beforeScenario(Scenario sc) {
        Collection<String> tags = sc.getSourceTagNames();
        String tagName = null;
        for(Object tag : tags){
            tagName = tag.toString();
        }

        if (!tagName.equals("@working")) {
            throw new AssumptionViolatedException("Scenario not tagged as working, so skipping");
        }
    }


    @After
    public void tearDown(Scenario scenario) {
        try {
            if (scenario.isFailed()) {
                //Screenshot
                Utility.captureScreenshot(driver, scenario);

                //Screenshot embed in report
                Utility.embedScreenshot(driver, scenario);
                driver.quit();
                stop_appium_server();
            }
        }
        catch (Exception e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }


    @Given("([^\"]*) appium driver")
    public void setup_appium(String configName) throws Exception {
        context.setValue("gridServerUrl", BaseUtil.getGridServerUrl());
        Failsafe.with(BaseUtil.getRetryPolicy()).run(()-> driver = setup_appium_driver(context, configName));
        context.setValue("driver", driver);

        //Create the base page object and instantiate it with the Driver.
        NewMobileBasePO newBasePo = new NewMobileBasePO();
        newBasePo.setDriver(driver);
    }


    @Then("^I close app$")
    public void close_app() throws Throwable {
        //Original code
        driver.quit();
        stop_appium_server();
    }

}
