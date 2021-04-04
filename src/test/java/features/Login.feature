Feature: Test the login fuctionality on sdet university

#Scenario: the user should be able to login with correct username and correct password

#Given user is on the login page
#When user enters correct username and correct password
#Then user get confirmation
@SeleniumTest
Scenario Outline: the user should be able to login

Given user is on the login page
When user enters email <username>
And user enters password <password>
Then user get confirmation

Examples:
| username| password |
| test1@test.com| test |
| test2@test.com| test |
| test3@test.com| test |
