Feature: Add new contact

  @working
  Scenario Outline: Tap + button and validate alert is shown
    Given <config> appium driver

    When I tap plus button
    And I enter the First Name
    And I enter the Last Name
    And I enter the Company
    And I tap Done button

    Examples:
      | config      |
      | simulated_iPad_air_2 |
      | iPhone8 |
      | simulated_iPad_pro |
