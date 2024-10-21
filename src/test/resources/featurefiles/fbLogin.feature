Feature: Checking the login functionality of facebook page
@sanity
Scenario: Login the page using valid credentials

Given User launches the fb url 

When user enters the username

And user enters the password

And user clicks on login button

Then user should be logged in successfully