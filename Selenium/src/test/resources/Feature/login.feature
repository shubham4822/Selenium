Feature: Login page Automation

  Scenario: Check login is successful with valid creds
  Given User is on login page
  When User enters valid "<username>" and "<password>"
  And Clicks on login Button
  Then User is navigated to home page
  And Close the browser
  
  Examples:
  |username|password|
  |standard_user|secret_sauce|