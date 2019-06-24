Feature: Android - EMULATOR-NATIVE-UI
  As a user
  I want to

  @working
  Scenario Outline: Android Emulator - <config> - Do operation with the calculator app
    Given <config> appium driver
      | field            | data                                         |
      | appPackage       | com.android.calculator2                      |
      | appActivity      | com.android.calculator2.Calculator           |
      | appWaitActivity  | com.android.calculator2.Calculator           |
      | appWaitDuration  | 3000                                         |

    When I check the operation "23+26" equal to 49
    Then I close app

    Examples:
      | config                                      |
      | android_nexus6_android7.1.1_default_config  |
