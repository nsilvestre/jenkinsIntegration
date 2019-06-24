Feature: Soap testing
  As a user
  I want to...

  @working
  Scenario Outline: User calls web service to sum 2 numbers and validate the result
    Given <config> Handler for "soap"
    When I sum the number 2 and the number 5 in the calculator
    Then I should validate the result of the sum

    Examples:
      | config                   |
      | soap_default_config      |


  @working
  Scenario Outline: User calls web service and use an specific webendpoint
     Given <config> Handler for "soap"
     When I use "getCalculatorSoap12" webEndpoint
     And  I sum the number 2 and the number 5 in the calculator
     Then I should validate the result of the sum

     Examples:
       | config                   |
       | soap_default_config      |


  @working
  Scenario Outline: User uses a specific method for the web service
    Given <config> Handler for "soap"
    When I call web service using "multiply" method
    Then I should validate the result of the multiplication

    Examples:
      | config                   |
      | soap_default_config      |


  @working
  Scenario Outline: User gets all ports
    Given <config> Handler for "soap"
    When I get all ports
    Then I should validate the ports

    Examples:
      | config                   |
      | soap_default_config      |