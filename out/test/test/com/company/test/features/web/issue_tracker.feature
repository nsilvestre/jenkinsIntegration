Feature: Web - Redmine testing
    As a user
    I want to create an issue in the application.

    @working
    Scenario Outline: <config> - User inputs correct username and password

    Given <config> desktop browser
    And I open the browser and go to the "http://192.168.7.240:82/redmine/login"
    When I enter username "automation"
    And I enter pass "12345678"
    And I click on the login btn
    And I validate My Page

    Examples:
        | config                              |
        | firefox_default_config              |
        | firefox_headless_config             |
        | chrome_default_config               |
        | chrome_headless_config              |
        | chrome_mobile_emulated_config       |