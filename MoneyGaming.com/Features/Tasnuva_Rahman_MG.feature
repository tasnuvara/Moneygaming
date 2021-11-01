Feature: Password Acceptence Criteria

Scenario Outline: Unsuccessful password

Given user on the Signup Page
And user enters email address <email> 
And user enters password <password>
And user clicks Submit button
Then error message displayed for missing Characters
And user returns back on Signup page

Examples:
|email|password|
|abc@xyz.com|x@123|
|abc@xyz.com|xy123|
|abc@xyz.com|xy@abc|
|abc@xyz.com|xy@123|