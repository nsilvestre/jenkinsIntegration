Feature: LoginFeature
  This feature will test a browser for web testing

  @working
    Scenario Outline: <config> - <device> - I can find the facebook logo
      Given <config> desktop browser
      Given <device> device
      When I open the browser and go to the page "https://en-gb.facebook.com/"
      Then I find the facebook logo and is true highlighted for 5 seconds
      And The facebook logo is present on page

      Examples:
        | config                   |  device  |
        | firefox_default_config   |  PC      |
        | chrome_default_config    |  PC      |


  @working
  Scenario Outline: <config> - <device> - I can set text on the login and password textfield
    Given <config> desktop browser
    Given <device> device
    When I open the browser and go to the page "https://en-gb.facebook.com/"
    And Found the email and password fields
    Then I write the username and password
     | username | password |
    And The facebook logo is present on page

    Examples:
      | config                   |  device  |
      | firefox_default_config   |  PC      |
      | chrome_default_config    |  PC      |


  @working
  Scenario Outline: <config> - <device> - I can do click on the login button
    Given <config> desktop browser
    Given <device> device
    When I open the browser and go to the page "https://en-gb.facebook.com/"
    And I found the login button
    Then I click on the login button
    And The facebook logo is present on page

    Examples:
      | config                   |  device  |
      | firefox_default_config   |  PC      |
      | chrome_default_config    |  PC      |

