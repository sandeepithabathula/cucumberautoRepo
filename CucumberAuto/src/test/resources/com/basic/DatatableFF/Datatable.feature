Feature: Create account of Facebook2
As a user u need to open facebook home page and do the validations

#Scenario: Validate First Name field
#Given User need to be on Facebook login page
#When User enters user "sandy" first name
#Then User checks user "sandy" first name is present
#Then close browser

Scenario: Validate create user multiple fields2
Given User need to be on Facebook login page
When Enter following data
|userName |UserSurname |Mobile|
|Tom      |Hanks       |1234  |
|Jack     |Danial      |5678  |