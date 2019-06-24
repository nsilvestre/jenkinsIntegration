Feature: Web - Redmine testing - Chrome
    As a user
    I want to create an issue in the application.

    @working
    Scenario: Chrome - User inputs correct username and password in issue tracker page

    Given chrome_default_config desktop browser
    And I open the browser and go to the "http://192.168.7.240:82/redmine/login"
    When I enter username "automation"
    And I enter pass "12345678"
    And I click on the login btn
    And I validate My Page
