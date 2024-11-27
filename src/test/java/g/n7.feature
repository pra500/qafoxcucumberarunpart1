Feature: Product inventory Validation

  Scenario: Validate prices for ecom app
    Given the user sign out
    When the user enters the following:
      | productName   | expectedPrice |
      | Laptop        | 1200          |
      | Smartphone    | 800           |
      | Headphones    | 100           |
      | Monitor       | 300           |
    Then the price should match the expected value for each inventory
