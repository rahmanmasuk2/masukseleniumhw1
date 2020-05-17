#This is a feature
  Feature: Testing my framework

   @tag1
  Scenario: Add two numbers 1 and 3
    When I add both the numbers
    Then Numbers should be added

  @tag2
  Scenario: Add three numbers 1 and 3 and 5
    When I add all the numbers
    Then Numbers should be added
    And Check the result
