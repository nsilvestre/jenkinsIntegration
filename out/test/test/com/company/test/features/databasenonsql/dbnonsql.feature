Feature: Database Non Sql testing
  As a user
  I want to...

  @working
  Scenario Outline: User insert a document in the collection
    Given <config> Handler for "DBNonSql"
    When I insert a document in the collection
    Then I must validate existence

    Examples:
      | config                   |
      | dbnonsql_default_config  |


  @working
  Scenario Outline: User find first matched document in the collection
    Given <config> Handler for "DBNonSql"
    When I find first matched document
    Then I must validate fields of the document

    Examples:
      | config                   |
      | dbnonsql_default_config  |


  @working
  Scenario Outline: User search all documents with specific name in the collection
    Given <config> Handler for "DBNonSql"
    When I search all documents by name equal to "TV Led 42 pulgadas"
    Then I must validate that number of results is 1

    Examples:
      | config                   |
      | dbnonsql_default_config  |


  @working
  Scenario Outline: User search a document by id and validate with a schema json file
    Given <config> Handler for "DBNonSql"
    When I search a document by id equal to 1
    Then I must validate schema json file

    Examples:
      | config                   |
      | dbnonsql_default_config  |


  @working
  Scenario Outline: User validate if the collection exists
    Given <config> Handler for "DBNonSql"
    When I search the collection "products"
    Then I must validate if exists

    Examples:
      | config                   |
      | dbnonsql_default_config  |


  @working
  Scenario Outline: User delete a document by id in the collection
    Given <config> Handler for "DBNonSql"
    When I delete a document by id equal to 1
    Then I must validate that number of results is 0

    Examples:
      | config                   |
      | dbnonsql_default_config  |


  @working
  Scenario Outline: User validate if the collection is empty
    Given <config> Handler for "DBNonSql"
    When I search the collection "products"
    Then I must validate if it is empty

    Examples:
      | config                   |
      | dbnonsql_default_config  |