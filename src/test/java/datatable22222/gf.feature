Feature: Login Functionality

  Scenario: Login with multiple credentials using DataTable
    Given the user is on the login page
    When the user enters the following credentials
      | username       | password     |
      | user1@test.com | password123  |
      | user2@test.com | password456  |
      | user3@test.com | password789  |
    Then the login should be successful for each user
    
    
    
    
    
 