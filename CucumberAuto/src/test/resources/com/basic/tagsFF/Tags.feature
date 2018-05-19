@Important
Feature: Create account of Facebook10
As a user u need to open facebook home page and do the validations

@Smoke
Scenario: Validate First Name field111
Given User need to be on Facebook login page
When User enters user "sandy" first name
Then User checks user "sandy" first name is present
Then close browser

@Smoke @Regression
Scenario: Validate create user multiple fields212
Given User need to be on Facebook login page
When User enters user "sandy" first name
And User enters user "babu" surname
Then User checks user "sandy" first name is present
Then User Mobile field should be blank
Then close browser

Scenario: Validate First Name field313
Given User need to be on Facebook login page
When User enters user "sandy" first name
Then User checks user "sandy" first name is present
Then close browser

@Regression
Scenario: Validate First Name field414
Given User need to be on Facebook login page
When User enters user "sandy" first name
Then User checks user "sandy" first name is present
Then close browser

@Smoke
Scenario: Validate First Name field515
Given User need to be on Facebook login page
When User enters user "sandy" first name
Then User checks user "sandy" first name is present
Then close browser