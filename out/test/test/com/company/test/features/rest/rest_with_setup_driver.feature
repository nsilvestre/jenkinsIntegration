Feature: REST - Redmine REST testing
    As a user
    I want to login in the application.


    @working
    Scenario Outline: User calls web service to create an issue request

      Given <config> Handler for "Rest"
      Given ResponseFormat in ".json"
      When I send an insert issue request to the server
      Then validate that status code is 201

      Examples:
        | config                   |
        | rest_default_config      |


    @working
    Scenario Outline: User calls web service to update an issue request

      Given <config> Handler for "Rest"
      Given ResponseFormat in ".json"
      When I send an update issue request to the server with id equal to 324
      Then validate that status code is 200

      Examples:
        | config                   |
        | rest_issue_config        |


    @working
    Scenario Outline: User calls web service to delete an issue request

      Given <config> Handler for "Rest"
      Given ResponseFormat in ".json"
      When I send an delete issue request to the server with id 1
      Then validate that status code is 200

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


    @working
    Scenario Outline: User calls web service to get an issue and validate xml schema

      Given <config> Handler for "Rest"
      Given ResponseFormat in ".xml"
      When I get issues from redmine with id equal to 10
      Then validate xml response with the following schema "schemas/issues_xsd_schema.xsd"

      Examples:
        | config                   |
        | rest_issue_config        |


    @working
    Scenario Outline: User calls web service to get a issue by its id

      Given <config> Handler for "Rest"
      Given ResponseFormat in ".json"
      When I get issues from redmine with id equal to 10
      Then validate that status code is 200
      Then I validate response data
        | issue.id               | 10                    |
        | issue.project.id       | 1                     |
        | issue.project.name     | PYTHON TAS            |
        | issue.tracker.id       | 3                     |
        | issue.tracker.name     | Support               |
        | issue.subject          | Description Updated 1 |
        | issue.description      | Description Updated 1 |
        | issue.status.name      | New                   |
        | issue.priority.name    | Low                   |

      Examples:
        | config                   |
        | rest_issue_config        |
