Feature: Free CRM create contacts

Scenario Outline: Free CRM create a new contact scenario
Given "<Url>" is opened
When CRM Screen opens
Then Enter "<usename>" and "<paswd>"
Then Hit on the logon
Then user moves to new contact page
Then user types <Firstname> and <lastname> and <position>
Then close the browser

Examples:
       |             Url             | usename         | paswd      |Firstname  | lastname | position |
       | https://classic.crmpro.com/ | batchautomation | Test@12345 | sasi | soumi | HR |
       | https://classic.crmpro.com/ | batchautomation | Test@12345 | mani | tej   | HR |
       
