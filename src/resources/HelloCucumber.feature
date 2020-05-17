# This is a feature
  Feature: Login feature

    Scenario: Login with valid credentials

      Given I navigate to google.com
      And I click on login button
      When I enter userId and password
      And I click on login button
      Then I should see the welcome massage

    Scenario: Login with valid credentials

      Given I navigate to google.com
      And I click on login button
      When I enter wrong userId and password
      And I click on login button
      Then I should see the error massage
