Feature: Button Click Functionality

  Scenario: Click the submit button on a form
    Given the user is on the form page
    When the user clicks the "Submit" button
    Then the form should be submitted successfully
    And the user should see a confirmation message "Form submitted successfully!"



  Scenario: Test that the webpage loads successfully
    Given the user navigates to the URL "https://example.com"
    Then the webpage should load successfully
    And the URL should be "https://example.com"
    And the page title should be "Example Domain"
