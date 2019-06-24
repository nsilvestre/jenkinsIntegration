Feature: Login - Simple facebook login test
    As a user
    I want to login into Facebook.

    @working
    Scenario Outline: <config> - User inputs correct username and password

    Given <config> desktop browser
    And I open the browser and go to the page "https://en-gb.facebook.com/"
    When I enter email "diego.diazz.2200@gmail.com"
    And I enter password "test123456!"
    And I click the login button
    Then Another page appears

    Examples:
        | config                              |
        | firefox_default_config              |
        | firefox_headless_config             |
        | chrome_default_config               |
        | chrome_headless_config              |
        | chrome_mobile_emulated_config       |