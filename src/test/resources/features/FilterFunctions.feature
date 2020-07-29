Feature: Filtering functionality
  @sc5
  Scenario Outline: Choose menu and filter result than validate result
    Given user should click "<Menu>" from main menu and "<Submenu>" from submeonu
    Then user should filter products according to price range between <minValue> and <maxValue>
    Then user should validate filter applied correctly
    And prices should be betwwen <minValue> and <maxValue>
  Examples:
    | Menu    |  Submenu       |  minValue    | maxValue     |
    | Sale    | View All Sale  |      100     | 200          |
    | Sale    | View All Sale  |      200     | 1000         |

