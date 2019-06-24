Feature: iOS - Real Device-App Native
   As a user
   I want to :

     @working
     Scenario Outline: <config> - Mobile Real Device iOS web - User inputs login data

     Given <config> appium driver
       | field            | data                          |
       | browserName      | safari                        |
       | xcodeSigningId   | iPhone Developer              |
       | xcodeOrgId       | AEMHB5RHQM                    |

     And I open the mobile browser and go to the page "https://m.facebook.com/"
     When I enter email "username1" by using mobile
     And I enter password "password1" by using mobile
     And I click the login button by using mobile
     Then Another page appears by using mobile

     Examples:
       | config                                      |
       | ios_real_device_iphone7plus_default_config  |