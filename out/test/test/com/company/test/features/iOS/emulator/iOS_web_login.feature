Feature: iOS Demo Feature
  This feature is to represent the basic flow of mobile automated testing using appium on iOS

   @working
   Scenario Outline: <config> - Mobile Simulator iOS web

   Given <config> appium driver
     | field            | data             |
     | browserName      | safari           |

   And I open the mobile browser and go to the page "https://m.facebook.com/"
   When I enter email "aeparra@belatrixsf.com" by using mobile
   And I enter password "BelatrixSF" by using mobile
   And I click the login button by using mobile
   Then Another page appears by using mobile

   Examples:
     | config                                |
     | ios_simulator_iphone7_default_config  |