Feature: testing of the select dd

Scenario Outline: testing of the action class
Given login to the dd <name>
And user logout <pwd>

Examples:
|name   |pwd|
|aa     |8900|
|bb     |6700|  


