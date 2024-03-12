Feature: to test search func
search testing

  Scenario: to test search func11
    Given login333
    When search anything "product"
    And list shown
    Then click on particular


  Scenario: to test search func12
     Given login12
     When search anything here "product12"
     And list shown12
     Then click on particular12

