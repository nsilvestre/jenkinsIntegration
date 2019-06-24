package com.company.test.steps.ContactsAppSteps;

import com.company.test.pages.ContactsApp.NewContactPage;
import cucumber.api.java.en.And;

public class AddContactSteps {

    private NewContactPage newContactPage = new NewContactPage();

    @And("^I enter the First Name$")
    public void iEnterTheFirstName(){
        newContactPage.enterFirstName();
    }

    @And("^I enter the Last Name$")
    public void iEnterTheLastName(){
        newContactPage.enterLastName();
    }

    @And("^I enter the Company$")
    public void iEnterTheCompany(){
        newContactPage.enterCompany();
    }

    @And("^I tap Done button$")
    public void iTapDoneButton() {
        newContactPage.tapDone();
    }
}
