Feature: Validate Login Functionality

  Scenario: Valid login with admin credentials
    Given user is on login page
    When user enters username "Admin" and password "admin123"
    And user clicks on login button
    Then user is navigated to dashboard page

  Scenario Outline: Invalid login shows error message
    Given user is on login page
    When user enters username "<username>" and password "<password>"
    And user clicks on login button
    Then error message "<error>" should be displayed

    Examples:
      | username | password | error               |
      | Admin123 | admin123 | Invalid credentials |
      | Admin    | admin111 | Invalid credentials |
      | Admin123 | admin456 | Invalid credentials |
      |          |          | Required            |
