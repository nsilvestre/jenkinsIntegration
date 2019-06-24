Feature: Visual Testing - Occurrence Lookup
  As a user
  I want to

  # Such comparison is useful in case the resulting image is rotated/scaled in comparison to the original one.
  @working
  Scenario Outline: Finding Wally

    Given <config> appium driver
       | field            | data                                         |
       | appPackage       | com.android.calculator2                      |
       | appActivity      | com.android.calculator2.Calculator           |

    When I compare two images by using occurrence lookup
    Then Validate visualization image length is greater than 0 in occurrence lookup
    Then A match should be found
    Then I close app

    Examples:
      | config              |
      | image_based_testing |