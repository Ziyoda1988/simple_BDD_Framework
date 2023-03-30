# simple_BDD_Framework
  Feature: As a registered user, I should be able to login using the login

Scenario: Positive login
  Given I am on home page
  When I enter valid username and password
  Then I should be logged in
