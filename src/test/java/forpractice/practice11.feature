Feature: Calculator
  As a user
  I want to use a calculator to add numbers
  So that I don't need to add myself

  Scenario Outline: Add two numbers -2 & 3
    Given I have a calculator
    When I add -2 and 3
    Then the result should be 1   
    
    
    Examples: 
    | num1 | num2 | total |
    | -2 | 3 | 1 |
    | 10 | 15 | 25 |
    | 99 | -99 | 0 |
   
