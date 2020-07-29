Feature: Testing search functionality
  @sc4
  Scenario Outline: Create a search activity with available product
    Given user should be on url
    Then user should write "<KeyName>" into search box
    And user should click search button
    And user should locate "<ProductName>" in list and click
    Given user should choose "<Color>" and "<Size>" and add it to cart
    Then user should validate "<ProductName>" has been added to cart
   Examples:
    | KeyName    | ProductName                 | Color   | Size |
    | shirt      |Slim fit Dobby Oxford Shirt  | Blue    | XS   |