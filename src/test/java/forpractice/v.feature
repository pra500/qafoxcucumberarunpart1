Feature: E-commerce Application Sanity Testing

  Scenario: Verify Home Page Loads Successfully
    Given the user navigates to the home page
    Then the home page should load successfully
    And the user should see the website logo
    And the user should see the search bar
    And the user should see the main navigation menu
