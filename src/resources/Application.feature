#This is a feature
  Feature: Log in to the application

  Scenario: Login to application as valid user
    When user enter valid credentials
    And click on login
    Then home page should be displayed

  Scenario: Login to application as invalid user
    When user enter the invalid credentials
    And click on login
    Then error massage should be displayed