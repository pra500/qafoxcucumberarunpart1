Feature: search func

Background:
And logout 

Scenario: search func testing - valid product 
Given login to opencart site
When  search for "samsung" product
And press enter
And products are displayed



Scenario: search func testing - invalid product 
Given login to opencart site
When  search for "ford" product
And press enter
And msg dispayed - "There is no product that matches the search criteria."







