Feature: Login - Simple facebook login test
    As a user
    I want to login into Facebook.

    @working
    Scenario Outline: Facebook with screenshot by exception

    Given <config> desktop browser
    And I open the browser and go to the page "https://en-gb.facebook.com/"
    When I enter email "test.automation2030@gmail.com"
    Then The Scenario will fail

    Examples:
        | config                              |
        | firefox_default_config              |