package com.company.test.steps.EATSA;

import com.company.framework.utils.Context;
import com.company.test.pages.EATSA_iOS.MainMenuPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;

public class MainMenuSteps {

    private final Context context;
    private AppiumDriver driver;
    private MainMenuPage mainMenuPage;

    public MainMenuSteps(Context context){
        this.context = context;
        driver = (AppiumDriver) context.getValue("driver");
        mainMenuPage = new MainMenuPage(driver);
    }

    @When("^I navigate to the User Information screen$")
    public void navigateToUserInformationScreen(){
        mainMenuPage.navigateToUserInformationScreen();
    }


    @And("^I select ([^\"]*) category$")
    public void iSelectCategoryCategory(String category) {
        mainMenuPage.selectCategory(category);
    }


    @And("^I select ([^\"]*) subcategory$")
    public void iSelectSubcategorySubcategory(String subcategory) {
        mainMenuPage.selectSubcategory(subcategory);
    }


    @And("^I select Order History$")
    public void iSelectOrderHistory() {
        mainMenuPage.selectOrderHistory();
    }
}
