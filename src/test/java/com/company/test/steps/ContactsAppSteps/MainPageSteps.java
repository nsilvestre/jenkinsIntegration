package com.company.test.steps.ContactsAppSteps;

import com.company.test.pages.ContactsApp.MainPage;
import cucumber.api.java.en.When;

public class MainPageSteps {

    MainPage mainPage = new MainPage();

    @When("^I tap plus button$")
    public void iTapPlusButton(){
        mainPage.tapPlusButton();
    }


}
