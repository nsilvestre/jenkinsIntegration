Feature: Android - EMULATOR-WEBUI
   As a user
   I want to

   @working
   Scenario Outline: Android Emulator - <config> - Login to Facebook

   Given <config> appium driver
     | field            | data             |
     | browserName      | chrome           |

   And I open the mobile browser and go to the page "https://m.facebook.com/"
   When I enter email "aeparra@belatrixsf.com" by using mobile
   And I enter password "BelatrixSF" by using mobile
   And I click the login button by using mobile
   Then Another page appears by using mobile

   Examples:
     | config                                      |
     | android_nexus6_android7.1.1_default_config  |
