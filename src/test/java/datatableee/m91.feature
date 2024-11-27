Feature: Login Functionality for DataTable Example

  Scenario Outline: User login with different sets of credentials
    Given the user is on the login page
    When the user enters the following credentials:
      | username       | password     |
      | user1@test.com | pass123      |
      | user2@test.com | pass456      |