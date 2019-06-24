Feature: Set up the environment selecting the Partner and its environment

  @working
  Scenario Outline: Scenario 1
    Given <config> appium driver


    Examples:
      | config      |
      | simulated_iPad_air_2 |

  @working
  Scenario Outline: Scenario 2
    Given <config> appium driver


    Examples:
      | config      |
      | simulated_iPad_air_2 |