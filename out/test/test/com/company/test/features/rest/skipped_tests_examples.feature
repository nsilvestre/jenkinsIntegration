Feature: REST - Example of skipped scenarios
  As a user
  I want to...

  @Broken
  Scenario Outline: Example-Broken

    Given <config> Handler for "Rest"
    Given ResponseFormat in ".json"
    When I get issues from redmine with id equal to 10
    Then validate json response with the following schema "schemas/issues_schema.json"

    Examples:
      | config                   |
      | rest_issue_config        |


  @OutOfScope
  Scenario Outline: Example-MissingSpecs

      Given <config> Handler for "Rest"
      Given ResponseFormat in ".json"
      When I get issues from redmine with id equal to 10
      Then validate json response with the following schema "schemas/issues_schema.json"

      Examples:
        | config                   |
        | rest_issue_config        |


  @NotImplementedYet
  Scenario Outline: Example-NotImplementedYet

    Given <config> Handler for "Rest"
    Given ResponseFormat in ".json"
    When I get issues from redmine with id equal to 10
    Then validate json response with the following schema "schemas/issues_schema.json"

    Examples:
      | config                   |
      | rest_issue_config        |


  @working
  Scenario Outline: Example-Failed

    Given <config> Handler for "Rest"
    Given ResponseFormat in ".json"
    When I get issues from redmine and fail

    Examples:
      | config                   |
      | rest_issue_config        |

  @working
  Scenario Outline: User calls web service to get an issue and validate json schema

    Given <config> Handler for "Rest"
    Given ResponseFormat in ".json"
    When I get issues from redmine with id equal to 10
    Then validate json response with the following schema "schemas/issues_schema.json"

    Examples:
      | config                   |
      | rest_issue_config        |