Feature: user registration testing

Scenario: user registration validation

Given user enters below details 
|firstname     |Tom1|
|lastname      |Gupta1|
|email         |Toee@123R@gmail.com|
|pwd           |Toeee@345|
|confirmpwd    |Toeee@345|
And select privacy policy
And click on continue btn
Then user should be able to register successfully
 
 


