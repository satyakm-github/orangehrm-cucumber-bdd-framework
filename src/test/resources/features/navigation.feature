Feature: Module navigation from global search

  @RequiresLogin
  Scenario Outline: Navigate to module from global search
    When user enters a "<module>" name in global search
    And user clicks on "<module>"
    Then "<module>" page should be displayed

    Examples:
      | module      |
      | Leave       |
      | PIM         |
      | Recruitment |
      | Directory   |
