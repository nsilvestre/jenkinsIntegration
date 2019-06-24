package com.company.test.steps.EATSA;

import com.company.test.pages.EATSA_iOS.EnterYourNameAlertPage;
import com.company.test.pages.EATSA_iOS.UserInformationPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class UserInformationSteps {

    private final com.company.framework.utils.Context context;
    private AppiumDriver driver;
    private UserInformationPage userInformationPage;
    private EnterYourNameAlertPage enterYourNameAlertPage;

    public UserInformationSteps(com.company.framework.utils.Context context){
        this.context = context;
        driver = (AppiumDriver) context.getValue("driver");
        userInformationPage = new UserInformationPage(driver);
        enterYourNameAlertPage  = new EnterYourNameAlertPage(driver);
    }


    @Then("^User Information Screen is shown$")
    public void isUserInformationShown(){
        assertThat(userInformationPage.isScreenShown());
    }


    @And("^I tap the name$")
    public void tapNameField() {
        userInformationPage.tapNameField();
    }


    @And("^I tap the email$")
    public void tapEmailField() {
        userInformationPage.tapEmailField();
    }


    @And("^I enter a name and last name$")
    public void enterNameAndLastName() {
        enterYourNameAlertPage.enterFirstName();
        enterYourNameAlertPage.enterLastName();
    }


    @And("^I save the changes$")
    public void saveName() {
        enterYourNameAlertPage.saveChanges();
    }


    @Then("^the name is saved$")
    public void theNameIsSaved() {
        assertThat(userInformationPage.validateNameIsSaved());
    }


    @And("^I tap Close button$")
    public void tapCloseButton() {
        userInformationPage.tapClose();
    }


    @Then("^MainMenu screen is shown$")
    public void mainmenuScreenIsShown() {

    }


    @And("^I enter an email$")
    public void enterAnEmail() {
        enterYourNameAlertPage.enterEmail();
    }


    @Then("^the email is saved$")
    public void emailIsSaved() {
        assertThat(userInformationPage.validateEmailIsSaved());
    }


    @And("^I tap Log Out - Cancel Order$")
    public void tapLogOut() {
        userInformationPage.tapLogOut();
    }


    @Then("^LogOut alert is shown$")
    public void logoutAlertIsShown() {
        assertThat(userInformationPage.isLogOutAlertShown());
    }
}
