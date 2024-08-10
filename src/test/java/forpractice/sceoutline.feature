Feature: the testing creds

  Scenario Outline: the testing creds1
  
  Given enter for db access <creds11>
  Then enter for prod server access <creds12>
    
    Examples:
    | creds11 | creds12 |
    | prg | pra17@123 |
    | gup | pra17@1234 |


