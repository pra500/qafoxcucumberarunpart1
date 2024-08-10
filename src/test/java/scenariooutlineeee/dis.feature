Feature: Calculate billing amount

  Scenario Outline: billing amount
    Given user is on billing page
    When user enters billing amount <billingamount>
    When user enters tax amount <taxamount>

    Examples: 
      | billingamount | taxamount |
      |          11 |        12 |
      |          13 |        14 |
