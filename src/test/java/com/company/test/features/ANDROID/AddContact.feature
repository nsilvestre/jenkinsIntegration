Feature: Add new contact

  @working
  Scenario Outline: Create contact
    Given <config> appium driver

    When I tap Add button
    And I enter the first name and last name
    And I enter the phone number
    And I tap save

    Examples:
      | config           |
      | android_emulator |

  @working
  Scenario Outline: Delete contact
    Given <config> appium driver

    When I select the contact
    And I tap the menu
    And I tap delete
    And I tap delete from the alert

    Examples:
      | config           |
      | android_emulator |
