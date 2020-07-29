Feature: Choosing which menu user uses
  @sc1
  Scenario: Top account menu and my account click and use wrong creds.
    Given user should open main page
    Then user should click ACCOUNT at the top of main page
    And user should click My Account under submenu
    And Customer Login page should appear
    Given user should login with wrong credentials
    Then user should get Invalid login or password. message

  @sc2
  Scenario: Top account menu and log in click and use empty creds.
    Given user should open main page
    Then user should click ACCOUNT at the top of main page
    And user should click Log In under submenu
    And Customer Login page should appear
    Given user should login with empty credentials
    Then user should get This is a required field. message

  @sc3
  Scenario: Bottom menu click
    Given user should open main page
    Then user should click MY ACCOUNT at the bottom of main page
    And Customer Login page should appear
    Given user should login with right credentials
    Then user should land on My Account page