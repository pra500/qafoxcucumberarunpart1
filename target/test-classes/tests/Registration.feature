Feature: to test registration func
registration func working fine or not




Scenario Outline: to test registration functionality - all mandatory fields
Given user navigates to the registration page
When enter firstname
And  enter email <emailid>
And enter pwd <pwd>
And select subscribe to yes and agree to privacy policy
And click on continue button
Then the account is created successfully 

	
Examples:
|emailid            |pwd      |
|luctus.vulputate@outlook.ca          |89000      |
|justo@yahoo.com           |12345        |
|eu.placerat@aol.net           |33333      |




Scenario: Accessing Invoice Page and Retrieving Invoice Number
When user navigates to the invoice page
Then invoice number is displayed





Scenario: user navigates to the production page
When user navigates to the production page
Then production number is displayed

































