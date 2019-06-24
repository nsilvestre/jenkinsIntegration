Feature: I want to test the Reminder native app on iOS devices

  @working
  Scenario Outline: <config> - iOS Simulator - I want to navigate all the options

  Given <config> appium driver
     | field            | data                                                              |
     | app              | /Users/gmarkulin/JAVA_TAS/java_repo_small/lfs/iOSApp/YouTube.app  |

  And The app is open using mobile
  When I click on all the options using mobile
  Then The app navigates all the options successfully using mobile

  Examples:
    | config                                |
    | ios_simulator_iphone7_default_config  |