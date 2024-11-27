Feature: Apply Discount Codeeeeee

  Scenario: Apply an expired discount code
    Given the user is on the checkout page
    When the user enters an expired discount code
    And user give below details
      | us1 | pw1 |
      | us2 | pw2 |
      | us3 | pw3 |
      | us4 | pw4 |
        
