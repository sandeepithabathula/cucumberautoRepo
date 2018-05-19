Feature: Create account of Facebook9
As a user u need to open facebook home page and do the validations

Scenario: Validate First Name field9
Given User need to be on Facebook login page
When User enters user "sandy" first name
Then User checks user "sandy" first name is present


Scenario: Validate create user multiple fields9
Given User need to be on Facebook login page
When User enters user "sandy" first name
And User enters user "babu" surname
Then User checks user "sandy" first name is present
Then User Mobile field should be blank
