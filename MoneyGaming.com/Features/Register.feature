Feature: Join Now

Scenario: Successful registration with valid Credentials

Given User Launch Chrome Brower
When User Opens moneygaming 
Then User Click on Join Now Link
And User Select Title Value from the dropdown
And User Enter First Name and Surname
And User Click the Tickbox 
When User Click Join Now Link
Then Page message Should be This Field is required under Date of Birth Box
And Close Brower
