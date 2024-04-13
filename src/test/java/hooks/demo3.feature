Feature: Order Page Functionality

Scenario: Place Order with Valid Items
    Given I am on the order page
    When I select valid items
    And I provide valid shipping information
    And I proceed to place the order
    Then I should receive a confirmation message
    Then I should receive a confirmation message1
    
    
@regression  
Scenario: View Purchase History
    Given I am logged in to the application
    When I navigate to the history page
    Then I should see a list of my purchase history
    
    

   
     Scenario: View Product Details
    Given I am on the product page
    When I select a product
    Then I should see the product details

