#This is a feature
  Feature: Verifies the functionality on google homepage

   Scenario: check that main elements on google homepage are displayed
     Given I lunch chrome browser
     When I open google home page
     Then I verify that the page displays search text box
     And The page displays google search button