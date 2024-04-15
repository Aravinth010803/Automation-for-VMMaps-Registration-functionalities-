Feature: Validation of VMmaps Web aplication of Forgot page

Scenario: Validation of forgot password valid OTP

Given user Launch the VMmaps web application

When user enter valid EmailId and Click on forgot password link
Then user able to view the OTP page and enter valid OTP
And  user able to view the again login page 
When user enter valid password and click on login button
Then user able to view the homepage

Scenario: Validation of forgot password Invalid EmailId

Given user Launch the VMmaps web application
When user enter Invalid EmailId and Click on forgot password link
Then user able to view the user not found error message

