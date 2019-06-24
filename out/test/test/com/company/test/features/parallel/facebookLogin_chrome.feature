Feature: Login - Simple facebook login test - Chrome
    As a user
    I want to login into Facebook.

    @working
    Scenario: Chrome - User inputs correct username and password in facebook page

    Given chrome_default_config desktop browser
    And I open the browser and go to the page "https://en-gb.facebook.com/"
    When I enter email "diego.diazz.2200@gmail.com"
    And I enter password "test123456!"
    And I click the login button
    Then Another page appears
