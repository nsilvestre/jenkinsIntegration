Feature: Visual Testing - Similarity Calculation
  As a user
  I want to

  # Such comparison is useful in case the resulting image is rotated/scaled in comparison to the original one.
  @working
  Scenario Outline: Checking similarity

    Given <config> appium driver
       | field            | data                                         |
       | appPackage       | com.android.calculator2                      |
       | appActivity      | com.android.calculator2.Calculator           |

    When I compare two images by using similarity calculation
    Then Validate visualization image length is greater than 0 in similarity calcularion
    Then Similarity score should be greater than 0
    Then I close app

    Examples:
      | config              |
      | image_based_testing |