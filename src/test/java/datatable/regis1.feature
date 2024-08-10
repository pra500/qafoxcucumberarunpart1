Feature: Event registration testing

  Scenario: Event registration validation
    Given enter below info
      | firstname | Pragti   |
      | DOB       | 12-05-93 |
      | age       |       23 |
    When click on submit button
    Then registartion successful
