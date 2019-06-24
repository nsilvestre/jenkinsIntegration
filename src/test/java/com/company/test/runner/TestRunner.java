package com.company.test.runner;


import com.company.framework.base.BaseUtil;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

//all working
/*
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/com/company/test/features/iOS/A_SetUp.feature", "src/test/java/com/company/test/features/iOS/AccountManagement.feature"},
        glue = {"com/company/test/steps/common", "com/company/test/steps/iOS"},
        format = {"html:target/Eatsa/cucumber-pretty"},
        plugin = {
        "pretty",
        "json:target/CucumberJson/cucumber.json",
        "junit:target/cucumber-results.xml"
})
*/

//set up + AddItemToCart
//@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/com/company/test/features/ANDROID/AddContact.feature"},
        glue = {"com/company/test/steps/common", "com/company/test/steps/ANDROID"},
        format = {"html:target/Eatsa/cucumber-pretty"},
        plugin = {
                "pretty",
                "json:target/CucumberJson/cucumber.json",
                "junit:target/cucumber-results.xml"
        })

public class TestRunner extends AbstractTestNGCucumberTests {

}

