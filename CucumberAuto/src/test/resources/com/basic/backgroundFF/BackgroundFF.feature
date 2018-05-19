Feature: Create account of Facebook
As a user u need to open facebook home page and do the validations

Background:
Given User need to be on Facebook login page
When User enters user "sandy" first name
Then User checks user "sandy" first name is present


Scenario: Validate First Name field
#Given User need to be on Facebook login page
#When User enters user "sandy" first name
#Then User checks user "sandy" first name is present
Then close browser

Scenario: Validate create user multiple fields
#Given User need to be on Facebook login page
#When User enters user "sandy" first name
And User enters user "babu" surname
#Then User checks user "sandy" first name is present
Then User Mobile field should be blank
Then close browser