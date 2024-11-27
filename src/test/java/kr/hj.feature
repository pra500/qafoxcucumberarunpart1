Feature: Admin Page Testing

  Scenario: Navigate to the Admin page
    Given the user is on the home page
    When the user navigates to the Admin page
    Then the Admin page should be displayed

  Scenario: Verify the title of the Admin page
    Given the user is on the Admin page
    When the page is loaded
    Then the title should be "Admin Dashboard"

  Scenario: Check the login form is displayed
    Given the user is on the Admin page
    When the page is loaded
    Then the login form should be displayed

  Scenario: Access the Admin page as an unauthorized user
    Given the user is not logged in
    When the user tries to access the Admin page
    Then the user should see an "Access Denied" message

  Scenario: Access the Admin page as an authorized user
    Given the user is logged in as an "Admin"
    When the user navigates to the Admin page
    Then the Admin page should be displayed
    And the user should see "Welcome Admin" message
