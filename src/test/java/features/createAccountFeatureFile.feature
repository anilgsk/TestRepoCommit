Feature: Create Account Feature File

Scenario: Automation for create Account
Given User is on login page "https://login.salesforce.com"
And User click on toggle menu button from left corner
And Click view All and click Sales from App Launcher
And Click on Accounts tab 
And Click on New button
And Enter "Abinaya" as account name
And Select Ownership as Public
And Click save
Then verify Account name created

