#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Login Feature
  Each user is required to use the login with a pre-registered account 
in order to login to the system.

  
  Scenario: Logging in with valid user data
    Given User is on gui
    And Presses the login button
    And Login popup opens
    When Enters a valid username
    And Enters a valid password
    And Presses on the login button 
    Then I validate the outcomes
    And check more outcomes

  