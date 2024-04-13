Feature: Login Functionality

@regression
  Scenario: Successfulmy Login
    Given I am on the login page
    When I enter my username and password
    And I click the login button
    Then I should be logged in successfully
