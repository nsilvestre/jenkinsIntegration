Feature: I want to test the sikuli helper on iOS devices

  @working
  Scenario Outline: <config> - Mobile Simulator iOS web - I can find the facebook logo

  Given <config> appium driver
     | field            | data             |
     | browserName      | safari           |

  Given <platform> platform
  When I open the mobile browser and go to the page "https://m.facebook.com/"
  Then I find the mobile facebook logo and is true highlighted for 5 seconds
  And Another mobile page appears

  Examples:
     | config                                | platform |
     | ios_simulator_iphone7_default_config  |  iOS     |

#  @working
#  Scenario Outline: <browserName> - Mobile Simulator iOS web - I can find the facebook logo
#    Given Setup driver
#      | field           | data             |
#      | $DRIVER_ID      | 1                |
#      | @APPIUM_GROUP   | ################ |
#      | browserName     | <browserName>    |
#      | automationName  | <AutomationName> |
#      | platformName    | <PlatformName>   |
#      | platformVersion | <PlatformVersion>|
#      | deviceName      | <DeviceName>     |
#      | noReset         | false            |
#      | useNewWDA       | true             |
#      | newCommandTimeout |       60000    |
#    When I open the mobile browser and go to the page "https://m.facebook.com/" by using driver 1
#    Then I find the mobile facebook logo and is true highlighted for 5 seconds by using driver 1
#    And Another mobile page appears by using driver 1
#    Examples:
#      | browserName   | AutomationName  | PlatformName    | PlatformVersion | DeviceName      |
#      | Safari        |   XCUITest      |     iOS         |       11.2      |  iPhone 7       |



#  @working
#  Scenario Outline: <config> - Mobile Simulator iOS web - I can find the facebook logo
#
#  Given <config> appium driver
#     | field            | data             |
#     | browserName      | safari           |
#
#  Given <platform> platform
#  When I open the mobile browser and go to the page "https://m.facebook.com/"
#  And Found the email and password fields by using mobile
#  Then I write the username and password by using mobile
#    | username | password |
#  And Another mobile page appears
#
#  Examples:
#     | config                                | platform |
#     | ios_simulator_iphone7_default_config  |  iOS     |

#  @working
#  Scenario Outline: <browserName> - Mobile Simulator iOS web - I can set text on the login and password textfield
#    Given Setup driver
#      | field           | data             |
#      | $DRIVER_ID      | 1                |
#      | @APPIUM_GROUP   | ################ |
#      | browserName     | <browserName>    |
#      | automationName  | <AutomationName> |
#      | platformName    | <PlatformName>   |
#      | platformVersion | <PlatformVersion>|
#      | deviceName      | <DeviceName>     |
#      | noReset         | false            |
#      | useNewWDA       | true             |
#      | newCommandTimeout |       60000    |
#    When I open the mobile browser and go to the page "https://m.facebook.com/" by using driver 1
#    And Found the email and password fields by using mobile driver 1
#    Then I write the username and password by using mobile driver 1
#      | username | password |
#    And Another mobile page appears by using driver 1
#    Examples:
#      | browserName   | AutomationName  | PlatformName    | PlatformVersion | DeviceName      |
#      | Safari        |   XCUITest      |     iOS         |       11.2      |  iPhone 7       |


