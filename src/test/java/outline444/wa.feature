Feature: login Page

Scenario Outline: Amazon Login Page
  
    Given user is on Amazon landing page "<product>"
    And Sign in button is present on screen "<category>"
    And discount is present <dis>
    
Examples:
| product | category | dis |
| kidsware | clothes | 10 |
| spoon | kitchen |    20 |
   
    