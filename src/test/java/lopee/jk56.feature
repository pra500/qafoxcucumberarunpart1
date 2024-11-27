Feature: OpenCart Website Functionality

  @sanity
  Scenario: Verify the homepage is loaded successfully
    Given the user navigates to the OpenCart homepage
    Then the page title should be "Your Store"

  @smoke
  Scenario: Search for a product
    Given the user is on the OpenCart homepage
    When the user searches for a product "iPhone"
    Then the search results should be displayed
    And the product "iPhone" should be listed in the search results

  @smoke
  Scenario: Add a product to the cart
    Given the user is on the OpenCart homepage
    When the user searches for a product "MacBook"
    And the user adds the product "MacBook" to the cart
    Then the product "MacBook" should be added to the shopping cart
    And the cart should show "1 item"

  @regression
  Scenario: Verify the navigation to the 'Tablets' category
    Given the user is on the OpenCart homepage
    When the user clicks on the "Tablets" category
    Then the Tablets category page should be displayed
