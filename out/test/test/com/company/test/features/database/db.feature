Feature: Database testing
  As a user
  I want to...

  @working
  Scenario Outline: User insert a product

    Given <config> Handler for "DB"
    When I insert a product
    Then should validate and compare with the expected dataset

    Examples:
      | config                   |
      | db_default_config        |


  @working
  Scenario Outline: User delete a product

    Given <config> Handler for "DB"
    When I delete a product by id 1
    Then should validate expected result with rowcount 0

    Examples:
      | config                   |
      | db_default_config        |


  @working
  Scenario Outline: User search a product and compare xml files

    Given <config> Handler for "DB"
    When I insert a products
    Then should validate using xml files

    Examples:
      | config                   |
      | db_default_config        |


  @working
  Scenario Outline: User execure a store procedure

    Given <config> Handler for "DB"
    When I execute the store procedure "getProductById"
    Then should validate expected result with rowcount 1

    Examples:
      | config                   |
      | db_default_config        |


  @working
  Scenario Outline: User get structure of the table and validate the fields

    Given <config> Handler for "DB"
    When I get structure of the table "product"
    And should validate name, type and primary key of the fields

    Examples:
      | config                   |
      | db_default_config        |


  @working
  Scenario Outline: User search a product

    Given <config> Handler for "DB"
    When I search a product by id 1
    Then should find the product

    Examples:
      | config                   |
      | db_default_config        |


  @working
  Scenario Outline: User check if table is empty

    Given <config> Handler for "DB"
    When I count the rows in the search
    Then should validate expected result with rowcount 0

    Examples:
      | config                   |
      | db_default_config        |

  @working
  Scenario Outline: User get structure of the table and validate the number of fields

    Given <config> Handler for "DB"
    When I get structure of the table "product"
    Then should validate that number of fields is 7

    Examples:
      | config                   |
      | db_default_config        |


  @working
  Scenario Outline: User check if a column exists in the table

    Given <config> Handler for "DB"
    When I search the column "price" in the table "product"
    Then should validate if exists

    Examples:
      | config                   |
      | db_default_config        |


  @working
  Scenario Outline: User check if a table exists in the database
    Given <config> Handler for "DB"
    When I search the table "product" in the database
    Then should validate if exists

    Examples:
      | config                   |
      | db_default_config        |


  @working
  Scenario Outline: User check if a PK is FK in a table and remaining

    Given <config> Handler for "DB"
    When I search a Foreign Key in "sales" and others tables
    Then should validate dependences

    Examples:
      | config                   |
      | db_default_config        |
