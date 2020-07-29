Feature: Filtering functionality
  @sc5
  Scenario Outline: Choose menu and filter result than validate result
    Given user should click "<Menu>" from main menu and "<Submenu>" from submenu
    Then user should filter products according to price range between $100.00 and $199.99
    Then user should validate filter applied correctly
  Examples:
    | Menu    |  Submenu       |
    | Sale    | View All Sale  |
    | Women   | View All Women |

