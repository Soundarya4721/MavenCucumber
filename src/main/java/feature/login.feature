Feature: Login Feature of CRM
#Without examples Keyword
#Scenario: Hit the Url and enter login details
#Given "https://classic.crmpro.com/" is opened
#When CRM Screen opens
#Then Enter "batchautomation" and "Test@12345"
#And Hit on the logon
 
#With Examples keyword
Scenario Outline: Hit the Url and enter login details
Given "<Url>" is opened
When CRM Screen opens
Then Enter "<usename>" and "<paswd>"
Then Hit on the logon
Then close the browser

Examples:
    |Url|usename|paswd|
    |https://classic.crmpro.com/|batchautomation|Test@12345|
    |https://classic.crmpro.com/|soundarya|1234|
  