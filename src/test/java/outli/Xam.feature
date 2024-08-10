Feature: Home Page 
 	
Scenario Outline: Check Previous Order Details
    When user clicks on Order link "<lnksss>"
    Then user checks the previous order detials <rate>
    Then user checks the open order details <finalprice>
 	 
 	
 	
 	Examples:
  | lnksss | rate | finalprice |
  | th@gmail.com | 12 | 13 |
  | th1@gmail.com | 22 | 23 |