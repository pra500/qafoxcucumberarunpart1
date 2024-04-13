Feature: chechkout testing

Scenario Outline: my checkout testing
Given chkout page <pagename>
And chkout history "hiid"
And chkout history1 "hiidt"
And chkout history2 "hiidtt"



Examples:
|pagename       |
|page1           |
|page2           |





