#This is a feature
  Feature: Login feature

 #This is a positive scenario
    Scenario: Login with valid credentials

      Given I navigate to www.gmail.com
      And I click on login button
      When I enter userId and password
      And I click on login button
      Then I should to go home page

#This is a negative scenario
    Scenario: Login with valid credentials

      Given I navigate to www.gmail.com
      And I click on login button
      When I enter wrong userId and password
      And I click on login button
      Then I should see the error massage