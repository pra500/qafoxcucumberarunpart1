Feature: Checkout Page Functionality


  Scenario: Proceed to Checkout with Valid Items
    Given I am on the checkout page
    When I add a valid item to the cart
    And I proceed to checkout
    Then I should see the payment page