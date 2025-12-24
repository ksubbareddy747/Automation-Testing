Feature: Login functionality

Scenario: check login functionality with valid data
  Given User is on Login Page
  When User enters valid username and password
  And User click on Login button
  Then User should navigate to Dashboard
  
 