Feature: flipkart test

Scenario Outline: flipkart testing
Given login to the site side
When enter deptt name <depname>
And enter country name <countryname>
And enter state "Delhi"



Examples:
|depname            |countryname|
|CS                 |India|
|IT                 |Russia|
|EC                 |China|    


Scenario: amazon testing
Given check order history
When enter orderno



 