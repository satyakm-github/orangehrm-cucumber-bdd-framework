Feature: Employee functionality

  @RequiresLogin
  Scenario: Add a new employee and verify it appears in Employee list
    Given user navigates to "PIM" module
    When user clicks on Add button
    And user enters firstName "kmfn014" and lastName "kmln014"
    And user clicks on Save button
    Then user navigated to personal details view
    
    When user clicks on "PIM" module
    And user enters "kmfn014"
    And user selects the newly created employee using autocomplete
    Then user clicks on Search button
    Then newly created employee should be listed in records
    
    When user clicks on edit icon
    Then user navigated to personal details view
    And enter driver license number as "0123456" 
    And select maritial status as "Married"
    And select gender as "Female"
    Then user clicks on Save button