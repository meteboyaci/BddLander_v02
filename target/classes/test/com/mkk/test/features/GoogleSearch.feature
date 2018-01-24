Feature: Google Search
  This feature deals with the functionality of the application

  @Features
  Scenario: Google Search
    Given I ensure that the home page opened
    And I enter the following on the Google search text field
      | searchKey     |
      | testlander    |
    And I submit the searchKey