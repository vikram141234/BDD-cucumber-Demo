#Author:Vikram

Feature: Login to Vtiger Application
 
  Scenario: Login to Vtiger Application with valid Credentials
    Given I want to launch the browser
    And I want to load the URL
    When Login Page is Displayed enter Username and Password
    And Click on Login
    Then Validate for Home Page title
    
