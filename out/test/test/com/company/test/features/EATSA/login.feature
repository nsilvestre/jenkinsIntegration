Feature: configure environment and login
  As a user
  I want to login
  So that I can start the order process

  @working
  Scenario Outline: <config>

    Given config page is open
    And environment is selected
    And store is selected
    And payment is selected
    And changes are saved

    When I swipe to login

    Then The main menu screen is shown

    Examples:
      | config      |
      | eatsa_iPad  |