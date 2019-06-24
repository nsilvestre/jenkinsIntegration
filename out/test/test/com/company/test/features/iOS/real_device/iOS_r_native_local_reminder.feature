Feature: iOS - Real Device-App Native
   As a user
   I want to :

     @working
     Scenario Outline: <config> - iOS Real Device - I want to set a reminder without a reminder date

     Given <config> appium driver
       | field            | data                          |
       | bundleId         | com.apple.reminders           |

     And The Reminder App is open
     When I click on the Add Reminder button
     And Select create New reminder
     And I fill the reminder data and click on the Done button
       | MyReminder | low | these are the reminder notes |

     Then The reminder is successfully created

     Examples:
       | config                                      |
       | ios_real_device_iphone7plus_default_config  |