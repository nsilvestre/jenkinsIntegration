package com.company.test.steps.ANDROID;

import com.company.test.pages.ANDROID.CreateNewContactPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class CreateNewContactSteps {

    private CreateNewContactPage createNewContactPage = new CreateNewContactPage();

    @And("^I enter the first name and last name$")
    public void iEnterTheFirstNameAndLastName()
    {
        createNewContactPage.enterNameAndLastName();
    }

    @And("^I enter the phone number$")
    public void iEnterThePhoneNumber()
    {
        createNewContactPage.enterPhoneNumber();
    }

    @And("^I tap save$")
    public void iTapSave(){
        createNewContactPage.save();
    }

}
