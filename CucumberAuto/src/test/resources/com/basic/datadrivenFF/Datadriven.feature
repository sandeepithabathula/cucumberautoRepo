Feature: Create account of Facebook1
As a user u need to open facebook home page and do the validations

#Scenario: Validate First Name field
#Given User need to be on Facebook login page
#When User enters user "sandy" first name
#Then User checks user "sandy" first name is present
#Then close browser

Scenario Outline: Validate create user multiple fields1
Given User need to be on Facebook login page
When User enters user "<user>" first name
And User enters user "<surname>" surname
Then User checks user "<user>" first name is present
Then User Mobile field should be blank
Then close browser
Examples:
  |user   |surname |mobile |
  |Tom    |Jerry   |123    |
  |Lorren |hady    |456    |