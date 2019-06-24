Feature: Visual Testing - Feature-based Comparison
  As a user
  I want to

  # Such comparison is useful in case the resulting image is rotated/scaled in comparison to the original one.
  @working
  Scenario Outline: Credit Card

    Given <config> appium driver
       | field            | data                                         |
       | appPackage       | com.android.calculator2                      |
       | appActivity      | com.android.calculator2.Calculator           |

    When I compare two images by using feature-based comparison
    Then Validate visualization image length is greater than 0 in based comparison
    Then Images should have the same Feature-based comparison
    Then I close app

    Examples:
      | config              |
      | image_based_testing |