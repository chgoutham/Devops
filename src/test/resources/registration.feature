Feature: registration
In order to Apply for New Job
As a Job Seeker
I want to register

Scenario: Valid Registration with New E-mail ID 
Given "Group1"  has enter "Group1@gmail.com" as e-mail, "ABC" as password "Hyderabad" as city and "1234567890" as phone no and Name as "Group Abridge Solution"
When Click on "Register"
Then System Display " Registration Sucessfull. Check your e-mail"
And  Send a mail with "Verification e-mail"